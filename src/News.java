import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

public class News {
    @JsonProperty("approved_at_utc")
    private String approved_at_utc;
    @JsonProperty("subreddit")
    private String subreddit;
    @JsonProperty("selftext")
    private String selftext;
    @JsonProperty("author_fullname")
    private String author_fullname;
    @JsonProperty("saved")
    private boolean saved;
    @JsonProperty("mod_reason_title")
    private String mod_reason_title;
    @JsonProperty("gilded")
    private int gilded;
    @JsonProperty("clicked")
    private boolean clicked;
    @JsonProperty("title")
    private String title;
    @JsonProperty("link_flair_richtext")
    List<String> link_flair_richtext;
    @JsonProperty("subreddit_name_prefixed")
    private String subreddit_name_prefixed;
    @JsonProperty("hidden")
    private boolean hidden;
    @JsonProperty("pwls")
    private int pwls;
    @JsonProperty("link_flair_css_class")
    private String link_flair_css_class;
    @JsonProperty("downs")
    private int downs;


    @JsonProperty("author")
    private String author;
    @JsonProperty("subreddit")
    private String subreddit;
    @JsonProperty("created")
    private long created;
    @JsonProperty("created_utc")
    private long created_utc;
    @JsonProperty("thumbnail")
    private String thumbnail;
    @JsonProperty("num_comments")
    private int num_comments;
    @JsonProperty("gilded")
    private int gilded;


}
