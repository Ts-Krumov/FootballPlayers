import java.util.ArrayList;

public class Team {
    private String name;

    private ArrayList<Player> squad;

    private Stats stats;


    public Team(String name){
        this.name = name;
        squad = new ArrayList<Player>(11);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<Player> getSquad() {
        return squad;
    }

    public void setSquad(ArrayList<Player> squad) {
        this.squad = squad;
    }

    public Stats getStats() {
        return stats;
    }

    public void setStats(Stats stats) {
        this.stats = stats;
    }
    
    public void buyPlayer(String name){
        for(Player player : PlayerDB.playerList){
            if(name.equals(player.getName())){
                squad.add(player);
                System.out.printf("Congratulations! You team have bought %s\n",player.getName());
            }
        }
    }

    public void sellPlayer(String name){
        for(Player player : PlayerDB.playerList){
            if(name.equals(player.getName())){
                squad.remove(player);
                System.out.printf("You team have sold %s",player.getName());
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
}
