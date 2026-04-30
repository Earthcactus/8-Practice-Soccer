public class Game {

    // Data fields
    int id;
    double temp;
    Team away;
    Team home;
    int awayScore;
    int homeScore;


    //Constructors
    public Game(int id, double temp, Team away, Team home, int awayScore, int homeScore) {
        this.id = id;
        this.temp = temp;
        this.away = away;
        this.home = home;
        this.awayScore = awayScore;
        this.homeScore = homeScore;
    }


    //Getters & Setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getTemp() {
        return temp;
    }

    public void setTemp(double temp) {
        this.temp = temp;
    }

    public Team getAway() {
        return away;
    }

    public void setAway(Team away) {
        this.away = away;
    }

    public Team getHome() {
        return home;
    }

    public void setHome(Team home) {
        this.home = home;
    }

    public int getAwayScore() {
        return awayScore;
    }

    public void setAwayScore(int awayScore) {
        this.awayScore = awayScore;
    }

    public int getHomeScore() {
        return homeScore;
    }

    public void setHomeScore(int homeScore) {
        this.homeScore = homeScore;
    }

    public void PrintGameStats(){
        System.out.println("Game #" + id);
        System.out.printf("Temperature: %.2f°F", temp);
        System.out.println("\nAway Team: " + away.getName() + ", " + awayScore);
        System.out.println("Home Team: " + home.getName() + ", " + homeScore);
        System.out.println(" ");
    }
}
