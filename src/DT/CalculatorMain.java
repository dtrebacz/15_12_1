package DT;

import javax.swing.*;

public class CalculatorMain {
    public static void main(String[] args) {

            JFrame frame = new JFrame("Calculator");
            frame.setContentPane(new Calculator().calcView);
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.pack();
            frame.setVisible(true);
              }

    }
