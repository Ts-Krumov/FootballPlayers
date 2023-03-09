public class Main {
    public static void main(String[] args) {
        TeamDB playersSelection = new TeamDB();

        playersSelection.readPlayersSerializable();
        System.out.println(" ////////////////////////////////////// ");
        playersSelection.editPlayer("Rashford");
        playersSelection.writePlayersSerializable();
        System.out.println("/////////////////////////  FINAL RESULT  /////////////////////////");
        playersSelection.readPlayersSerializable();




    }
}