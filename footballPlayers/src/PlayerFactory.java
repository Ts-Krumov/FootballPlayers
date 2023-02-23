import java.util.ArrayList;
import java.util.Scanner;

public class PlayerFactory {
    private ArrayList<Player> playerList;


    public PlayerFactory(){
        playerList = new ArrayList<Player>();
    }

    public void addPlayer(){
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        String team = scanner.nextLine();
        int goals = Integer.parseInt(scanner.nextLine());
        int assists = Integer.parseInt(scanner.nextLine());
        int yCards = Integer.parseInt(scanner.nextLine());
        int rCards = Integer.parseInt(scanner.nextLine());
        double rating =Double.parseDouble(scanner.nextLine());
        double mValue =Double.parseDouble(scanner.nextLine());

        Player player = new Player(name, team, goals, assists, yCards, rCards, rating, mValue);
        player.setName(name);
        player.setTeam(team);
        player.setGoals(goals);
        player.setAssists(assists);
        player.setYellowCards(yCards);
        player.setRedCards(rCards);
        player.setRating(rating);
        player.setMarketValue(mValue);
        playerList.add(player);
    }

    public void printPlayers(){
        for(Player plr : playerList){
            System.out.println("Name: " +plr.getName());
            System.out.println("Team: " +plr.getTeam());
            System.out.println("Goals: " +plr.getGoals());
            System.out.println("Assists: " +plr.getAssists());
            System.out.println("Yellow Cards: " +plr.getYellowCards());
            System.out.println("Red Cards: " +plr.getRedCards());
            System.out.println("Rating: " +plr.getRating());
            System.out.println("Market Value: " +plr.getMarketValue() + "mil.");
            System.out.printf("--------------");
            System.out.println("");
        }
    }
}
