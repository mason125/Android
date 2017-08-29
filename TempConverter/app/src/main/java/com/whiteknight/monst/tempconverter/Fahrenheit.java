package com.whiteknight.monst.tempconverter;

/**
 * Created by MONST on 8/29/2017.
 */

public class Fahrenheit {

    //converstion constants
    final double addition = 459.67;
    final double multi = 5/9;

    public double Kelvin(double F)
    {

        //actual conversion
        double value = (F + addition) * multi;

        return value;
    }

    public double Celsius(double F)
    {
        //conversion
        double value = (F - 32) * multi;
        return value;
    }
}
