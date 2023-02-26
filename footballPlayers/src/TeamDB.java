
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
        System.out.println("Goals:");
        int goals = Integer.parseInt(scanner.nextLine());
        System.out.println("Assists:");
        int assists = Integer.parseInt(scanner.nextLine());
        System.out.println("Yellow cards:");
        int yCards = Integer.parseInt(scanner.nextLine());
        System.out.println("Red cards:");
        int rCards = Integer.parseInt(scanner.nextLine());
        System.out.println("Form:");
        double form =Double.parseDouble(scanner.nextLine());
        System.out.println("Market value:");
        double mValue =Double.parseDouble(scanner.nextLine());

        Player player = new Player(name, team);
        Performance performance = new Performance(goals, assists);
        Cards cards = new Cards(yCards, rCards);
        Rating rating = new Rating(form, mValue);
        player.setCards(cards);
        player.setPerformance(performance);
        player.setRating(rating);
        playerList.add(player);
    }


    public void savePlayers(){
        try{
            BufferedWriter writer = new BufferedWriter(new FileWriter(fileName));
            for(Player plr : playerList){
                String strPlayer = plr.toString();
                writer.write(strPlayer);
                writer.newLine();
            }
            writer.close();

        }catch (IOException e){
            e.printStackTrace();
        }

    }


    public void readPlayers() {
        try(BufferedReader reader = new BufferedReader(new FileReader(fileName));){
            String currentPlayer = reader.readLine();
            while (currentPlayer!=null){
                System.out.println(currentPlayer);
                currentPlayer = reader.readLine();
            }
        }catch (IOException e){
            e.printStackTrace();
        }
    }

    public void readPlayersSerializable(){
        try(FileInputStream fis = new FileInputStream(fileName);
            ObjectInputStream in = new ObjectInputStream(fis);) {
            playerList.clear();
            playerList = (ArrayList<Player>) in.readObject();
            for (Player plr : playerList){
                System.out.println(plr);
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
