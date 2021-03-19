package Lab7;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class ReLab7_3 implements ActionListener{
    JLabel numberLabel;
    JTextField numberField;
    JButton btnPer, btnCE, btn3 ,btn4,btnX,btnX2,btnRoot,btnDiv,btn7,btn8,btn9,btnMulti,btn13,
    btn5,btn6,btnMinus,btn1,btn2,btn19,btnPlus,btnDot,btnSame,btnC,btnD,btnMiplus,btn0;
    JFrame window;
    int num1 = 0,num2 = 0;
    String opr = "";

    public ReLab7_3() {
        // obtain content pane and set its layout to FlowLayout
        window = new JFrame("Calculator");
        Container container = window.getContentPane();
        container.setLayout(new FlowLayout());
        // create numberLabel and attach it to content pane
        numberLabel = new JLabel(" ");
        container.add(numberLabel);
        numberField = new JTextField(21);
        numberField.setHorizontalAlignment(SwingConstants.RIGHT);
        // numberField.setEditable( false );
        container.add(numberField);

        btnPer = new JButton(" % ");
        btnPer.addActionListener(this);
        container.add(btnPer);

        btnCE = new JButton("  CE ");
        btnCE.addActionListener(this);
        container.add(btnCE);

        btnC = new JButton("  C   ");
        btnC.addActionListener(this);
        container.add(btnC);

        btnD = new JButton("  D  ");
        btnD.addActionListener(this);
        container.add(btnD);

        btnX = new JButton("1/x");
        btnX.addActionListener(this);
        container.add(btnX);

        btnX2 = new JButton("x^2");
        btnX2.addActionListener(this);
        container.add(btnX2);

        btnRoot = new JButton("2√x");
        btnRoot.addActionListener(this);
        container.add(btnRoot);

        btnDiv = new JButton ("  /   ");
        btnDiv.addActionListener(this);
        container.add(btnDiv);

        btn7 = new JButton("  7   ");
        btn7.addActionListener(this);
        container.add(btn7);

        btn8 = new JButton("  8   ");
        btn8.addActionListener(this);
        container.add(btn8);

        btn9 = new JButton("  9   ");
        btn9.addActionListener(this);
        container.add(btn9);

        btnMulti = new JButton("  *   ");
        btnMulti.addActionListener(this);
        container.add(btnMulti);

        btn4 = new JButton("  4   ");
        btn4.addActionListener(this);
        container.add(btn4);

        btn5 = new JButton("  5   ");
        btn5.addActionListener(this);
        container.add(btn5);

        btn6 = new JButton("  6   ");
        btn6.addActionListener(this);
        container.add(btn6);

        btnMinus = new JButton("  -   ");
        btnMinus.addActionListener(this);
        container.add(btnMinus);

        btn1 = new JButton("  1   ");
        btn1.addActionListener(this);
        container.add(btn1);

        btn2 = new JButton("  2   ");
        btn2.addActionListener(this);
        container.add(btn2);

        btn3 = new JButton("  3   ");
        btn3.addActionListener(this);
        container.add(btn3);

        btnPlus = new JButton("  +   ");
        btnPlus.addActionListener(this);
        container.add(btnPlus);

        btnMiplus = new JButton("  +/-  ");
        btnMiplus.addActionListener(this);
        container.add(btnMiplus);

        btn0 = new JButton("  0   ");
        btn0.addActionListener(this);
        container.add(btn0);

        btnDot = new JButton("  .   ");
        btnDot.addActionListener(this);
        container.add(btnDot);

        btnSame = new JButton("  =   ");
        btnSame.addActionListener(this);
        container.add(btnSame);

        window.setSize(260, 280);
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.setVisible(true);
    }
    
    public void actionPerformed(ActionEvent event) {
        String str = numberField.getText();
        if (event.getSource() == btn1) {
            str += "1";
            numberField.setText(str);
            
        } else if (event.getSource() == btn2) {
            str += "2";
            numberField.setText(str);

        } else if (event.getSource() == btn3) {
            str += "3";
            numberField.setText(str);

        } else if (event.getSource() == btn4) {
            str += "4";
            numberField.setText(str);

        } else if (event.getSource() == btn5) {
            str += "5";
            numberField.setText(str);

        } else if (event.getSource() == btn6) {
            str += "6";
            numberField.setText(str);

        } else if (event.getSource() == btn7) {
            str += "7";
            numberField.setText(str);

        } else if (event.getSource() == btn8) {
            str += "8";
            numberField.setText(str);

        } else if (event.getSource() == btn9) {
            str += "9";
            numberField.setText(str);

        } else if (event.getSource() == btn0) {
            str += "0";
            numberField.setText(str);

        } else if (event.getSource() == btnC) {
            numberField.setText(" ");
            
        } else if (event.getSource() == btnD) {
            str = str.substring(0,str.length()-1);
            numberField.setText( str );

        } else if (event.getSource() == btnPlus) {
            num1 = num2;
            num2 = Integer.parseInt(str);
            opr = "+";
            str = "" ;
            numberField.setText(str);
            if (opr.equals("+")){
                num2 = num1 + num2;
                num1 = 0;
                opr = "";
                numberField.setText(Integer.toString(num2));
            }
        }
    } // end method actionPerformed
    

    public static void main(String[] args) {
        ReLab7_3 gui = new ReLab7_3();
    }
}
