package opgave02.storage;

import opgave02.models.Actor;
import opgave02.models.Director;
import opgave02.models.Movie;
import opgave02.models.TVSerie;

import java.util.ArrayList;

public class Storage {
    private ArrayList<Movie> movies = new ArrayList<Movie>();
    private ArrayList<TVSerie> series = new ArrayList<>();
    private ArrayList<Actor> actors = new ArrayList<Actor>();

    public void directorsMovies(Director director) {
        for (Movie movie : movies) {
            if (movie.getDirector().getName().equals(director.getName())){
                movie.getTitle();
            }
        }
    }

    public void addMovie(Movie movie) {
        movies.add(movie);
    }

    public void printMovieList() {
        for (Movie movie : movies) {
            System.out.println(movie.toString());
        }
    }

    public void addActor(Actor actor) {
        actors.add(actor);
    }

    public void printAcotrList() {
        for (Actor actor : actors) {
            System.out.println(actor.toString());
        }
    }

    public void addTVSerie(TVSerie serie) {
        series.add(serie);
    }

    public void printTVSerieList() {
        for (TVSerie serie : series) {
            System.out.println(serie.toString());
        }
    }


}
