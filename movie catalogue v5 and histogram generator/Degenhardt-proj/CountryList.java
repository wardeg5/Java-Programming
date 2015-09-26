import java.util.ArrayList;
/**
 * A list of countries
 * 
 * @author Warren Degenhardt
 * @version 2015.08.10
 * -created CountryList() to create a list of countries for displayingin a histogram
 * -created addCountry to add the countries to CountryList
 * -uses an array list with country name, average age, and ratio of people per television
 * -made printHistogram to print an informational histogram using asterisks to show different frequency of people per television around the world, the purpose of this project
 * -optional printCountries can be used for additional information about each country
 */
public class CountryList
{
    private ArrayList<Country> countries;

    /**
     * Create a country list and initialize it with a few countries
     */
    public CountryList()
    {
        countries = new ArrayList<Country>();
        addCountry("Argentina", 71, 4);
        addCountry("Bangladesh", 54, 315);
        addCountry("Brazil", 65, 4);
        addCountry("Canada", 77, 2);
        addCountry("China", 70, 8);
        addCountry("Colombia", 71, 6);
        addCountry("Egypt", 61, 15);
        addCountry("Ethiopia", 52, 503);
        addCountry("France", 78, 3);
        addCountry("Germany", 76, 3);
        addCountry("India", 52, 44);
        addCountry("Indonesia", 61, 24);
        addCountry("Iran", 65, 23);
        addCountry("Italy", 79, 3);
        addCountry("Japan", 79, 2);
        addCountry("Kenya", 61, 96);
        addCountry("North Korea", 70, 90);
        addCountry("South Korea", 70, 5);
        addCountry("Mexico", 72, 7);
        addCountry("Morocco", 65, 21);
        addCountry("Myanmar (Burma)", 55, 592);
        addCountry("Pakistan", 57, 73);
        addCountry("Peru", 65, 14);
        addCountry("Philippines", 65, 9);
        addCountry("Poland", 73, 4);
        addCountry("Romania", 72, 6);
        addCountry("Russia", 69, 3);
        addCountry("South Africa", 64, 11);
        addCountry("Spain", 79, 3);
        addCountry("Sudan", 53, 23);
        addCountry("Taiwan", 75, 3);
        addCountry("Tanzania", 53, 0);
        addCountry("Thailand", 69, 11);
        addCountry("Turkey", 70, 5);
        addCountry("Ukraine", 71, 3);
        addCountry("United Kingdom", 76, 3);
        addCountry("United States", 76, 1);
        addCountry("Venezuela", 75, 6);
        addCountry("Vietnam", 65, 29);

    }

    /**
     * Add a country to the list
     * @param title the country title
     * @param lifeExpectancy the average lifetime of person in country in years
     * @param peoplePerTelevision Number of people per television that country
     */
    public void addCountry(String title, int lifeExpectancy, int peoplePerTelevision)
    {
        countries.add(new Country(title, lifeExpectancy, peoplePerTelevision));
    }

    /**
     * @param peoplePerTelevision the people/TV to look for
     * @return a list of all countries in this list with the given number of people/TV
     */
    public ArrayList<Country> getCountrysWithTelevisions(int peoplePerTelevision)
    {
        ArrayList<Country> countriesWithTelevisions = new ArrayList<>();
        for (Country country : countries) {
            if (peoplePerTelevision == country.getNumTelevisions()) {
                countriesWithTelevisions.add(country);
            }
        }
        return countriesWithTelevisions;
    }

    /**
     * Prints a report showing the number of countries using "*" in the list to show TV ownership per person statistics ,
     * including not rated
     */
    public void printHistogram()
    {

        System.out.println("##########################################");

        String tenTelevisionCountries = "*";
        String twentyTelevisionCountries = "*";
        String thirtyTelevisionCountries = "*";
        String fortyTelevisionCountries = "*";
        String fiftyTelevisionCountries = "*";
        String sixtyTelevisionCountries = "*";
        String seventyTelevisionCountries = "*";
        String eightyTelevisionCountries = "*";
        String ninetyTelevisionCountries = "*";
        String oneHundredTelevisionCountries = "*";
        String oneHundredPlusTelevisionCountries = "*";
        String unratedCountries = "*";
        for (Country country : countries) {
            if (country.getNumTelevisions() < 10) {
                tenTelevisionCountries = tenTelevisionCountries + "*";
            }
            else if (country.getNumTelevisions() < 20) {
                twentyTelevisionCountries = twentyTelevisionCountries + "*";
            }
            else if (country.getNumTelevisions() < 30) {
                thirtyTelevisionCountries = thirtyTelevisionCountries + "*";
            }
            else if (country.getNumTelevisions() < 40) {
                fortyTelevisionCountries = fortyTelevisionCountries + "*";
            }
            else if (country.getNumTelevisions() < 50) {
                fiftyTelevisionCountries = fiftyTelevisionCountries + "*";
            }
            else if (country.getNumTelevisions() < 60) {
                sixtyTelevisionCountries = sixtyTelevisionCountries + "*";
            }
            else if (country.getNumTelevisions() < 70) {
                seventyTelevisionCountries = seventyTelevisionCountries + "*";
            }
            else if (country.getNumTelevisions() < 80) {
                eightyTelevisionCountries = eightyTelevisionCountries + "*";
            }
            else if (country.getNumTelevisions() < 90) {
                ninetyTelevisionCountries = ninetyTelevisionCountries + "*";
            }
            else if (country.getNumTelevisions() < 100) {
                oneHundredTelevisionCountries = oneHundredTelevisionCountries + "*";
            }
            else if (country.getNumTelevisions() >= 100) {
                oneHundredPlusTelevisionCountries = oneHundredPlusTelevisionCountries + "*";
            }
            else {
                unratedCountries = unratedCountries + "*";
            }
        }
        System.out.println("0-10 people-per-television countries  : " + tenTelevisionCountries);
        System.out.println("10-20 people-per-television countries : " + twentyTelevisionCountries);
        System.out.println("20-30 people-per-television countries : " + thirtyTelevisionCountries);
        System.out.println("30-40 people-per-television countries : " + fortyTelevisionCountries);
        System.out.println("40-50 people-per-television countries : " + fiftyTelevisionCountries);
        System.out.println("50-60 people-per-television countries : " + sixtyTelevisionCountries);
        System.out.println("60-70 people-per-television countries : " + seventyTelevisionCountries);
        System.out.println("70-80 peop le-per-television countries: " + eightyTelevisionCountries);
        System.out.println("80-90 people-per-television countries : " + ninetyTelevisionCountries);
        System.out.println("90-100 people-per-television countries: " + oneHundredTelevisionCountries);
        System.out.println("100+ people-per-television countries  : " + oneHundredPlusTelevisionCountries);
        System.out.println("Unrated countries                     : " + unratedCountries);

        System.out.println("##########################################");
    }

    /**
     * Prints a report showing the countries in this list and shows age and TV stats ,
     */
    public void printCountries()
    {
        System.out.println("##########################################");
        System.out.println("COUNTRY INFO:");
        if (countries.size() == 0) {
            System.out.println("No countries in the list");
        }
        else {
            for (Country country : countries) {
                country.printCountryInfo();
            }
        }
        System.out.println("##########################################");
    }
}
