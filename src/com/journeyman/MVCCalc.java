package com.journeyman;

// The main class that runs the program. Model View Controller (MVC) concept.

public class MVCCalc {

    public static void main(String[] args) {
        CalcModel theModel = new CalcModel();

        CalcView theView = new CalcView();

        CalcController theController = new CalcController(theView, theModel);

        theView.setVisible(true);
        }
    }

