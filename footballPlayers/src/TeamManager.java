import java.io.*;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class TeamManager implements Serializable {

    Scanner scanner = new Scanner(System.in);

    public void createTeam(){
        System.out.println("Enter name of the team you want to create: ");
        String name = scanner.nextLine();
        for(Team teamInList : TeamsFileManager.teamsList){
            if(teamInList.getName().equals(name)){
                System.out.println("Team already exists!");
                break;
            }
            Team team = new Team(name,0,0,0);
            TeamsFileManager.teamsList.add(team);
        }
    }

    public void deleteTeam(){
        System.out.println("Enter name of the team you want to delete: ");
        String name = scanner.nextLine();
        for(Iterator<Team> iterator = TeamsFileManager.teamsList.iterator(); iterator.hasNext();){
            Team team = iterator.next();
            if (team.getName().equals(name)) {
                iterator.remove();
                System.out.printf("Team %s has been deleted.", team.getName());
            }
        }

    }

    public void makeTransfers(){
        System.out.println("Enter name of the team: ");
        String teamName = scanner.nextLine();
        for(Team team:TeamsFileManager.teamsList){
            if(teamName.equals(team.getName())){
                System.out.println("Sell / Buy Player?");
                String command = scanner.nextLine();
                switch (command){
                    case "Sell":
                        System.out.println("Name of the player you want to sell:");
                        String playerToSell = scanner.nextLine();
                        team.sellPlayer(playerToSell);
                        break;
                    case "Buy":
                        System.out.println("Name of the player you want to buy:");
                        String playerToBuy = scanner.nextLine();
                        team.buyPlayer(playerToBuy);
                        break;
                    default:
                        System.out.println("Not a valid action!");
                        break;
                }
            }else {
                System.out.println("Team not found.");
            }
        }
    }

    public void playGame(){
        Team homeTeam = null;
        Team awayTeam = null;
        System.out.println("Enter home and away teams.");
        System.out.println("Home team:");
        String homeTeamName = scanner.nextLine();
        System.out.println("Away team:");
        String awayTeamName = scanner.nextLine();
        for (Team team: TeamsFileManager.teamsList){
            if(homeTeamName.equals(team.getName())){
                homeTeam = team;
            }
            if(awayTeamName.equals(team.getName())){
                awayTeam = team;
            }
        }
        homeTeam.playAgainst(awayTeam);

    }

    public void printTeams(){
        for(Team team:TeamsFileManager.teamsList){
            System.out.println(team);
        }
    }

}
