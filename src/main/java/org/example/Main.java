
package org.example;

public class Main {

    public static double celsiusToFahrenheit(double celsius) {
        return (celsius * 9 / 5) + 32;
    }

    public static void main(String[] args) {
        System.out.println(celsiusToFahrenheit(25));
    }
}
