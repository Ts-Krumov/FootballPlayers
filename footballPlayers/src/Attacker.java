public class Attacker extends  Player{
    private int shots;
    private int crosses;

    public Attacker(String name, String team, int shots, int crosses){
        super(name, team);
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
