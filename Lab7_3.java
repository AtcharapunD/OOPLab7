//package Lab7;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Lab7_3 implements ActionListener {
    JLabel numberLabel;
    JTextField numberField;
    JButton btn1, btn2, btn3,btn4,btn5,btn6,btn7,btn8,btn9,btn0,btnC;
    JFrame window;

    public Lab7_3() {
        // obtain content pane and set its layout to FlowLayout
        window = new JFrame("Programm Show Text");
        Container container = window.getContentPane();
        container.setLayout(new FlowLayout());

        // create numberLabel and attach it to content pane
        numberLabel = new JLabel("Show Number : ");
        container.add(numberLabel);
        numberField = new JTextField(15);
        
        // numberField.setEditable( false );
        container.add(numberField);

        btn1 = new JButton(" 1 ");
        btn1.addActionListener(this);
        container.add(btn1);

        btn2 = new JButton(" 2 ");
        btn2.addActionListener(this);
        container.add(btn2);

        btn3 = new JButton(" 3 ");
        btn3.addActionListener(this);
        container.add(btn3);

        btn4 = new JButton(" 4 ");
        btn4.addActionListener(this);
        container.add(btn4);

        btn5 = new JButton(" 5 ");
        btn5.addActionListener(this);
        container.add(btn5);

        btn6 = new JButton(" 6 ");
        btn6.addActionListener(this);
        container.add(btn6);

        btn7 = new JButton(" 7 ");
        btn7.addActionListener(this);
        container.add(btn7);

        btn8 = new JButton(" 8 ");
        btn8.addActionListener(this);
        container.add(btn8);

        btn9 = new JButton(" 9 ");
        btn9.addActionListener(this);
        container.add(btn9);

        btn0 = new JButton(" 0 ");
        btn0.addActionListener(this);
        container.add(btn0);

        btnC = new JButton(" C ");
        btnC.addActionListener(this);
        container.add(btnC);

        window.setSize(220, 220);
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

        }  else if (event.getSource() == btn5) {
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

        }  else if (event.getSource() == btn9) {
            str += "9";
            numberField.setText(str);

        } else if (event.getSource() == btnC) {
            numberField.setText(" ");
        }



    } // end method actionPerformed

    public static void main(String[] args) {
        Lab7_3 gui = new Lab7_3();
    }
}
