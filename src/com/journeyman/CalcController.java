package com.journeyman;

// The Controller in MVC.
// Its job is to coordinate the interaction between the Model and the View.

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CalcController {

    private final CalcView theView;
    private final CalcModel theModel;

    public CalcController(CalcView theView, CalcModel theModel) {
        this.theView = theView;
        this.theModel = theModel;
        this.theView.addCalcListener(new CalcListener());
    }

    class CalcListener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent arg0) {

            try {
                Double num1 = theView.getNum1();
                Double num2 = theView.getNum2();

                theModel.addTwoNumbers(num1, num2);

                theView.setCalcSolution(theModel.getCalcValueAdd());
            } catch (NumberFormatException ex) {
                System.out.println(ex);
                theView.displayErrorMessage("You Need to Enter 2 Numbers");
            }
        }
    }
}
