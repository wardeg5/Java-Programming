import java.util.ArrayList;
/**
 * A library of movies
 * 
 * @author Cara Tang
 * @version 2015.01.23
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
        addMovie("The Sound of Music", 174, 4);
        addMovie("RoboCop", 102, 1);
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
        for (Movie movie : movies) {
            if (title.equals(movie.getTitle())) {
                return movie;
            }
        }
        return null;
    }

    /**
     * Removes the movie with the given title from this movie library.
     * If there are multiple movies with that title, only the first is removed.
     * If there is no movie with that title, nothing is changed.
     * @param title title of the movie to remove
     */
    public void removeMovie(String title)
    {
        movies.remove(findMovieByTitle(title));
    }
    
    /**
     * @param starRating the star rating to look for
     * @return a list of all movies in this library with the given star rating
     */
    public ArrayList<Movie> getMoviesWithStarRating(int starRating)
    {
        ArrayList<Movie> moviesWithStarRating = new ArrayList<>();
        for (Movie movie : movies) {
            if (starRating == movie.getStarRating()) {
                moviesWithStarRating.add(movie);
            }
        }
        return moviesWithStarRating;
    }
    
    /**
     * Prints a report showing the number of movies in this library of each star rating,
     * including not rated
     */
    public void printRatingReport1()
    {
        // ---------- Implementation 1 - less efficient, more concise
        System.out.println("##########################################");

        System.out.println("4-star movies: " + getMoviesWithStarRating(4).size());
        System.out.println("3-star movies: " + getMoviesWithStarRating(3).size());
        System.out.println("2-star movies: " + getMoviesWithStarRating(2).size());
        System.out.println("1-star movies: " + getMoviesWithStarRating(1).size());
        System.out.println("Unrated movies: " + getMoviesWithStarRating(0).size());
        
        System.out.println("##########################################");
    }

    /**
     * Prints a report showing the number of movies in this library of each star rating,
     * including not rated
     */
    public void printRatingReport2()
    {
        // ---------- Implementation 2 - more efficient, less concise
        System.out.println("##########################################");
        
        int oneStarMovies = 0;
        int twoStarMovies = 0;
        int threeStarMovies = 0;
        int fourStarMovies = 0;
        int unratedMovies = 0;
        for (Movie movie : movies) {
            if (movie.getStarRating() == 1) {
                oneStarMovies++;
            }
            else if (movie.getStarRating() == 2) {
                twoStarMovies++;
            }
            else if (movie.getStarRating() == 3) {
                threeStarMovies++;
            }
            else if (movie.getStarRating() == 4) {
                fourStarMovies++;
            }
            else {
                unratedMovies++;
            }
        }
        System.out.println("4-star movies: " + fourStarMovies);
        System.out.println("3-star movies: " + threeStarMovies);
        System.out.println("2-star movies: " + twoStarMovies);
        System.out.println("1-star movies: " + oneStarMovies);
        System.out.println("Unrated movies: " + unratedMovies);
        
        System.out.println("##########################################");
    }
    
    /**
     * Prints a report showing the number of movies in this library of each star rating,
     * including not rated
     */
    public void printRatingReport3()
    {
        // ---------- Implementation 3 - use array histogram, efficient and concise
        System.out.println("##########################################");
        
        int[] numMoviesOfStarRating = new int[5];
        for (Movie movie : movies) {
            numMoviesOfStarRating[movie.getStarRating()]++;
        }
        
        System.out.println("4-star movies: " + numMoviesOfStarRating[4]);
        System.out.println("3-star movies: " + numMoviesOfStarRating[3]);
        System.out.println("2-star movies: " + numMoviesOfStarRating[2]);
        System.out.println("1-star movies: " + numMoviesOfStarRating[1]);
        System.out.println("Unrated movies: " + numMoviesOfStarRating[0]);
        
        System.out.println("##########################################");
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
