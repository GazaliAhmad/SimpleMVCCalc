package com.journeyman;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import java.awt.event.ActionListener;

public class CalcView extends JFrame {

    private final JTextField num1 = new JTextField(10);
    private final JTextField num2 = new JTextField(10);
    private final JButton calcButton = new JButton("Calculate");
    private final JTextField calcSolution = new JTextField(10);

    CalcView() {
        JPanel calcPanel = new JPanel();

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(500, 100);
        this.setTitle("Calculator");

        calcPanel.add(num1);
        JLabel additionLabel = new JLabel("+");
        calcPanel.add(additionLabel);
        calcPanel.add(num2);
        calcPanel.add(calcButton);
        calcPanel.add(calcSolution);

        this.add(calcPanel);
    }

    public Double getNum1() {
        return Double.parseDouble(num1.getText());
    }

    public Double getNum2() {
        return Double.parseDouble(num2.getText());
    }

    public Double getCalcSolution() {
        return Double.parseDouble(calcSolution.getText());
    }


    public void setCalcSolution(Double solution) {
        calcSolution.setText(solution.toString());
    }

    void addCalcListener(ActionListener listenForCalcButton) {
        calcButton.addActionListener(listenForCalcButton);
    }

    void displayErrorMessage(String errorMessage) {
        JOptionPane.showMessageDialog(this, errorMessage);
    }

}
