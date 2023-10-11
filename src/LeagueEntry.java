public class LeagueEntry implements Comparable<LeagueEntry>{
    private String name;
    private int gamesPlayed;
    private int gamesWon;
    private int gamesLost;
    private int gamesDrew;
    private int totalPoints;

    @Override
    public int compareTo(LeagueEntry other) {
        return this.name.compareTo(other.name);
    }

    public LeagueEntry(String name, int gamesPlayed, int gamesWon, int gamesLost, int gamesDrew, int totalPoints) {
        this.name = name;
        this.gamesPlayed = gamesPlayed;
        this.gamesWon = gamesWon;
        this.gamesLost = gamesLost;
        this.gamesDrew = gamesDrew;
        this.totalPoints = totalPoints;
    }

    @Override
    public String toString() {
        return "LeagueEntry{" +
                "name='" + name + '\'' +
                ", gamesPlayed=" + gamesPlayed +
                ", gamesWon=" + gamesWon +
                ", gamesLost=" + gamesLost +
                ", gamesDrew=" + gamesDrew +
                ", totalPoints=" + totalPoints +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getGamesPlayed() {
        return gamesPlayed;
    }

    public void setGamesPlayed(int gamesPlayed) {
        this.gamesPlayed = gamesPlayed;
    }

    public int getGamesWon() {
        return gamesWon;
    }

    public void setGamesWon(int gamesWon) {
        this.gamesWon = gamesWon;
    }

    public int getGamesLost() {
        return gamesLost;
    }

    public void setGamesLost(int gamesLost) {
        this.gamesLost = gamesLost;
    }

    public int getGamesDrew() {
        return gamesDrew;
    }

    public void setGamesDrew(int gamesDrew) {
        this.gamesDrew = gamesDrew;
    }

    public int getTotalPoints() {
        return totalPoints;
    }

    public void setTotalPoints(int totalPoints) {
        this.totalPoints = totalPoints;
    }
}
