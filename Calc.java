import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Calc extends JFrame implements ActionListener {
    private JPanel numbersPanel;
    private JPanel optionsPanel;
    
    private JTextField resultBox;

    private JButton numbers[] = new JButton[12];
    private JButton options[] = new JButton[5];

    private String numbersSet[] = { "1", "2", "3", "4", "5", "6", "7", "8", "9", "0", ".", "C" };
    private String optionsSet[] = { "+", "-", "*", "/", "=" };

    private Double operands[] = { (Double) null, (Double) null };
    private char operator = ' ';

    Calc() {
        super("Calculator");

        Initialize();
    }

    public void Initialize() {
        super.setLayout(new FlowLayout());

        numbersPanel = new JPanel();
        numbersPanel.setPreferredSize(new Dimension(450, 450));

        optionsPanel = new JPanel();
        optionsPanel.setPreferredSize(new Dimension(100, 450));

        resultBox = new JTextField(50);
        resultBox.setHorizontalAlignment(JTextField.RIGHT);
        resultBox.setPreferredSize(new Dimension(550, 50));
        resultBox.setEditable(false); 

        // Initialize Button
        for(int n = 0; n < 12; n++) {
            numbers[n] = new JButton(numbersSet[n]);
            numbers[n].setPreferredSize(new Dimension(120, 60));
            numbers[n].addActionListener(this);
        }

        for(int n = 0; n < 5; n++) {
            options[n] = new JButton(optionsSet[n]);
            options[n].setPreferredSize(new Dimension(80, 60));
            options[n].addActionListener(this);
        }

        // Add Buttons
        for(int n = 0; n < 12; n++) {
            numbersPanel.add(numbers[n]);
        }

        for(int n = 0; n < 5; n++) {
            optionsPanel.add(options[n]);
        }

        // Add Panels
        super.add(resultBox);
        super.add(numbersPanel);
        super.add(optionsPanel);

        // Show Frame
        super.setSize(600, 450);
        super.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        super.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        // Numbers
        for (int n = 0; n < 12; n++) {
            if (e.getSource() == numbers[n] && e.getSource() != numbers[11]) {
                String value = resultBox.getText() + numbersSet[n];
                resultBox.setText(value);
            }
        }

        // Clear
        if (e.getSource() == numbers[11]) {
            clear();
        }

        // Options
        if (e.getSource() == options[0]) {
            if (operands[0] == (Double) null)  {
                operands[0] = Double.parseDouble(resultBox.getText());

                resultBox.setText("");
            }

            operator = '+';
        } else if (e.getSource() == options[1]) {
            if (operands[0] == (Double) null)  {
                operands[0] = Double.parseDouble(resultBox.getText());

                resultBox.setText("");
            }

            operator = '-';
        } else if (e.getSource() == options[2]) {
            if (operands[0] == (Double) null)  {
                operands[0] = Double.parseDouble(resultBox.getText());

                resultBox.setText("");
            }

            operator = '*';
        } else if (e.getSource() == options[3]) {
            if (operands[0] == (Double) null)  {
                operands[0] = Double.parseDouble(resultBox.getText());

                resultBox.setText("");
            }

            operator = '/';
        } else if (e.getSource() == options[4]) {
            if (resultBox.getText() == "") {
                operands[1] = Double.parseDouble(resultBox.getText());
            } else {
                operands[1] = Double.parseDouble(resultBox.getText());
            }

            String result = "" + calcResult(operands[0], operands[1], operator);
            resultBox.setText(result);
        }
    }

    public double calcResult(double a, double b, char op) {
        // Check
        if (operands[0] == (Double) null) {
            return 0;
        } else if (operands[1] == (Double) null) {
            return operands[0];
        }

        // Calculate
        double result = 0;

        switch(op) {
            case '+':
                result = a + b;
                break;
            case '-':
                result = a - b;
                break;
            case '*':
                result = a * b;
                break;
            case '/':
                result = a / b;
                break;
        }

        // Clear
        clear();

        return result;
    }

    public void clear() {
        resultBox.setText("");

        operands[0] = (Double) null;
        operands[1] = (Double) null;

        operator = ' ';
    }

    public static void main(String[] args) {
        new Calc();
    }
}
