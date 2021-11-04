package com.journeyman;

// The Model in MVC. This does the calculation and that's all.
// It doesn't need to know the View exists.

public class CalcModel {
    private Double calcValueAdd;

    public void addTwoNumbers(Double num1, Double num2) {
        calcValueAdd = num1 + num2;
    }

    public Double getCalcValueAdd() {
        return calcValueAdd;
    }

}
