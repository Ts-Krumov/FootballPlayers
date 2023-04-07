import java.io.Serializable;

public class Player implements Serializable {
    private String name;

    double price;


    public Player(String name, double price){
        this.name = name;
        this.price = price;

    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Player{" + name + ' ' +
                + price +" $ "+
                '}';
    }
}
