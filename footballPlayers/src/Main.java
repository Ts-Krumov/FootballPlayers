public class Main {
    public static void main(String[] args) {
        PlayerDB playersSelection = new PlayerDB();
        Team team1 = new Team("Nie");
        Team team2 = new Team("Vie");
        Game game = new Game();

        playersSelection.loadPlayers();
        //playersSelection.readPlayersSerializable();
        //System.out.println(" <<<----//////////////////  Choose from the players above  /////////////////---->>> ");


        team1.buyPlayer("Rashford");
        team1.buyPlayer("Toney");
        team1.buyPlayer("Fernandes");
        team2.buyPlayer("Mitoma");
        team2.buyPlayer("Trossard");
        team2.buyPlayer("Semedo");


        System.out.printf("Nie: %.2f mln \n",team1.checkTeamValue());
        System.out.printf("Vie: %.2f mln \n",team2.checkTeamValue());
        game.playGame(team1, team2);
//        System.out.println("<<<----//////////////////  FINAL RESULT  /////////////////---->>>");
//        playersSelection.readPlayersSerializable();




    }
}