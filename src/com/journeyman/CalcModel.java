package com.journeyman;

public class CalcModel {
    private Double calcValueAdd;

/*
    private Double calcValueSub;
    private Double calcValueMul;
    private Double calcValueDiv;
*/

    public void addTwoNumbers(Double num1, Double num2) {
        calcValueAdd = num1 + num2;
    }

/*
    public void subTwoNumbers(Double num1, Double num2) {
        calcValueSub = num1 - num2;
    }

    public void mulTwoNumbers(Double num1, Double num2) {
        calcValueMul = num1 * num2;
    }

    public void divTwoNumbers(Double num1, Double num2) {
        calcValueDiv = num1 / num2;
    }
*/

    public Double getCalcValueAdd() {
        return calcValueAdd;
    }

/*
    public Double getCalcValueSub() {
        return calcValueSub;
    }

    public Double getCalcValueMul() {
        return calcValueMul;
    }

    public Double getCalcValueDiv() {
        return calcValueDiv;
    }
*/
}
