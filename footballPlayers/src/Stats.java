public class Stats {
    private int wins;

    private int loses;

    private int draws;

    public Stats(int wins, int loses, int draws){
        this.wins = wins;
        this.loses = loses;
        this.draws = draws;
    }

    public int getWins() {
        return wins;
    }

    public void setWins(int wins) {
        this.wins = wins;
    }

    public int getLoses() {
        return loses;
    }

    public void setLoses(int loses) {
        this.loses = loses;
    }

    public int getDraws() {
        return draws;
    }

    public void setDraws(int draws) {
        this.draws = draws;
    }
}
