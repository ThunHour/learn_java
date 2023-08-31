import java.util.*;
import java.io.*;

class Movie implements Comparable<Movie> {
    private double rating;
    private String name;
    private int year;

    @Override
    public int compareTo(Movie o) {
        return this.year - o.year;
    }

    public Movie(double rt, String nm, int yr) {
        this.rating = rt;
        this.name = nm;
        this.year = yr;
    }

    public double getRating() {
        return rating;
    }

    public String getName() {
        return name;
    }

    public int getYear() {
        return year;
    }
}

class RatingCompare implements Comparator<Movie> {
    public int compare(Movie m1, Movie m2) {
        if (m1.getRating() < m2.getRating()) {
            return -1;
        } else if (m1.getRating() > m2.getRating()) {
            return 1;
        }
        return 0;
    }

}

class NameCompare implements Comparator<Movie> {
    public int compare(Movie m1, Movie m2) {
        return m1.getName().compareTo(m2.getName());
    }
}

class YearCompare implements Comparator<Movie> {
    public int compare(Movie m1, Movie m2) {
        if (m1.getYear() < m2.getYear()) {
            return -1;
        }
        if (m1.getYear() > m2.getYear()) {
            return 1;
        } else
            return 0;
    }
}

public class comparator {
    public static void main(String[] args) {
        ArrayList<Movie> movies = new ArrayList<Movie>();
        movies.add(new Movie(8.3, "Force Awakens", 2015));
        movies.add(new Movie(8.7, "Star Wars", 1977));
        movies.add(new Movie(8.8, "Empire Strikes Back", 1980));
        movies.add(new Movie(8.4, "Return of the jedi", 1983));

        for (Movie m : movies) {
            System.out.println(
                    String.format("Title: %s  , Rate: %.1f , Year: %d", m.getName(), m.getRating(), m.getYear()));
        }
        System.out.println(" \n Collections.sort(movies); \n");
        Collections.sort(movies);
        for (Movie m : movies) {
            System.out.println(
                    String.format("Title: %s  , Rate: %.1f , Year: %d", m.getName(), m.getRating(), m.getYear()));
        }
        RatingCompare RC = new RatingCompare();

        Collections.sort(movies, RC);

        System.out.println(" \n   Collections.sort(movies, ratingCompare); \n");

        for (Movie s : movies) {

            System.out.println(

                    String.format("Title: %s  , Rate: %.1f , Year: %d", s.getName(), s.getRating(), s.getYear()));
        }
        NameCompare NC = new NameCompare();
        Collections.sort(movies, NC);
        System.out.println(" \n    Collections.sort(movies, NC); \n");
        for (Movie s : movies) {
            System.out.println(
                    String.format("Title: %s  , Rate: %.1f , Year: %d", s.getName(), s.getRating(), s.getYear()));
        }
        YearCompare YC = new YearCompare();
        Collections.sort(movies, YC);
        System.out.println(" \n     Collections.sort(movies, YC); \n");
        for (Movie s : movies) {
            System.out.println(
                    String.format("Title: %s  , Rate: %.1f , Year: %d", s.getName(), s.getRating(), s.getYear()));
        }
    }
}