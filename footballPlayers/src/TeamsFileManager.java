import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class TeamsFileManager {
    public static List<Team> teamsList;
    private String TeamsFileName = "teamsDB.txt";

    public void readTeams(){
            for(Team team:teamsList){
                System.out.println(team);
           }
    }

    public void loadTeams(){
        try(FileInputStream fis = new FileInputStream(TeamsFileName);
            ObjectInputStream in = new ObjectInputStream(fis)) {
            teamsList = (ArrayList<Team>) in.readObject();
        }catch (IOException | ClassNotFoundException e){
            System.out.println("Loading Teams Error: " + e.getMessage());
        }
    }

    public void writeTeams() {
        try (FileOutputStream file = new FileOutputStream(TeamsFileName);
             ObjectOutputStream out = new ObjectOutputStream(file)){
            out.writeObject(teamsList);
        } catch (IOException e) {
            System.out.println("Writing Teams error: " + e.getMessage());
        }
    }
}
