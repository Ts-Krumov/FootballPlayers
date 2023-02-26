public class Main {
    public static void main(String[] args) {
        TeamDB playersSelection = new TeamDB();
//        Scanner scanner = new Scanner(System.in);
//        String command = scanner.nextLine();
//        while (!command.equals("End")){
//            if(command.equals("Add")){
//                playersSelection.addPlayer();
//            }else if(command.equals("Remove")){
//                //add remove function
//
//            }else if(command.equals("Print")){
//                playersSelection.readPlayers();
//            }
//            command = scanner.nextLine();
//        }
     //playersSelection.addPlayer();
     //playersSelection.addPlayer();
     playersSelection.writePlayersSerializable();
     playersSelection.readPlayersSerializable();


    }
}