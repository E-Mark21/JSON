import java.util.List;

public class Data {

    private String modhash;
    private int dist;
    List<Children> children;
    private String author;
    private String subreddit;
    private long created;
    private long created_utc;
    private String thumbnail;
    private int num_comments;
    private int gilded;


    public String getModhash() {
        return modhash;
    }
    public void setModhash(String modhash) {
        this.modhash = modhash;
    }
    public int getDist() {
        return dist;
    }
    public void setDist(int dist) {
        this.dist = dist;
    }
    public List<Children> getChildren() {
        return children;
    }
    public void setChildren(List<Children> children) {
        this.children = children;
    }
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
    public void setNum_comments(int num_comments) {
        this.num_comments = num_comments;
    }
    public int getGilded() {
        return gilded;
    }
    public void setGilded(int gilded) {
        this.gilded = gilded;
    }
}

