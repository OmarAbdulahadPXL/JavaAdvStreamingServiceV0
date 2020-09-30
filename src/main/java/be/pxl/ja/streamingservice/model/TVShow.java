package be.pxl.ja.streamingservice.model;

public final class TVShow extends Content{
    private int numberOfSeasons;

    public TVShow(String title, Rating rating, int numberOfSeasons) {
        this(title, rating, "none", numberOfSeasons);
    }
    public TVShow(String title, Rating maturityRating, String imageUrl, int numberOfSeasons) {
        super(title, maturityRating, imageUrl);
        this.numberOfSeasons = numberOfSeasons;
    }

    public int getNumberOfSeasons() {
        return numberOfSeasons;
    }
}
