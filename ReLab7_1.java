package Lab7;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class ReLab7_1 extends JFrame {
    JLabel numberLabel,numberLabel1, resultLabel,resultLabel1;
    JTextField numberField,numberField1;
    JTextArea resultArea;
    JScrollPane Pane;
    JScrollBar Bar;
    String blank5;

    public ReLab7_1() {
        super("Program display value n");

        Container container = getContentPane();
        container.setLayout(new FlowLayout());
        
        numberLabel = new JLabel("Enter integer and press Enter");
        container.add(numberLabel);
        numberField = new JTextField(10);
        container.add(numberField);

        numberLabel1 = new JLabel("Enter integer under of blank");
        container.add(numberLabel1);
        numberField1 = new JTextField(10);
        container.add(numberField1);

        //register this applet as numberField’s ActionListener
        numberField.addActionListener(
                //create inner class
                new ActionListener() {
                    public void actionPerformed(ActionEvent event) {
                        int number, sumValue;
                        //String blank5 = " ";
                        number = Integer.parseInt(numberField.getText());
                        //clear value in TextArea
                        resultArea.setText("");
                        //add data in textarea
                        for (int n = 1; n <= number; n++) {
                            resultArea.append(blank5 + Integer.toString(n));
                            if (n % 5 == 0)
                                resultArea.append("\n");
                        }
                        //clear value in numberField
                        numberField.setText("");
                    } //end method actionPerformed
                });
        //create display
        numberField1.addActionListener(
                //create inner class
                new ActionListener() {
                    public void actionPerformed(ActionEvent event) {
                        int number, sumValue;
                        blank5 = " ";
                        number = Integer.parseInt(numberField1.getText());
                        //clear value in TextArea
                        //add data in textarea
                        for (int n = 1; n <= number; n++) {
                            blank5 += " ";
                        }
                        //clear value in numberField1
                        numberField1.setText("");
                    } //end method actionPerformed
                });

        resultArea = new JTextArea(10, 20);
        resultArea.setEditable(false);
        container.add(resultArea);

        Pane = new JScrollPane(resultArea);
        container.add(Pane);
    }


    public static void main(String[] args) {
        ReLab7_1 window = new ReLab7_1();

        window.setSize(360, 280);
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.setVisible(true);
    }
}