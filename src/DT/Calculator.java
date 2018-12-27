package DT;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Calculator extends Frame {
    private JTextField resultsTxt;
    private JButton percentButton;
    private JButton clearButton;
    private JButton a7Button;
    private JButton divideButton;
    private JButton a8Button;
    private JButton a9Button;
    private JButton multiplelButton;
    private JButton a4Button;
    private JButton a5Button;
    private JButton a6Button;
    private JButton minusButton;
    private JButton a1Button;
    private JButton a2Button;
    private JButton a3Button;
    private JButton additionButton;
    private JButton signButton;
    private JButton a0Button;
    private JButton digitButton;
    private JButton equalButton;
    public JPanel calcView;

    private Double leftOperand;
    private Double rightOperand;
    private Operation calcOperation;

    public Calculator() {
        a7Button.addActionListener(new NumberBtnClicked(a7Button.getText()));
        a8Button.addActionListener(new NumberBtnClicked(a8Button.getText()));
        a9Button.addActionListener(new NumberBtnClicked(a9Button.getText()));
        a4Button.addActionListener(new NumberBtnClicked(a4Button.getText()));
        a5Button.addActionListener(new NumberBtnClicked(a5Button.getText()));
        a6Button.addActionListener(new NumberBtnClicked(a6Button.getText()));
        a1Button.addActionListener(new NumberBtnClicked(a1Button.getText()));
        a2Button.addActionListener(new NumberBtnClicked(a2Button.getText()));
        a3Button.addActionListener(new NumberBtnClicked(a3Button.getText()));
        a0Button.addActionListener(new NumberBtnClicked(a0Button.getText()));
        percentButton.addActionListener(new OperationBtnClicked(Operation.PERCENTAGE));
        multiplelButton.addActionListener(new OperationBtnClicked(Operation.MULTIPLICATION));
        divideButton.addActionListener(new OperationBtnClicked(Operation.DIVISION));
        minusButton.addActionListener(new OperationBtnClicked(Operation.SUBTRACTION));
        additionButton.addActionListener(new OperationBtnClicked(Operation.ADDITION));
        equalButton.addActionListener(new EqualBtnClicked());
        clearButton.addActionListener(new ClearBtnClicked());
//        signButton.addActionListener(new SignBtnClicked());
        digitButton.addActionListener(new DigitBtnClicked());
    }

    private class NumberBtnClicked implements ActionListener{

        private  String value, valueAux;

        public NumberBtnClicked(String value) {
            this.value = value;
        }

        @Override
        public void actionPerformed(ActionEvent e) {

             valueAux = resultsTxt.getText() + value;
             resultsTxt.setText(this.valueAux);
        }
    }

    private class DigitBtnClicked implements ActionListener {
       @Override
        public void actionPerformed(ActionEvent e) {
            resultsTxt.setText(resultsTxt.getText() + ".");
        }
    }


    private class ClearBtnClicked implements ActionListener{


        @Override
        public void actionPerformed(ActionEvent e) {
            resultsTxt.setText("");
            leftOperand = 0.0;
            rightOperand = 0.0;
        }
    }

    private class OperationBtnClicked implements ActionListener {
        private Operation operation;
        public OperationBtnClicked(Operation operation) {
            this.operation = operation;
        }
        @Override
        public void actionPerformed(ActionEvent e) {
            calcOperation = operation;
            leftOperand = Double.valueOf(resultsTxt.getText());
            resultsTxt.setText("");


            System.out.println(leftOperand);
            System.out.println(operation);
        }
    }

    private class EqualBtnClicked implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent e) {
            rightOperand = Double.valueOf(resultsTxt.getText());
            resultsTxt.setText("");
            System.out.println(rightOperand);
            Double output = calcOperation.getOperator().applyAsDouble(leftOperand, rightOperand);
            resultsTxt.setText(output%1==0?String.valueOf(output.intValue()):String.valueOf(output));
            leftOperand = 0.0;
            rightOperand = 0.0;
        }
    }







}