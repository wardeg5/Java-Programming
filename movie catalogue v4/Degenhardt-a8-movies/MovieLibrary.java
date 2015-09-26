import java.util.ArrayList;
/**
 * A library of movies
 * 
 * @author Warren Degenhardt
 * @version 2015.08.05
 * 
 * -added new movies
 * - wrote a method called removeMovie that takes a String parameter, removes a given movie
 * -Wrote a method called getMoviesWithStarRating that takes an int parameter, returns movies of that rating
 * -Wrote a method called printRatingReport that prints the number of movies of each star rating
 */
public class MovieLibrary
{
    private ArrayList<Movie> movies;

    /**
     * Create a movie library and initialize it with a few movies
     */
    public MovieLibrary()
    {
        movies = new ArrayList<Movie>();
        addMovie("Star Wars", 121, 4);
        addMovie("Ben Hur", 212, 4);
        addMovie("Das Boot", 149, 3);
        addMovie("Fantasia", 125);
        addMovie("Casino Royale", 144);
        addMovie("Minions", 91, 1);
        addMovie("Paul Blart: Mall Cop", 91, 4);
        addMovie("Paul Blart: Mall Cop 2", 94);
        addMovie("Biodome", 95, 1);
    }

    /**
     * Add a movie to the library
     * @param title the movie title
     * @param runLength the length of the movie in minutes
     */
    public void addMovie(String title, int runLength)
    {
        movies.add(new Movie(title, runLength));
    }

    /**
     * Add a movie to the library
     * @param title the movie title
     * @param runLength the length of the movie in minutes
     * @param starRating rating for the movie in stars (1, 2, 3, or 4)
     */
    public void addMovie(String title, int runLength, int starRating)
    {
        movies.add(new Movie(title, runLength, starRating));
    }

    /**
     * @return the number of movies in this library
     */
    public int getNumMovies()
    {
        return movies.size();
    }

    /**
     * Removes all the movies in the library
     */
    public void clearLibrary()
    {
        movies.clear();
    }

    /**
     * @param title title of the movie to search for
     * @return the movie with the given title 
     *         or null if there is no movie in the library with that title
     */
    public Movie findMovieByTitle(String title)
    {

        for(Movie movie : movies){ 
            if(movies.contains(title)){
                return movie;
            }

        }
        return null;
    }

    /**
     * Remove a track from the collection.
     * @param index The index of the track to be removed.
     */
    public void removeMovie(String index)
    {

        movies.remove(index);

    }

    public Movie getMoviesWithStarRating(int starParameter)
    {

        for(Movie movie : movies){ 
            if(movie.starRating == starParameter){
                return movie;

            }
        }
        return null;
    }

    public void printRatingReport()
    {
        int counter;
        for(Movie movie : movies)
        {
            int counter1 = 0;  
            int counter2 = 0;  
            int counter3 = 0;  
            int counter4 = 0;
            int counter5 = 0;  
            if(movie.starRating == 1)
            {
                counter1++;
            }
            if(movie.starRating == 2)
            {
                counter2++;
            }
            if(movie.starRating == 3)
            {
                counter3++;
            }
            if(movie.starRating == 4)
            {
                counter4++;
            }
            if(movie.starRating == 0)
            {
                counter5++;
            }

            System.out.println(" 4-star movies:" + counter4);
            System.out.println(" 3-star movies:" + counter3);
            System.out.println(" 2-star movies:" + counter2);
            System.out.println(" 1-star movies:" + counter1);
            System.out.println(" unrated movies:" + counter5);
        }

    }
    
    
    /**
     * Print the movies in the library
     */
    public void printMovies()
    {
        System.out.println("##########################################");
        System.out.println("MOVIE LIBRARY:");
        if (movies.size() == 0) {
            System.out.println("No movies in the library");
        }
        else {
            for (Movie movie : movies) {
                movie.printMovieInfo();
            }
        }
        System.out.println("##########################################");
    }
}
