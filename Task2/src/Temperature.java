/**
 * Name: Jeffano John
 * Date: Friday October 22nd 2021
 * Student #: 251230759
 * Description: A temperature class is made to store the fahrenheit and to convert it to Celsius and Kelvin
 */
public class Temperature {

    //A double to hold the temperature
    private double ftemp;

    //Initializing the Temperature constructor
    public Temperature(double f){
        ftemp = f;
    }

    //Takes the Fahrenheit value from the user and stores it in ftemp.
    public void setFahrenheit(double f){
        ftemp = f;
    }

    //Returns the value of ftemp
    public double getFahrenheit(){
        return ftemp;
    }

    //Returns the Celsius value
    public double getCelsius(){
        //converting fahrenheit to celsius
        double celsius = ((5) * (ftemp - 32))/9;
        return celsius;
    }

    //Returns the Kelvin value
    public double getKelvin(){
        //converting fahrenheit to kelvin
        double kelvin = ((5 * (ftemp - 32))/9) + 273;
        return kelvin;
    }




}
