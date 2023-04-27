import java.util.Collections;
import java.util.Comparator;

public class League {

    public void printTable(){
        System.out.println("-----------------------------------------------");
        System.out.println("Name            |   W  |  D  |  L  |  Points");
        System.out.println("-----------------------------------------------");
        for(Team team : TeamsFileManager.teamsList){
            int points = team.getDraws() + team.getWins()*3;
            System.out.printf("%s           |   %d  |  %d  |  %d  |  %d\n", team.getName(), team.getWins(), team.getDraws(), team.getLoses(), points);
        }
    }

    public void sortByPoints() {
        Collections.sort(TeamsFileManager.teamsList, (team1, team2) -> {
            int points1 = team1.getDraws() + team1.getWins() * 3;
            int points2 = team2.getDraws() + team2.getWins() * 3;
            return Integer.compare(points2, points1);
        });
    }
}
