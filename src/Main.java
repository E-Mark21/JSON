import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class Main {

    public static void main(String[] args) throws JsonProcessingException {

        ObjectMapper objectMapper = new ObjectMapper();
        RedditTopNews redditTopNews = new RedditTopNews();
        Data data = new Data();
        redditTopNews.setData(data);
        DataObject dataObject = new DataObject();
        redditTopNews.kind = "Listing";
        data.modhash = "madhash";
        data.dist = 1;
        data.children1 = new Children();
        data.children1.kind = "t3";
        dataObject.setAuthor("ost");
        dataObject.setSubreddit("r/ost");
        dataObject.setCreated(655465454L);
        dataObject.setCreated_utc(5246426424L);
        dataObject.setThumbnail("URL_Pictures");
        dataObject.setNum_comments(645468);
        data.children1.setDataObject(dataObject);
        String result = objectMapper.writeValueAsString(redditTopNews);
        System.out.println(result);





    }
}
