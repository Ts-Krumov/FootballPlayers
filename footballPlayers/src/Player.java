public class Player {
    private String name;
    private String team;

    private int yellowCards;
    private int redCards;
    private double rating;
    private double marketValue;
    private boolean isInjured;

    public Player(String name, String team, int yellowCards, int redCards, double rating, double marketValue, boolean isInjured){
        this.name = name;
        this.team = team;
        this.yellowCards = yellowCards;
        this.redCards = redCards;
        this.rating = rating;
        this.marketValue = marketValue;
        this.isInjured = false;
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

    public double getRating() {
        return rating;
    }

    public void setRating(double rating) {
        this.rating = rating;
    }

    public double getMarketValue() {
        return marketValue;
    }

    public void setMarketValue(double marketValue) {
        this.marketValue = marketValue;
    }

    public boolean isInjured() {
        return isInjured;
    }

    public void setInjured(boolean injured) {
        isInjured = injured;
    }
}
