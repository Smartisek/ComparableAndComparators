import java.util.Comparator;

public class TotalPointsComparator implements Comparator<LeagueEntry> {

    @Override
    public int compare(LeagueEntry team1, LeagueEntry team2){
        return (team1.getTotalPoints() - team2.getTotalPoints())*(-1);
    }
}
