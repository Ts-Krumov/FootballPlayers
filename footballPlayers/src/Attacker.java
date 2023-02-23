public class Attacker extends  Player{
    private int shots;
    private int crosses;

    public Attacker(String name, String team,int goals, int assists, int yellowCards, int redCards, double rating, double marketValue, int shots, int crosses){
        super(name, team, goals, assists, yellowCards, redCards, rating, marketValue);
        this.shots = shots;
        this.crosses = crosses;
    }

    public int getGoals() {
        return shots;
    }


    public void setGoals(int goals) {
        this.shots = shots;
    }


    public int getAssists() {
        return crosses;
    }


    public void setAssists(int assists) {
        this.crosses = crosses;
    }
}
