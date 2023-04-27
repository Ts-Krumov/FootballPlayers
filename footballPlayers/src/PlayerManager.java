
import java.io.*;
import java.util.Iterator;
import java.util.Scanner;

public class PlayerManager implements Serializable {
    Scanner scanner = new Scanner(System.in);

    public void createPlayer(){
        boolean PlayerExists = false;
        System.out.println("Name:");
        String name = scanner.nextLine();
        System.out.println("Price:");
        Double price = Double.parseDouble(scanner.nextLine());
        Player player = new Player(name, price);
        for(Player playerInList : PlayersFileManager.playerList){
            if(playerInList.getName().equals(player.getName())){
                System.out.println("Player already exists!");
                PlayerExists = true;
                break;
            }
        }
        if(!PlayerExists){
            System.out.println("Player Created successfully!");
            PlayersFileManager.playerList.add(player);
        }
    }

    public void deletePlayer(){
        System.out.println("Player you want to Delete?");
        String name = scanner.nextLine();
        for(Iterator<Player> iterator = PlayersFileManager.playerList.iterator(); iterator.hasNext();){
            Player player = iterator.next();
            if(name.equals(player.getName())){
                iterator.remove();
                System.out.printf("Player %s has been deleted ", player.getName());
                break;
            }else {
                System.out.println("Player not found.");
            }
        }
    }

    public void editPlayer(){
        System.out.println("Player you want to Edit?");
        String name = scanner.nextLine();
        for(Player player: PlayersFileManager.playerList){
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
            }else {
                System.out.println("Player not found.");
            }
        }
    }


}
