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
    @JsonProperty("thumbnail_height")
    private int thumbnail_height;
    @JsonProperty("top_awarded_type")
    private String top_awarded_type;
    @JsonProperty("hide_score")
    private boolean hide_score;
    @JsonProperty("name")
    private String name;
    @JsonProperty("quarantine")
    private boolean quarantine;
    @JsonProperty("link_flair_text_color")
    private String link_flair_text_color;
    @JsonProperty("upvote_ratio")
    private double upvote_ratio;
    @JsonProperty("author_flair_background_color")
    private String author_flair_background_color;
    @JsonProperty("subreddit_type")
    private String subreddit_type;
    @JsonProperty("ups")
    private int ups;
    @JsonProperty("total_awards_received")
    private int total_awards_received;
    @JsonProperty("thumbnail_width")
    private int thumbnail_width;
    @JsonProperty("author_flair_template_id")
    private String author_flair_template_id;
    @JsonProperty("is_original_content")
    private boolean is_original_content;
    @JsonProperty("user_reports")
    List<String> user_reports;
    @JsonProperty("secure_media")
    private SecureMedia secureMedia;
    @JsonProperty("is_reddit_media_domain")
    private boolean is_reddit_media_domain;
    @JsonProperty("is_meta")
    private boolean is_meta;
    @JsonProperty("category")
    private String category;
    @JsonProperty("secure_media_embed")
    private SecureMediaEmbeded secureMediaEmbeded;
    @JsonProperty("link_flair_text")
    private String link_flair_text;
    @JsonProperty("can_mod_post")
    private boolean can_mod_post;
    @JsonProperty("score")
    private int score;
    @JsonProperty("approved_by")
    private String approved_by;
    @JsonProperty("author_premium")
    private boolean author_premium;
    @JsonProperty("thumbnail")
    private String thumbnail;
    @JsonProperty("edited")
    private boolean edited;
    @JsonProperty("author_flair_css_class")
    private String author_flair_css_class;
    @JsonProperty("author_flair_richtext")
    List<String> author_flair_richtext;
    @JsonProperty("gildings")
    private Gildings gildings;
    @JsonProperty("post_hint")
    private String post_hint;
    @JsonProperty("content_categories")
    private String content_categories;
    @JsonProperty("is_self")
    private boolean is_self;
    @JsonProperty("mod_note")
    private String mod_note;
    @JsonProperty("created")
    private long created;
    @JsonProperty("link_flair_type")
    private String link_flair_type;
    @JsonProperty("wls")
    private int wls;
    @JsonProperty("removed_by_category")
    private String removed_by_category;
    @JsonProperty("banned_by")
    private String banned_by;
    @JsonProperty("author_flair_type")
    private String author_flair_type;
    @JsonProperty("domain")
    private String domain;
    @JsonProperty("allow_live_comments")
    private String allow_live_comments;
    @JsonProperty("selftext_html")
    private String selftext_html;
    @JsonProperty("likes")
    private String likes;
    @JsonProperty("suggested_sort")
    private String suggested_sort;
    @JsonProperty("banned_at_utc")
    private String banned_at_utc;
    @JsonProperty("url_overridden_by_dest")
    private String url_overridden_by_dest;




























}
