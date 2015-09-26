
/**
 * Heater project
 * Simulate the behavior of a heater (thermostat)
 * @author Warren Degenhardt
 * @version 7/1/2015
 * Modifications:
 * -Added 4 int fields: temperature, minimum, maximum, increment
 * -Wrote getters (accessors) and setters (mutators) for each field using standard naming conventions
 * -Defined two constructors for the class: The first constructor takes no parameters, The second takes 4
 * -Defined a method named warmer.
 * Defined a method named cooler. 
 * 
 */
public class Heater
{
    // instance variables - replace the example below with your own
    private int temperature; //the current temperature
    private int minimum; //the current minimum
    private int maximum; //the current maximum
    private int increment; //the current increment

    /**
     * Creates a heater object which takes no parameters. 
     * This initializes minimum to 0, maximum to 100, increment to 1, and temperature to 50.
     * 
     */
    public Heater()
    {
        minimum = 0;
        maximum = 100;
        increment = 1;
        temperature = 50;
    }

    /**
     * Constructor takes 4 parameters and initializes them
     */

    public Heater(int thisMinimum, int thisMaximum, int thisIncrement, int thisTemperature)
    {
        minimum = thisMinimum;
        maximum = thisMaximum;
        increment = thisIncrement;
        temperature = thisTemperature;
    }

    /**
     * Increase the temperature by Increment
     */
    public void warmer()
    {

        if (temperature >= maximum) {
            temperature = temperature;
            System.out.println("Thermostat does not allow a value greater than the maximum");
        }
        else {
            temperature = (temperature + increment);
        }
    }

    /**
     * Decrease the temperature by Increment
     */
    public void cooler()
    {
        if (temperature <= minimum) {
            temperature = temperature;
            System.out.println("Thermostat does not allow a value lower than the minimum");
        }
        else {
            temperature = (temperature - increment);
        }

    }

    /**
     * Accessor for temperature
     *  @return current temperature of the heater
     */
    public int getTemperature() {
        return temperature;
    }

    /**
     * Setter(mutator) for temperature
     */
    public void setTemperature(int newTemperature) {
        temperature = newTemperature;
    } 

    
    /**
     * Accessor for minimum
     *  @return current minimum value
     */
    public int getMinimum() {
        return minimum;
    }

    /**
     * Setter(mutator) for minimum
     */
    public void setMinimum(int newMinimum) {
        minimum = newMinimum;
    }

    /**
     * Accessor for maximum
     *  @return current maximum of the heater
     */
    public int getMaximum() {
        return maximum;
    }

    /**
     * Setter(mutator) for maximum
     */
    public void setMaximum(int newMaximum) {
        maximum = newMaximum;
    }

    /**
     * Accessor for increment
     *  @return current value of the increment
     */
    public int getIncrement() {
        return increment;
    }

    /**
     * Setter(mutator) for increment
     */
    public void setIncrement(int newIncrement) {

        if (newIncrement >= 0) {
            increment = newIncrement;
        }
        else {
            System.out.println("Thermostat does not allow a negative value for the increment");
        }
    }
}
