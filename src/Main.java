public class Main {
    public static void main(String[] args)
    {
        System.out.println("League of LeagueEntries");

//        create LeagueEntry objects and add each one to the League container object
//        the League container stores the teams  internally in an ArrayList
        League league1 = new League();
        league1.addEntry(new LeagueEntry("Newcastle", 1,0,1,0,0));

        league1.addEntry(new LeagueEntry("London", 2,2,0,0,20));

        league1.addEntry(new LeagueEntry("Prague",5,4,1,0,40));

        System.out.println("League1 :");
//        league1.display();
//        league1.sort(); //by natural ordering

        System.out.println("Sort by natural ordering (name)");
        league1.sort();
        league1.display();


        System.out.println("Sort by gamesPlayed method created");
        league1.sortByGamesPlayedASC();
        league1.display();

        System.out.println("Sort by TotalPoints method");
        league1.sortByTotalPoints();
        league1.display();
    }



}