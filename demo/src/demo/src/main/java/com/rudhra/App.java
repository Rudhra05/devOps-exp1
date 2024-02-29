package com.rudhra;

import com.Calculator;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
       Calculator calculator = new Calculator();
        int result = calculator.add(5, 3);
        System.out.println("Result of addition: " + result);
        
    }
}
