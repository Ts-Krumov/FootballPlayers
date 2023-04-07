
import java.io.*;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class PlayerManager implements Serializable {

    private final String fileName = "playersDB.txt";
    public static ArrayList<Player> playerList;


    public PlayerManager(){
        playerList = new ArrayList<Player>();
    }

    Scanner scanner = new Scanner(System.in);

    public void createPlayer(){
        System.out.println("Name:");
        String name = scanner.nextLine();
        System.out.println("Price:");
        Double price = Double.parseDouble(scanner.nextLine());
        Player player = new Player(name, price);
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

    public void deletePlayer(){
        System.out.println("Player you want to Delete?");
        String name = scanner.nextLine();
        for(Iterator<Player> iterator = playerList.iterator(); iterator.hasNext();){
            Player player = iterator.next();
            if(name.equals(player.getName())){
                iterator.remove();
                System.out.printf("Player %s has been deleted", player.getName());
            }
        }
    }

    public void editPlayer(){
        System.out.println("Player you want to Edit?");
        String name = scanner.nextLine();
        for(Player player: playerList){
            if(name.equals(player.getName())){
                System.out.println("You are editing: " + player.toString());
                System.out.println("Edit name  / price / all ?");
                Scanner scanner = new Scanner(System.in);
                String option = scanner.nextLine();
                switch (option){
                    case "name":
                        System.out.println("New name? ");
                        String newName = scanner.nextLine();
                        player.setName(newName);
                        break;
                    case "price":
                        System.out.println("New price? ");
                        Double newPrice = Double.parseDouble(scanner.nextLine());
                        player.setPrice(newPrice);
                        break;
                    case "all":
                        System.out.println("New name? ");
                        String editName = scanner.nextLine();
                        player.setName(editName);
                        System.out.println("New price? ");
                        Double editPrice = Double.parseDouble(scanner.nextLine());
                        player.setPrice(editPrice);
                        break;
                    default:
                        System.out.println("Not a valid field!");
                        break;

                }
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
            System.out.println("File error: " + e.getMessage());
        }

    } public void loadPlayers(){
        try(FileInputStream fis = new FileInputStream(fileName);
            ObjectInputStream in = new ObjectInputStream(fis)) {
            playerList = (ArrayList<Player>) in.readObject();
        }catch (IOException | ClassNotFoundException e){
            System.out.println("File error: " + e.getMessage());
        }

    }

    public void writePlayersSerializable() {
        try (FileOutputStream file = new FileOutputStream(fileName);
             ObjectOutputStream out = new ObjectOutputStream(file);){
            out.writeObject(playerList);
        } catch (IOException e) {
            System.out.println("File error: " + e.getMessage());
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
