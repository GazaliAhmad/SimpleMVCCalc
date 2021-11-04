package com.journeyman;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CalcController {

    private CalcView theView;
    private CalcModel theModel;

    public CalcController(CalcView theView, CalcModel theModel) {
        this.theView = theView;
        this.theModel = theModel;
        this.theView.addCalcListener(new CalcListener());
    }

    class CalcListener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent arg0) {

            Double num1, num2 = 0.0;

            try {
                num1 = theView.getNum1();
                num2 = theView.getNum2();

                theModel.addTwoNumbers(num1, num2);

                theView.setCalcSolution(theModel.getCalcValueAdd());
            } catch (NumberFormatException ex) {
                System.out.println(ex);
                theView.displayErrorMessage("You Need to Enter 2 Numbers");
            }
        }
    }
}
