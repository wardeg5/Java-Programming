
/**
 * The ClockDisplay class implements a digital clock display for a
 * European-style 24 hour clock. The clock shows hours and minutes. The 
 * range of the clock is 00:00 (midnight) to 23:59 (one minute before 
 * midnight).
 * 
 * The clock display receives "ticks" (via the timeTick method) every minute
 * and reacts by incrementing the display. This is done in the usual clock
 * fashion: the hour increments when the minutes roll over to zero.
 * 
 * @author Warren Degenhardt
 * @version 2015.07.17
 * 
 * 
 * -Modifed the ClockDisplay class and updateDisplay() to support a 12-hour clock 
 *- added an alarm clock feature which uses new variables alarmHour,alarmMinute, and alarmOn
 *-turnAlarmOn method turns on alarm clock feature
 *-turnAlarmOff turns off alarm clock feature
 */


public class ClockDisplay
{
    private NumberDisplay hours;
    private NumberDisplay minutes;
    private int alarmHour;
    private int alarmMinute;
    private boolean alarmOn;
    private String displayString;    // simulates the actual display
    
    /**
     * Constructor for ClockDisplay objects. This constructor 
     * creates a new clock set at 00:00.
     */
    public ClockDisplay()
    {
        hours = new NumberDisplay(24);
        minutes = new NumberDisplay(60);
        updateDisplay();
    }

    /**
     * Constructor for ClockDisplay objects. This constructor
     * creates a new clock set at the time specified by the 
     * parameters.
     */
    public ClockDisplay(int hour, int minute)
    {
        hours = new NumberDisplay(24);
        minutes = new NumberDisplay(60);
        setTime(hour, minute);
    
    }

    /**
     * This method should get called once every minute - it makes
     * the clock display go one minute forward.
     */
    public void timeTick()
    {
        minutes.increment();
        if(minutes.getValue() == 0) {  // it just rolled over!
            hours.increment();
        }
        updateDisplay();
    }

    /**
     * Set the time of the display to the specified hour and
     * minute.
     */
    public void setTime(int hour, int minute)
    {
        hours.setValue(hour);
        minutes.setValue(minute);
        updateDisplay();
    }

    /**
     * Return the current time of this display in the format HH:MM.
     */
    public String getTime()
    {
        return displayString;
    }
    
       /**
     * Turn on alarm clock feature
     */
    public void turnAlarmOn (int hour, int minute)
    {
       alarmHour = hour;
        alarmMinute = minute;
           alarmOn = true;
    }
       /**
     * Turn off alarm clock feature
     */
    public void turnAlarmOff ()
    {
           alarmOn = false;
    }
    /**
     * Update the internal string that represents the display.
     */
    private void updateDisplay()
    {   
        int hour = hours.getValue();
        String suffix;
        
        if(hour >= 12){
            suffix = "pm";
        }
        else {
            suffix = "am";
        }
      
        if(hour >= 12){
            hour -= 12;
        }
          if(hour == 0){
            hour = 12;
        }
        if(alarmOn == true){

              int minute = minutes.getValue();
            if (alarmMinute == minute && alarmHour == hour){
            System.out.println("ring!");  
        }
        }
        displayString = hour + ":" + 
                        minutes.getDisplayValue() + suffix;
    }
}
