package org.fasttrackit;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Calculator calculator = new Calculator();
        System.out.println(calculator.addNumber(5, 7));

        Calculator calculator1 = new Calculator();
        System.out.println(calculator1.subNumber(10, 5));

        Calculator calculator2 = new Calculator();
        System.out.println(calculator2.mulNumber(5,9.5));

        Calculator calculator3 = new Calculator();
        System.out.println(calculator3.divNumber(12.4,4.1));
    }
}
