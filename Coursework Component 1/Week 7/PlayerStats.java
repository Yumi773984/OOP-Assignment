package Java_Coursework;

class Player {
    protected String name;
    protected int age;
    protected String team;

    public Player(String name, int age, String team) {
        this.name = name;
        this.age = age;
        this.team = team;
    }

    public void displayStats() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Team: " + team);
    }
}

// Football player subclass
class FootballStats extends Player {
    private int goals;
    private int assists;

    public FootballStats(String name, int age, String team, int goals, int assists) {
        super(name, age, team);
        this.goals = goals;
        this.assists = assists;
    }

    @Override
    public void displayStats() {
        super.displayStats();
        System.out.println("Goals: " + goals);
        System.out.println("Assists: " + assists);
    }
}

// Cricket player subclass
class CricketStats extends Player {
    private int runs;
    private int wickets;

    public CricketStats(String name, int age, String team, int runs, int wickets) {
        super(name, age, team);
        this.runs = runs;
        this.wickets = wickets;
    }

    @Override
    public void displayStats() {
        super.displayStats();
        System.out.println("Runs: " + runs);
        System.out.println("Wickets: " + wickets);
    }
}

// Volleyball player subclass
class VolleyballStats extends Player {
    private int assists;  // Assists: setting up a teammate for a spike
    private int blocks;   // Blocks: the number of times the player successfully blocks the opponent's spike

    public VolleyballStats(String name, int age, String team, int assists, int blocks) {
        super(name, age, team);
        this.assists = assists;
        this.blocks = blocks;
    }

    @Override
    public void displayStats() {
        super.displayStats();
        System.out.println("Assists: " + assists);
        System.out.println("Blocks: " + blocks);
    }
}

// Main class
public class PlayerStats {
    public static void main(String[] args) {
        // Football player instance
        FootballStats footballer = new FootballStats("Sagar Thapa", 28, "Nepal FC", 12, 5);

        // Cricket player instance
        CricketStats cricketer = new CricketStats("Paras Khadka", 34, "Nepal National", 2450, 73);

        // Volleyball player instance
        VolleyballStats volleyballer = new VolleyballStats("Amit Sharma", 26, "Nepal VC", 134, 37);

        // Displaying football player stats
        System.out.println("Football Player Stats:");
        footballer.displayStats();

        System.out.println("\nCricket Player Stats:");
        cricketer.displayStats();

        System.out.println("\nVolleyball Player Stats:");
        volleyballer.displayStats();
    }
}
