import com.fasterxml.jackson.annotation.JsonProperty;

public class NewsArray {
    @JsonProperty("kind")
    private String kind;
    @JsonProperty("data")
    private News news;


    public String getKind() {
        return kind;
    }
    public void setKind(String kind) {
        this.kind = kind;
    }
    public News getNews() {
        return news;
    }
    public void setNews(News news) {
        this.news = news;
    }
}

