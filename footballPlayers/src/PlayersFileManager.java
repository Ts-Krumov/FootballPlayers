import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class PlayersFileManager {

    private final String fileName = "playersDB.txt";
    public static List<Player> playerList;


    public void readPlayers(){
            for(Player player:playerList){
                System.out.println(player);
            }
        }

    public void loadPlayers(){
        try(FileInputStream fis = new FileInputStream(fileName);
            ObjectInputStream in = new ObjectInputStream(fis)) {
            playerList = (ArrayList<Player>) in.readObject();
        }catch (IOException | ClassNotFoundException e){
            System.out.println("Loading Players error: " + e.getMessage());
        }

    }

    public void writePlayers() {
        try (FileOutputStream file = new FileOutputStream(fileName);
             ObjectOutputStream out = new ObjectOutputStream(file);){
            out.writeObject(playerList);
        } catch (IOException e) {
            System.out.println("Writing File error: " + e.getMessage());
        }
    }
}
