package com.whiteknight.monst.tempconverter;

/**
 * Created by MONST on 8/29/2017.
 */

public class Fahrenheit {

    //converstion constants
    final double multi = 1.8;

    public double Kelvin(double F)
    {

        //actual conversion
        double value = 273.15 + ((F - 32) / multi);
        return (Math.round(value*100.0)/100.0);
    }

    public double Celsius(double F)
    {
        //conversion
        double value = (F - 32) / multi;
        return (Math.round(value*100.0)/100.0);
    }
}
