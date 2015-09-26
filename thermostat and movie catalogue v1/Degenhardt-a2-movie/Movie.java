/**
 * A movie in an online movie catalog
 * 
 * @author Warren Degenhardt 
 * @version 6/28/2015
 * Modifications:
 * -Created a second constructor that sets the star rating to 0
 * -Created the getStarRating method that returns this movie's star rating
 * -Created the setStarRating method that sets the rating of this movie to a new value
 * -Fixed method increaseStarRating()
 * -Created method decreaseStarRating()
 * -Added linte to printMovieInfo() which prints the Movie's star rating
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
        starRating = aStarRating;
    }

    public Movie(String anotherTitle, int anotherRunLength)
    {
        title = anotherTitle;
        runLength = anotherRunLength;
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
     * Return the run star rating of the movie
     */
    public int getStarRating()
    {
        return starRating;
    }

    /**
     * setStarRating method that sets the rating of this movie to a new value
     */
    public int setStarRating(int newStarRating)
    {
        starRating = newStarRating;
        return starRating;
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

        starRating = starRating+1;
    }

    public void decreaseStarRating()
    {

        starRating = starRating-1;
    }

    /**
     * Print information on this movie
     */
    public void printMovieInfo()
    {
        System.out.println("---------------------------------");
        System.out.println(title);
        System.out.println("Run length: " + runLength);
        System.out.println(starRating);
        System.out.println("---------------------------------");
    }
}
