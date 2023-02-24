import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        PlayerFactory playersSelection = new PlayerFactory();
        Scanner scanner = new Scanner(System.in);
        String command = scanner.nextLine();
        while (!command.equals("End")){
            if(command.equals("Add")){
                playersSelection.addPlayer();
            }else if(command.equals("Remove")){
                //add remove function

            }else if(command.equals("Print")){
                playersSelection.readPlayers();
            }
            command = scanner.nextLine();
        }


    }
}