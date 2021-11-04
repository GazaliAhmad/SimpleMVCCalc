package com.journeyman;

import javax.swing.*;
import java.awt.event.ActionListener;

public class CalcView extends JFrame {

    private JTextField num1 = new JTextField(10);
    private JLabel additionLabel = new JLabel("+");
    private JTextField num2 = new JTextField(10);
    private JButton calcButton = new JButton("Calculate");
    private JTextField calcSolution = new JTextField(10);

    CalcView() {
        JPanel calcPanel = new JPanel();

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(300, 200);
        this.setTitle("Calculator");

        calcPanel.add(num1);
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
