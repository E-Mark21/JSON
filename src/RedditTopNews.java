import com.fasterxml.jackson.annotation.JsonAutoDetect;

import java.util.ArrayList;
import java.util.List;
@JsonAutoDetect
public class RedditTopNews {
    String kind;
@JsonAutoDetect
    class Data {
        String modhash;
        int dist;
        List<Children> children = new ArrayList<>();
    }
@JsonAutoDetect
    class Children {
        String kind;
@JsonAutoDetect
        class Data {
            String author;
            String subreddit;
            long created;
            long created_utc;
            String thumbnail;
            int nam_comments;
        }
    }
}

