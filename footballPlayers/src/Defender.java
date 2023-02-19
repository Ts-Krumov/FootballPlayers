public class Defender extends Player{
    private int cleanSheets;
    private int tackles;

    public Defender(String name, String team, int yellowCards, int redCards, double rating, double marketValue, boolean isInjured, int cleanSheets, int tackles){
        super(name, team, yellowCards, redCards, rating, marketValue, isInjured);
        this.cleanSheets = cleanSheets;
        this.tackles = tackles;
    }

    public int getCleanSheets() {
        return cleanSheets;
    }

    public void setCleanSheets(int cleanSheets) {
        this.cleanSheets = cleanSheets;
    }

    public int getTackles() {
        return tackles;
    }

    public void setTackles(int tackles) {
        this.tackles = tackles;
    }
}
