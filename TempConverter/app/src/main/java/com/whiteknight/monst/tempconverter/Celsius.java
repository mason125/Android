package com.whiteknight.monst.tempconverter;

import java.text.DecimalFormat;

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
        return (Math.round(value*100.0)/100.0);
    }

    public double Fahrenheit(double C)
    {
        //conversion constants
        final double subtraction = 32;
        final double multi = 1.8;

        //conversion equation
        double value = (C * multi) + 32;
        return (Math.round(value*100.0)/100.0);
    }
}
