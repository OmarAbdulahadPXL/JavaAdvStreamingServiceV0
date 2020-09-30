package be.pxl.ja.streamingservice.model;

import java.time.LocalDate;

public class Documentary extends Movie{
    private String topic;

    public Documentary(String title, Rating maturityRating) {
        this(title, maturityRating, "ImageURL", "unknown",LocalDate.now(),0,"none");
    }
    public Documentary(String title,
                       Rating maturityRating,
                       String imageUrl,
                       String director,
                       LocalDate releaseDate,
                       int duration,
                       String topic) {
        super(title, maturityRating, imageUrl, director, releaseDate, duration, Genre.DOCUMENTARY);
        this.topic = topic;
    }

    public String getTopic() {
        return topic;
    }

    public void setTopic(String topic) {
        this.topic = topic;
    }

    @Override
    public void play() {
        StringBuilder result = new StringBuilder();
        result.append("PLaying documentary ").append(this);
        if (topic != null) {
            result.append(" on ").append(topic);
        }
        System.out.println(result.toString());
    }

    @Override
    public void pause() {
        System.out.println("Pausing documentary " + this);
    }
}
