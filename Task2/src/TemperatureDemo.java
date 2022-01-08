/**
 * Name: Jeffano John
 * Date: Friday October 22nd 2021
 * Student #: 251230759
 * Description: Converting fahrenheit to celsius and kelvin after using classes and methods
 */

import java.text.DecimalFormat;
import java.util.Scanner;

public class TemperatureDemo {
    public static void main(String[] args) {

        //Initializing a variable
        double fahrenheit;

        //Creating a scanner object
        Scanner input = new Scanner(System.in);
        //Creating a rounding object
        DecimalFormat df = new DecimalFormat("#####.00");

        //Printing the initial statement
        System.out.println("Enter the Fahrenheit temperature:");
        //Reading the fahrenheit value from the user
        fahrenheit = input.nextDouble();

        //Creating the temperature object
        Temperature t = new Temperature(fahrenheit);

        //Setting the fahrenheit value
        t.setFahrenheit(fahrenheit);

        //Printing the celsius and kelvin to 2 decimal places after being converted from fahrenheit
        System.out.println("Celsius: " + df.format(t.getCelsius()) +"\nKelvin: " + df.format(t.getKelvin()));
    }
}
