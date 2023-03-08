import java.io.Serializable;

public class Player implements Serializable {
    private String name;
    private String team;

    double price;


    public Player(String name, String team, double price){
        this.name = name;
        this.team = team;
        this.price = price;

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

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Player{" +
                "name='" + name + '\'' +
                ", team='" + team + '\'' +
                ", price=" + price +
                '}';
    }
}
