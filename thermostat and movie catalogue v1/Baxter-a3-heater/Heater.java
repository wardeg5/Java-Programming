    
/**
 * Heater Project
 * Simulate the behavior of a thermostat
 * @author Amy Baxter
 * @version 7.1.2015
 * Modifications:
 * created accessors and mutator methods for temperature, minimum, maximum, and increment
 * modify increment to not allow negative numbers
 * defined 2 constructers
 * created method called Warmer that increases temperature, but does not allow to exceed max temp
 */
public class Heater
{
    private int temperature;
    private int minimum;
    private int maximum;
    private int increment;
    
    /** 
     * custructor defining minimum, maximum, increment and temperature
     */
    public Heater()
    {
        minimum = 0;
        maximum = 100;
        increment = 1;
        temperature = 50;
    }
    /**
     * custuctor with perameters defining maximum, minamum, increment and temperature
     */
    public Heater (int currentTemp, int maxTemp, int minTemp, int increment)
    {
        temperature = currentTemp;
        maximum = maxTemp;
        minimum = minTemp;
        increment = increment;
    }
    
    /**
     * method that warms and that does not allow temp to go amove max
     */
    public void warmer()
     {
        if (temperature + increment < maximum) {
             temperature = temperature + increment; }
            else {
                System.out.println ("Temperature must not exceed " + maximum);
                
            }
        }
        
     
            
    /**
     * method that cools temperature down and does not allow it to go below min
     */
    
    public void cooler()
     {
         if (temperature + increment > minimum) {
            temperature = temperature + increment ; }
            else {
                System.out.println ("Temperature must not go below " + minimum);
                
            }
     }
        
 
    /**
     * Returns current temperature
     */
    public int getTemperature()
    {
        return temperature;
    }
    
    /**
     * returns minimum temperature
     */
    public int getMinimum()
    {
        return minimum;
    }
    
     /**
      * returns maximum temperature
      */
    public int getMaximum()
    {
        return maximum;
    }
    
    /**
     * returns current increment of temperature
     */
    public int getIncrement()
    {
        return increment;
    }
    
    /**
     * sets the temperature of the heater
     */
    public void setTemperature ()
    {
        temperature = temperature;
    }
    
    /**
     * sets minimum temperature
     */
    public void setMinimum(int minTemp)
    {
        minimum = minTemp;
    }
    
   /**
    * sets maximum temperature
    * 
    */
   public void setMaximum(int maxTemp)
   {
       maximum = maxTemp;
    }
    
    /**
     * sets increment and does not allow negative numbers. 
     */
    public void setIncrement(int newIncrement)
    {
        if (increment > 0 ){
            increment = newIncrement;
        }
        else {
            System.out.println("Increment must be positive number" );
        }
    }
}

    
        
        