public class Attacker extends  Player{
    private int goals;
    private int assists;

    public Attacker(String name, String team, int yellowCards, int redCards, double rating, double marketValue, boolean isInjured, int goals, int assists){
        super(name, team, yellowCards, redCards, rating, marketValue, isInjured);
        this.goals = goals;
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
