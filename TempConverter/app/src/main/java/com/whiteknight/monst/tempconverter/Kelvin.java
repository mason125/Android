package com.whiteknight.monst.tempconverter;

/**
 * Created by MONST on 8/29/2017.
 */

public class Kelvin {

    public double Fahrenheit(double K){

        //conversion values
        final double constant = 273.15;
        final double multi = 1.8;

        //conversion equation
        double value = ((K - constant) * multi) + 32;
        return (Math.round(value*100.0)/100.0);
    }

    public double Celsius(double K){

        //conversion constant
        final double constant = 273.15;

        //value holder for C
        double value = K - constant;
        return (Math.round(value*100.0)/100.0);
    }
}

