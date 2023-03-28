public class player {
    String name;
    String playSymbol;
    int wins=0;
    int losses=0;
    int draws=0;
    int positionBoard;
    char team;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPlaySymbol() {
        return playSymbol;
    }

    public void setPlaySymbol(String playSymbol) {
        this.playSymbol = playSymbol;
    }

    public int getWins() {
        return wins;
    }

    public void setWins(int wins) {
        this.wins = wins;
    }

    public int getLosses() {
        return losses;
    }

    public void setLosses(int losses) {
        this.losses = losses;
    }

    public int getDraws() {
        return draws;
    }

    public void setDraws(int draws) {
        this.draws = draws;
    }

    public int getPositionBoard() {
        return positionBoard;
    }

    public void setPositionBoard(int positionBoard) {
        this.positionBoard = positionBoard;
    }

    public char getTeam() {
        return team;
    }

    public void setTeam(char team) {
        this.team = team;
    }
}
