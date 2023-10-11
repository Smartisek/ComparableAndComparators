import java.util.ArrayList;
import java.util.Collections;
//container class
public class League {

    ArrayList<LeagueEntry> teamsList;

    public League() {
        this.teamsList = new ArrayList<>(); //instantiate arraylist object
    }

//    add on entry  (a team) to the teamsList
    public void addEntry(LeagueEntry team){
        teamsList.add(team);
    }

    public void display(){
        System.out.println(teamsList);
    }

//    define a sort method for a League object, which uses Collections.sort() to sort the ArrayList based on Natural Ordering of LeagueEntry objects.
    public void sort(){
        Collections.sort(teamsList);   //will sort by natural ordering
    }

//    adding sorting with games played
    public void sortByGamesPlayedASC(){
        Collections.sort(teamsList, new GamesPlayedComparator());
    }

    public void sortByTotalPoints(){
        Collections.sort(teamsList, new TotalPointsComparator());
    }
}
