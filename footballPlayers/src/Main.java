import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        PlayerDB players = new PlayerDB();
        TeamDB teams = new TeamDB();


        System.out.println("Welcome to FootballLeague!");
        System.out.println("Choose an action: \n" +
                "-Create player \n" +
                "-Delete player \n" +
                "-Edit player \n" +
                "-Create team \n" +
                "-Delete team \n" +
                "-Make transfers \n" +
                "-Print players \n" +
                "-Print teams \n" +
                "-Play game \n");
        String action = scanner.nextLine();
        while (!action.equals("exit")){
            players.loadPlayers();
            teams.loadTeams();
            switch (action){
                case "Create player":
                    players.createPlayer();
                    break;
                case "Delete player":
                    players.deletePlayer();
                    break;
                case "Edit player":
                    players.editPlayer();
                    break;
                case "Delete team":
                    teams.deleteTeam();
                    break;
                case "Create team":
                    teams.createTeam();
                    break;
                case "Make transfers":
                    teams.makeTransfers();
                    break;
                case "Play game":
                    teams.playGame();
                    break;
                case "Print players":
                    players.readPlayersSerializable();
                    break;
                case "Print teams":
                    teams.readTeams();
                    break;
                default:
                    System.out.println("Not a valid action!");
                    break;
            }
            players.writePlayersSerializable();
            teams.writeTeams();
            System.out.println("New action:");
            action = scanner.nextLine();
        }
    }
}