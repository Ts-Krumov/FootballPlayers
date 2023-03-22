public class Main {
    public static void main(String[] args) {
        PlayerDB players = new PlayerDB();
        TeamDB teams = new TeamDB();
        players.loadPlayers();
        teams.loadTeams();



    }
}