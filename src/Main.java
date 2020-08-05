import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) throws JsonProcessingException {

        ObjectMapper objectMapper = new ObjectMapper();
        RedditTopNews redditTopNews = new RedditTopNews();
        Data data = new Data();
        redditTopNews.setData(data);
        Children children = new Children();
       // Data1 data = new Data1();
        children.setNewsParams(data);
        redditTopNews.kind = "Listing";
        data.setModhash("Modhash");
        data.setDist(25);

        data.children = new ArrayList<>();
        data.children.add(children);
        String result = objectMapper.writeValueAsString(redditTopNews);
        System.out.println(result);


    }
}
