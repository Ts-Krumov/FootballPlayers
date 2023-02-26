import java.io.Serializable;

public class Cards implements Serializable {
    private int yellowCards;
    private int redCards;

    public Cards(int yellowCards, int redCards){
        this.redCards = redCards;
        this.yellowCards = yellowCards;
    }

    public int getYellowCards() {
        return yellowCards;
    }

    public void setYellowCards(int yellowCards) {
        this.yellowCards = yellowCards;
    }

    public int getRedCards() {
        return redCards;
    }

    public void setRedCards(int redCards) {
        this.redCards = redCards;
    }


}
