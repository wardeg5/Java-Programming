
/**
 * Write a description of class MovieLibrary here.
 * 
 * @author Warren Degenhardt
 * @version 7/25/2015
 * 
 * -Added a private field called movies whose type is ArrayList<Movie>
 * -Wrote a constructor that takes no parameters and creates a new ArrayList<Movie> assigning it to the movies field.
 *-Created an addMovie method that takes a title and run length as parameters. 
 *-Create a parameterless printMovies method. It  prints information on all the movies in the library
 */
import java.util.ArrayList;


public class MovieLibrary
{
    // instance variables - replace the example below with your own
   private ArrayList<Movie> movies;

    /**
     * Constructor that takes no parameters and creates a new ArrayList<Movie> assigning it to the movies field.
     */
    public MovieLibrary()
    {
           movies = new ArrayList<Movie>();

        // initialise instance variables
      
    }

    /**
     * addMovie method that takes a title and run length as parameters.
     * The method creates a new Movie object using the
     * given parameters and add that Movie object to the movies list.
     * 
     */
    public void addMovie(String title, int runLength)
    {
        movies.add(new Movie(title, runLength));
    }
    
     public String printmovies()
    {
        System.out.println("#################");    
    if (movies.isEmpty()) {
    System.out.println("No movies in the library");
    }
    else {
    for (Movie movie : movies) {
       movie.printMovieInfo();

    }
      }
              System.out.println("#################");    
                   return null;
    }

}
