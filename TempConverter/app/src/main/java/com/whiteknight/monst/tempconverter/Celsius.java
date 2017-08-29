package com.whiteknight.monst.tempconverter;

/**
 * Created by MONST on 8/29/2017.
 */

public class Celsius {

    public double Kelvin(double C)
    {
        //conversion constant
        final double convesion = 273.15;

        //conversion equation
        double value = C + convesion;

        return(value);
    }
    
    public double Fahrenheit(double C)
    {
        //conversion constants
        final double subtraction = 32;
        final double multi = 5/9;

        //conversion equation
        double value = (C - subtraction) * multi;

        return(value);
    }
}
