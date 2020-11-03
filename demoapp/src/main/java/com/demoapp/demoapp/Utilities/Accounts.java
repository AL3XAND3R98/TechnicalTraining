package com.demoapp.demoapp.Utilities;

import ch.qos.logback.core.joran.conditional.ElseAction;

public class Accounts {
    
    public float tax(int salary)
    {
        int t=salary*21/100;
        return t;
    }

    public float taxCalculation(int salary)
    {
        if(salary<1000)
        {
            return 0;
        }
        else if(salary<2000)
        {
            return salary * (float)0.15;
        }
        else
        {
            return salary*(float)0.25;
        }
    }
}
