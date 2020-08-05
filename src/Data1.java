public class Data1 {
    private String author;
    private String subreddit;
    private long created;
    private long created_utc;
    private String thumbnail;
    private int num_comments;
    private int gilded;

    public String getAuthor() {
        return author;
    }
    public void setAuthor(String author) {
        this.author = author;
    }
    public String getSubreddit() {
        return subreddit;
    }
    public void setSubreddit(String subreddit) {
        this.subreddit = subreddit;
    }
    public long getCreated() {
        return created;
    }
    public void setCreated(long created) {
        this.created = created;
    }
    public long getCreated_utc() {
        return created_utc;
    }
    public void setCreated_utc(long created_utc) {
        this.created_utc = created_utc;
    }
    public String getThumbnail() {
        return thumbnail;
    }
    public void setThumbnail(String thumbnail) {
        this.thumbnail = thumbnail;
    }
    public int getNum_comments() {
        return num_comments;
    }
    public int getGilded() {
        return gilded;
    }
    public void setGilded(int gilded) {
        this.gilded = gilded;
    }
    public void setNum_comments(int num_comments) {
        this.num_comments = num_comments;

    }
}
