import java.util.Scanner;

public class AppMenu {
    Scanner scanner = new Scanner(System.in);

    public void startApp(){
        PlayerManager players = new PlayerManager();
        TeamManager teams = new TeamManager();
        TeamsFileManager TFM = new TeamsFileManager();
        PlayersFileManager PFM = new PlayersFileManager();
        League league = new League();


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
                "-Print table \n" +
                "-Play game \n");
        String action = scanner.nextLine();
        while (!action.equals("exit")){
            PFM.loadPlayers();
            TFM.loadTeams();
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
                    PFM.readPlayers();
                    break;
                case "Print teams":
                    TFM.readTeams();
                    break;
                case "Print table":
                    league.sortByPoints();
                    league.printTable();
                    break;
                default:
                    System.out.println("Not a valid action!");
                    break;
            }
            PFM.writePlayers();
            TFM.writeTeams();
            System.out.println("New action:");
            action = scanner.nextLine();

    }

    }
}
