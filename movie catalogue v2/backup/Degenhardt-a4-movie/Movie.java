/**
 * A movie in an online movie catalog
 * 
 * @author Warren Degenhardt
 * @version 2015.07.10
 * 
 * A2 Modifications:
 * - add second constructor
 * - add getStarRating
 * - add setStarRating
 * - fix increaseStarRating
 * - add decreaseStarRating
 * - update printMovieInfo
 * 
 * A3 Modifications:
 * - Replaced the setStarRating statement with a call to setStarRating that has the same effect
 * - Added validation: The new star rating must be in the range 1 - 4 (inclusive), prints error message if invalid range
 * - Added validation: increaseStarRating now has maximum rating of 4 
 * - Added validation: decreaseStarRating now cannot go lower than 1, unchanged if 1 or 0.
 * - printMovieInfo now displays "Rating: (no rating)" if star rating is 0.
 * 
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
        setStarRating(starRating);

        // Question: Why do you think we want to replace the assignment statement with a call to setStarRating?
        // Your Answer: So that we can easily manipulate the assignment in the future. It the statement was 
        // much larger and more complex, it would be a valuable design choice. It is also good if the class will be additionally derived from.
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

        if(newRating > 4){
            System.out.println(" ERROR: Star rating must between range 1 - 4" );
        }
        if(newRating < 1){
            System.out.println(" ERROR: Star rating must between range 1 - 4 " );
        }
        starRating = newRating;
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
        // TODO: ----------------- 4 -------------------
        if (starRating >= 4){
            starRating = 4;
        }

        starRating = starRating + 1;
    }

    /**
     * Decrease the star rating of this movie by 1
     */
    public void decreaseStarRating()
    {

        if(starRating == 0 || starRating == 1){
            starRating = starRating;
        }
        if(starRating < 0){
            starRating = 1;
        }

        starRating = starRating - 1;
    }

    /**
     * Print information on this movie
     */
    public void printMovieInfo()
    {
        System.out.println("---------------------------------");
        System.out.println(title);
        System.out.println("Run length: " + runLength);
        if (starRating == 0){
            System.out.println("Rating: (no rating)");
        }

        System.out.println("Rating: " + starRating + " stars");

        System.out.println("---------------------------------");
    }
}
