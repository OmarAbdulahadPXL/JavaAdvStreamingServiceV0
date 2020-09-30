package be.pxl.ja.streamingservice.model;

import java.time.LocalDate;

public class Movie extends Content implements Playable{
    public static final int LONG_PLAYING_TIME = 2*60+15;
    private String director;
    private LocalDate releaseDate;
    private int duration;
    private Genre genre;

    public Movie(String title, Rating rating) {
        this(title, rating, "none", "none", LocalDate.now(), 0, Genre.ACTION);
    }

    public Movie(String title,
                 Rating maturityRating,
                 String imageUrl,
                 String director,
                 LocalDate releaseDate,
                 int duration,
                 Genre genre) {
        super(title,maturityRating, imageUrl);
        this.director = director;
        this.releaseDate = releaseDate;
        this.duration = duration;
        this. genre = genre;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public LocalDate getReleaseDate() {
        return releaseDate;
    }

    public void setReleaseDate(LocalDate releaseDate) {
        this.releaseDate = releaseDate;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public Genre getGenre() {
        return genre;
    }

    public void setGenre(Genre genre) {
        this.genre = genre;
    }

    @Override
    public String toString() {

        return super.toString() + "\nMovie{" +
                "director='" + director + '\'' +
                ", releaseDate=" + releaseDate +
                ", duration=" + duration +
                ", genre=" + genre +
                '}';
    }

    @Override
    public void play() {
        System.out.println("Playing " + this);
    }

    @Override
    public void pause() {
        System.out.println("Pausing " + this);
    }
    public boolean isLongPlayingTime() {
        return duration >= LONG_PLAYING_TIME;
    }

}
