import java.util.ArrayList;
import java.util.List;

public class RedditTopNews {
    String kind;

    class Data {
        String modhash;
        int dist;
        List<Children> children = new ArrayList<>();
    }

    class Children {
        String kind;

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

