import java.util.Random;

public class Game {
    Random random = new Random();

    public void playGame(Team home, Team away){
        int homeGoals, awayGoals;
        Stats homeStats = new Stats(0,0,0);
        Stats awayStats = new Stats(0,0,0);
        if(home.checkTeamValue() > away.checkTeamValue()){
             homeGoals = random.nextInt(6);
             awayGoals = random.nextInt(3);
        } else{
             homeGoals = random.nextInt(3);
             awayGoals = random.nextInt(6);
        }

        System.out.printf("%s %d : %d %s", home.getName(), homeGoals, awayGoals, away.getName());
    }
}
