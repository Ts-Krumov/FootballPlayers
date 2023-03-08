public class Main {
    public static void main(String[] args) {
        TeamDB playersSelection = new TeamDB();

        playersSelection.readPlayersSerializable();
        playersSelection.addPlayer();
        playersSelection.removePlayer("Fred");
        playersSelection.writePlayersSerializable();
        playersSelection.readPlayersSerializable();




    }
}