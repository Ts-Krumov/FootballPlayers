
import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class TeamDB implements Serializable {

    private final String fileName = "playersList.txt";
    private ArrayList<Player> playerList;


    public TeamDB(){
        playerList = new ArrayList<Player>();
    }

    public void addPlayer(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Name:");
        String name = scanner.nextLine();
        System.out.println("Team:");
        String team = scanner.nextLine();
        System.out.println("Price:");
        Double price = Double.parseDouble(scanner.nextLine());
        Player player = new Player(name, team, price);
        playerList.add(player);
    }


    public void printPlayerList(){
        for(Player player: playerList){
            System.out.println(player);
        }
    }

    public double totalSum(){
        double totalSum = 0;
        for(Player player : playerList){
            totalSum+=player.getPrice();
        }
        return totalSum;
    }

    public void removePlayer(String name){
        for(Player player: playerList){
            if(name.equals(player.getName())){
                playerList.remove(player);
            }
        }
    }

    public void readPlayersSerializable(){
        try(FileInputStream fis = new FileInputStream(fileName);
            ObjectInputStream in = new ObjectInputStream(fis)) {
            playerList = (ArrayList<Player>) in.readObject();
            for(Player player:playerList){
                System.out.println(player);
            }

        }catch (IOException | ClassNotFoundException e){
            e.printStackTrace();
        }

    }

    public void writePlayersSerializable() {
        try (FileOutputStream file = new FileOutputStream(fileName);
             ObjectOutputStream out = new ObjectOutputStream(file);){
                out.writeObject(playerList);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public String getFileName() {
        return fileName;
    }

    public ArrayList<Player> getPlayerList() {
        return playerList;
    }

    public void setPlayerList(ArrayList<Player> playerList) {
        this.playerList = playerList;
    }
}
