import java.io.Serializable;

public class Performance implements Serializable {
    private int goals;
    private int assists;


    public Performance(int goals, int assists){
        this.goals= goals;
        this.assists = assists;
    }

    public int getGoals() {
        return goals;
    }

    public void setGoals(int goals) {
        this.goals = goals;
    }

    public int getAssists() {
        return assists;
    }

    public void setAssists(int assists) {
        this.assists = assists;
    }

}
