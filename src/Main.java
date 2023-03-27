import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Main{

    static public class PlusMinus extends JFrame {

        JFrame frame = new JFrame();
        // qn
        JLabel first = new JLabel("enter first number");
        JLabel second = new JLabel("enter second number");
        JLabel output = new JLabel("output");
        JTextField inputFirst = new JTextField();
        JTextField inputSecond = new JTextField();
     //   JTextField showOutput = new JTextField();

        public PlusMinus(){


            frame.addMouseListener(new MouseAdapter() {
                @Override
                public void mousePressed(MouseEvent e) {
                    try {
                        String value1 = inputFirst.getText();
                        int i = Integer.parseInt(value1);
                        String value2 = inputSecond.getText();
                        int j = Integer.parseInt(value2);
                        int ans = add(i, j);
                        output.setText(String.valueOf(ans));
                    }
                    catch(Exception err){}
                }

                public void mouseReleased(MouseEvent e) {
                    try {
                        String value1 = inputFirst.getText();
                        int i = Integer.parseInt(value1);
                        String value2 = inputSecond.getText();
                        int j = Integer.parseInt(value2);
                        int ans = sub(i, j);
                        output.setText(String.valueOf(ans));
                    }
                    catch(Exception err){}
                }
            });

            frame.setSize(900,900);
            frame.setVisible(true);
            frame.setLayout(new GridLayout(25,20));
            frame.add(first);
            frame.add(inputFirst);
            frame.add(second);
            frame.add(inputSecond);
            frame.add(output);

        }

        public int add(int a,int b){
            return (a+b);
        }

        public int sub(int a,int b){
            return (a-b);
        }

        public static void main(String[] args){
            new PlusMinus();
        }

    }
}