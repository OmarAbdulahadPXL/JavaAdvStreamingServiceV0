package be.pxl.ja.streamingservice.model;

public abstract class Content {
    private String title;
    private Rating maturityRating;
    private String imageUrl;

    Content(String title, Rating maturityRating, String imageUrl) {
        this.title = title;
        this.maturityRating = maturityRating;
        this.imageUrl = imageUrl;
    }

    public Rating getMaturityRating() {
        return maturityRating;
    }

    public String getTitle() {
        return title;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    @Override
    public String toString() {
        return "Content{" +
                "title='" + title + '\'' +
                ", maturityRating=" + maturityRating +
                ", imageUrl='" + imageUrl + '\'' +
                '}';
    }
}
