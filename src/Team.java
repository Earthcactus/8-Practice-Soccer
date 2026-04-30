public class Team {

    // Data fields
    private String name;
    private int winTotal;
    private int lossTotal;
    private int tieTotal;
    private  int totalGoalsScored;
    private int totalGoalsAllowed;

    // Constructor
    public Team(String name) {this.name = name;}

    // Getters & Setters


    public String getName() {
        return name;
    }

    public void setName(String name) {

        this.name = name;
    }

    public int getWinTotal() {

        return winTotal;
    }

    public void setWinTotal(int winTotal) {

        this.winTotal = winTotal;
    }

    public int getLossTotal() {

        return lossTotal;
    }

    public void setLossTotal(int lossTotal) {

        this.lossTotal = lossTotal;
    }

    public int getTieTotal() {

        return tieTotal;
    }

    public void setTieTotal(int tieTotal) {

        this.tieTotal = tieTotal;
    }

    public int getTotalGoalsScored() {

        return totalGoalsScored;
    }

    public void setTotalGoalsScored(int goalsSored) {

        this.totalGoalsScored = goalsSored;
    }

    public int getTotalGoalsAllowed() {

        return totalGoalsAllowed;
    }

    public void setTotalGoalsAllowed(int totalGoalsAllowed) {

        this.totalGoalsAllowed = totalGoalsAllowed;
    }

    public void printStats(){
        System.out.println(name);
        System.out.println("Wins: " + winTotal + ",Losses: " + lossTotal + ",Ties: " + tieTotal);
        System.out.println("Points Socred: " + totalGoalsScored + ",Points Allowed: " + totalGoalsAllowed);
        System.out.println(" ");

    }
}

