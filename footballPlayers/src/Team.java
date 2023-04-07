import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Random;

public class Team implements Serializable {
    private String name;

    private List<Player> squad;

    private int wins;

    private int loses;

    private int draws;


    public Team(String name, int wins, int draws, int loses){
        this.name = name;
        this.squad = new ArrayList<Player>(11);
        this.wins = wins;
        this.loses = loses;
        this.draws = draws;
    }

    public int getWins() {
        return wins;
    }

    public void setWins(int wins) {
        this.wins = wins;
    }

    public int getLoses() {
        return loses;
    }

    public void setLoses(int loses) {
        this.loses = loses;
    }

    public int getDraws() {
        return draws;
    }

    public void setDraws(int draws) {
        this.draws = draws;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<Player> getSquad() {
        return (ArrayList<Player>) squad;
    }

    public void setSquad(ArrayList<Player> squad) {
        this.squad = squad;
    }

    
    public void buyPlayer(String name){
            for(Player player : PlayersFileManager.playerList) {
                if(squad.size() < 11){
                    if(name.equals(player.getName())){
                        squad.add(player);
                        System.out.printf("Congratulations! You team have bought %s\n",player.getName());
                    }
                }else {
                    System.out.println("Max team size is reached. You can not buy more Players.");
                }
            }
    }

    public void sellPlayer(String name){
        for(Iterator<Player> iterator = squad.iterator(); iterator.hasNext();){
            Player player = iterator.next();
            if (player.getName().equals(name)) {
            iterator.remove();
            }
        }
    }

    public double checkTeamValue(){
        double sum = 0;
        for(Player player: squad){
            double priceToAdd = player.getPrice();
            sum+=priceToAdd;
        }
        return sum;
    }

    public void playAgainst(Team away){
        Random random = new Random();
        int homeGoals, awayGoals;
        if(this.checkTeamValue() > away.checkTeamValue()){
            homeGoals = random.nextInt(6);
            awayGoals = random.nextInt(2);
        } else{
            homeGoals = random.nextInt(2);
            awayGoals = random.nextInt(6);
        }
        if(homeGoals > awayGoals){
            this.wins++;
            away.loses++;
        }else if(homeGoals < awayGoals){
            this.loses++;
            away.wins++;
        }else{
            this.draws++;
            away.draws++;
        }

        System.out.printf("%s %d : %d %s \n", this.getName(), homeGoals, awayGoals, away.getName());
    }

    @Override
    public String toString() {
        return  name +
                ", squad {" + squad +
                "}, wins=" + wins +
                ", loses=" + loses +
                ", draws=" + draws;
    }
}
