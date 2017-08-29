package com.whiteknight.monst.tempconverter;

/**
 * Created by MONST on 8/29/2017.
 */

public class Kelvin {

    public double Fahrenheit(double K){

        //conversion values
        final double subtract = 459.67;
        final double multi = 9/5;

        //conversion equation
        double value = (K*multi) - subtract;
        return value;
    }

    public double Celsius(double K){

        //conversion constant
        final double constant = 273.15;

        //value holder for C
        double value = K - constant;
        return value;
    }
}

