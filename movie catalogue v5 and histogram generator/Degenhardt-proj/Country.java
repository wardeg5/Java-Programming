/**
 * A country in a country list meant to show people per Television
 * 
 * @author Warren Degenhardt
 * @version 2015.08.10
 * 
 * -created Country for addition to arrayList
 * -created getTtitle
 * -created getNumTelevisons
 * -created setpeoplePerTelevision
 * -created printcountryinfo
 */
public class Country
{
    private String title;
    private int lifeExpectancy;  // length of the country in minutes
    private int peoplePerTelevision; // rating from 1 to 4 televisions (0 = not rated yet)

    /**
     * Create a country with the name, average life length in years, and number of people per television
     * @param aTitle title of the country
     * @param aLifeExpectancy average age of death in this country
     * @param numPeoplePerTelevision number of people per owned television in this country
     */
    public Country(String aTitle, int aLifeExpectancy, int numPeoplePerTelevision)
    {
        title = aTitle;
        lifeExpectancy = aLifeExpectancy;
        setPeoplePerTelevision(numPeoplePerTelevision);
    }

    /**
     * @return title of the country
     */
    public String getTitle()
    {
        return title;
    }

    /**
     * @return life expectancy of the country in years
     */
    public int getLifeExpectancy()
    {
        return lifeExpectancy;
    }

    /** 
     * @return televisions per person in the country; a value of 0 means "no data"
     */
    public int getNumTelevisions()
    {
        return peoplePerTelevision;
    }

    /**
     * Set the number of televisions per person of this country to the value given
     * @param newNumPeoplePerTelevsion new television rating of the country
     */
    public void setPeoplePerTelevision(int newNumPeoplePerTelevsion)
    {

        peoplePerTelevision = newNumPeoplePerTelevsion;

    }

    /**
     * Print information on this particular country
     */
    public void printCountryInfo()
    {
        System.out.println("---------------------------------");
        System.out.println(title);
        System.out.println("Life Expectancy: " + lifeExpectancy);
        if (peoplePerTelevision == 0) {
            System.out.println("Number of Televisions: (unknown)");
        }
        else {
            System.out.println("People per Television: " + peoplePerTelevision );
        }
        System.out.println("---------------------------------");
    }
}
