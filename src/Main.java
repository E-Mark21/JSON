import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) throws JsonProcessingException {

        ObjectMapper objectMapper = new ObjectMapper();
        RedditTopNews redditTopNews = new RedditTopNews();
        Data data = new Data();
        List<NewsArray> newsArrays = new ArrayList<>();
        NewsArray newsArray = new NewsArray();
        News news = new News();
        redditTopNews.setKind("Listing");
        data.setModhash("Modhash");
        data.setDist(25);
        news.setSubreddit("r/ost");
        news.setGilded(3);
        news.setThumbnail("URL_Pictures");
        news.setCreated(68468462L);
        news.setAuthor("ost");
        news.setNum_comments(2645);
        news.setCreated_utc(65962665L);
        newsArray.setKind("t3");
        redditTopNews.setData(data);
        newsArray.setNews(news);
        data.setNewsArray(newsArrays);
        newsArrays.add(newsArray);

        String result = objectMapper.writeValueAsString(redditTopNews);
        System.out.println(result);

        String json = "{\"kind\": \"Listing\", \"data\": {\"modhash\": \"\",\"dist\": 25,\"children\": [{\"kind\": \"t3\",\"data\": {\"subreddit\": \"funny\",\"gilded\": 3,\"thumbnail\": \"https://b.thumbs.redditmedia.com/hx81ohJKZmTEzAHC0RYsp85LCfYTpohDsxjNPGEAQHw.jpg\",\"created\": 1596510531,\"author\": \"OhCaptainDem\",\"num_comments\": 3254,\"created_utc\": 1596481731}}]}}";
        RedditTopNews redditTopNews1 = objectMapper.readValue(json, RedditTopNews.class);
        System.out.println(redditTopNews1);
    }}
