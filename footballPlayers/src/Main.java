public class Main {
    public static void main(String[] args) {
        TeamDB playersSelection = new TeamDB();

     playersSelection.addPlayerToList();
     playersSelection.addPlayerToList();
     playersSelection.writePlayersSerializable();

     playersSelection.readPlayersSerializable();




    }
}