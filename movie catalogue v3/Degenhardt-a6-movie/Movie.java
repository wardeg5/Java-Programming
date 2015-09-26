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
     */
    public Movie(String aTitle, int aRunLength, int aStarRating)
    {
        title = aTitle;
        runLength = aRunLength;
        setStarRating(aStarRating);
    }

    /**
     * Create a movie with the title and run length given
     */
    public Movie(String aTitle, int aRunLength)
    {
        title = aTitle;
        runLength = aRunLength;
        starRating = 0;
    }

    /**
     * Return the title of the movie
     */
    public String getTitle()
    {
        return title;
    }
    
    /**
     * Return the run length of the movie
     */
    public int getRunLength()
    {
        return runLength;
    }
    
    /** 
     * Return the rating in stars of the movie
     */
    public int getStarRating()
    {
        return starRating;
    }
    
    /**
     * Set the star rating of this movie to the value given
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
     * Reset the star rating of this movie to 0, meaning not rated
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
