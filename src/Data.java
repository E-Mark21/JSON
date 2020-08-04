import java.util.ArrayList;
import java.util.List;

public class Data {

    String modhash;
    int dist;
    Children children1 = new Children();
    List<Children> children = new ArrayList<>();

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

    public Children getChildren1() {
        return children1;
    }

    public void setChildren1(Children children1) {
        this.children1 = children1;
    }
}

