/**
 * A movie in an online movie catalog
 * 
 * @author Cara Tang
 * @version 2015.01.20
 */
public class Movie
{
    private String title;
    private int runLength;  // length of the movie in minutes
    private int starRating; // rating from 1 to 4 stars (0 = not rated yet)

    /**
     * Create a movie with the title, run length, and number of stars given
     * @param aTitle title of the movie
     * @param aRunLength run length of the movie in minutes
     * @param aStarRating star rating of the movie, a value from 1 to 4 inclusive
     */
    public Movie(String aTitle, int aRunLength, int aStarRating)
    {
        title = aTitle;
        runLength = aRunLength;
        setStarRating(aStarRating);
    }

    /**
     * Create a movie with the title and run length given
     * @param aTitle title of the movie
     * @param aRunLength run length of the movie in minutes
     */
    public Movie(String aTitle, int aRunLength)
    {
        title = aTitle;
        runLength = aRunLength;
        starRating = 0;
    }

    /**
     * @return title of the movie
     */
    public String getTitle()
    {
        return title;
    }
    
    /**
     * @return run length of the movie in minutes
     */
    public int getRunLength()
    {
        return runLength;
    }
    
    /** 
     * @return rating in stars of the movie; a value of 0 means "not rated"
     */
    public int getStarRating()
    {
        return starRating;
    }
    
    /**
     * Set the star rating of this movie to the value given
     * @param newRating new star rating of the movie
     */
    public void setStarRating(int newRating)
    {
        if (newRating >= 1 && newRating <= 4) {
            starRating = newRating;
        }
        else {
            System.out.println("Error: Valid range for star rating is 1 to 4");
        }
    }

    /**
     * Reset the star rating of this movie to "not rated"
     */
    public void resetStarRating()
    {
        starRating = 0;
    }
    
    /**
     * Increase the star rating of this movie by 1
     */
    public void increaseStarRating()
    {
        if (starRating < 4) {
            starRating = starRating + 1;
        }
    }

    /**
     * Decrease the star rating of this movie by 1
     */
    public void decreaseStarRating()
    {
        if (starRating > 1) {
            starRating = starRating - 1;
        }
    }

    /**
     * Print information on this movie
     */
    public void printMovieInfo()
    {
        System.out.println("---------------------------------");
        System.out.println(title);
        System.out.println("Run length: " + runLength);
        if (starRating == 0) {
            System.out.println("Rating: (no rating)");
        }
        else {
            System.out.println("Rating: " + starRating + " stars");
        }
        System.out.println("---------------------------------");
    }
}
