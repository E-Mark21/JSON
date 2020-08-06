import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

public class Data {
    @JsonProperty("modhash")
    private String modhash;
    @JsonProperty("dist")
    private int dist;
    @JsonProperty("children")
    List<NewsArray> newsArray;



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
    public List<NewsArray> getNewsArray() {
        return newsArray;
    }
    public void setNewsArray(List<NewsArray> newsArray) {
        this.newsArray = newsArray;
    }

}

