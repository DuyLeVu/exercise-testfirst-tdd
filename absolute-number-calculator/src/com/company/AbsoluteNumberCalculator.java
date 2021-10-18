package com.company;

public class AbsoluteNumberCalculator {
    public static int findAbsolute(int number){
        if(number < 0)
            return  -number;
        else if (number > 0)
        return number;
        return 0;
    }
}
