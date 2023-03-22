import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class TeamDB implements Serializable {

    private String TeamsFileName = "teamsDB.txt";

    private ArrayList<Team> teamsList;

    Scanner scanner = new Scanner(System.in);

    public TeamDB(){
        teamsList = new ArrayList<Team>();
    }

    public void createTeam(){
        System.out.println("Enter name of the team you want to create: ");
        String name = scanner.nextLine();
        Team team = new Team(name,0,0,0);
        teamsList.add(team);
    }

    public void deleteTeam(String name){
        for(Team team: teamsList){
            if(name.equals(team.getName())){
                teamsList.remove(team);
            }
        }
    }

    public void readTeams(){

            try(FileInputStream fis = new FileInputStream(TeamsFileName);
                ObjectInputStream in = new ObjectInputStream(fis)) {
                teamsList = (ArrayList<Team>) in.readObject();
                for(Team team:teamsList){
                    System.out.println(team);
                }

            }catch (IOException | ClassNotFoundException e){
                e.printStackTrace();
            }
    }

    public void loadTeams(){

            try(FileInputStream fis = new FileInputStream(TeamsFileName);
                ObjectInputStream in = new ObjectInputStream(fis)) {
                teamsList = (ArrayList<Team>) in.readObject();
            }catch (IOException | ClassNotFoundException e){
                e.printStackTrace();
            }
    }

    public void writeTeams() {
        try (FileOutputStream file = new FileOutputStream(TeamsFileName);
             ObjectOutputStream out = new ObjectOutputStream(file);){
            out.writeObject(teamsList);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public void makeTransfers(){
        System.out.println("Enter name of the team: ");
        String teamName = scanner.nextLine();
        for(Team team:teamsList){
            if(teamName.equals(team.getName())){
                System.out.println("Sell / Buy Player?");
                String command = scanner.nextLine();
                if(command.equals("Sell")){
                    System.out.println("Name of the player you want to sell:");
                    String playerName = scanner.nextLine();
                    team.sellPlayer(playerName);
                }else if(command.equals("buy")){
                    System.out.println("Name of the player you want to buy:");
                    String playerName = scanner.nextLine();
                    team.buyPlayer(playerName);
                }else {
                    System.out.println("Not a valid action!");
                }

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
        for (Team team: teamsList){
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
        for(Team team:teamsList){
            System.out.println(team);
        }
    }

}
