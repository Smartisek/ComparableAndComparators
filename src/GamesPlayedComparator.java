import java.util.Comparator;

public class GamesPlayedComparator implements Comparator<LeagueEntry> {


    @Override
    public int compare(LeagueEntry team1, LeagueEntry team2) {
        return team1.getGamesPlayed() - team2.getGamesPlayed();
    }
}
