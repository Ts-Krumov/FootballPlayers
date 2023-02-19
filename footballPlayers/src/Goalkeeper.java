public class Goalkeeper extends  Player{
    private int saves;

    private int cleanSheets;

    public Goalkeeper(String name, String team, int yellowCards, int redCards, double rating, double marketValue, boolean isInjured, int cleanSheets, int saves){
        super(name, team, yellowCards, redCards, rating, marketValue, isInjured);
        this.cleanSheets = cleanSheets;
        this.saves = saves;
    }

    public int getSaves() {
        return saves;
    }

    public void setSaves(int saves) {
        this.saves = saves;
    }

    public int getCleanSheets() {
        return cleanSheets;
    }

    public void setCleanSheets(int cleanSheets) {
        this.cleanSheets = cleanSheets;
    }
}
