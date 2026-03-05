package opgave02.models;

import java.util.ArrayList;

public class Movie extends MotionPicture {
    private int productionYear;
    private Director director;
    private double rating;

    public Movie(String title, int productionYear, Director director, Genre[] genres,
                 double rating, ArrayList<Actor> cast) {
        super(title, genres, cast);
        this.productionYear = productionYear;
        this.director = director;
        this.rating = rating;
    }

    public Director getDirector() {
        return director;
    }

    public String getTitle() {
        return super.getTitle();
    }

    public String toString() {
        return "Movie{" +
                "productionYear=" + productionYear +
                ", director=" + director +
                ", rating=" + rating +
                '}';
    }
}