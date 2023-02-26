import java.io.Serializable;

public class Player implements Serializable {
    private String name;
    private String team;

    private Cards cards;

    private Performance performance;

    private Rating rating;


    public Player(String name, String team){
        this.name = name;
        this.team = team;

    }

    public Rating getRating() {
        return rating;
    }

    public void setRating(Rating rating) {
        this.rating = rating;
    }

    public Cards getCards() {
        return cards;
    }

    public void setCards(Cards cards) {
        this.cards = cards;
    }

    public Performance getPerformance() {
        return performance;
    }

    public void setPerformance(Performance performance) {
        this.performance = performance;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTeam() {
        return team;
    }

    public void setTeam(String team) {
        this.team = team;
    }



    @Override
    public String toString() {
        return "Player{" +
                "name='" + name + '\'' +
                ", team='" + team + '\'' +
                ", performance=" + " Goals:" + performance.getGoals() + "/ Assists:"+performance.getAssists()+
                ", cards=" + " Yellow cards:" + cards.getYellowCards() + "/ Red cards:" + cards.getRedCards()+
                ", rating=" + " Form:" + rating.getForm() + "/ Market value:" + rating.getMarketValue() +
                '}';
    }
}
