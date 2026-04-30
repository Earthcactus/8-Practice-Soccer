import java.util.ArrayList;
import java.util.Random;


public class Main {
    static void main(String[] args) {
        Team team1 = new Team("Team 1");
        Team team2 = new Team("Team 2");
        Team team3 = new Team("Team 3");
        Team team4 = new Team("Team 4");

        Team[] teams = {team1, team2, team3, team4};
        ArrayList<Game> gamesPlayed = new ArrayList<Game>();

        // Schedule Start
        Random randal = new Random();
        int countOfWinters = 0;
        int gameID = 1;


        while (countOfWinters < 3) {

            // Generate random temp
            double temp = randal.nextDouble(100);

            // Decide if game is played or not
            if (temp <= 32) {
                countOfWinters++;
                System.out.println("Too cold to play.");
                continue;
            } else {
                // Resets countOfWinters
                countOfWinters = 0;


                // Select Team 4 first
                Team home1 = teams[3];

                // Randomly select another team
                int awayTeam = randal.nextInt(3);
                Team away1 = teams[awayTeam];

                //Select Another 2 teams for game 2
                Team home2 = null;
                Team away2 = null;
                Game game1 = null;
                Game game2 = null;

                switch (awayTeam) {
                    case 0:
                        home2 = teams[1];
                        away2 = teams[2];

                    case 1:
                        home2 = teams[0];
                        away2 = teams[2];

                    case 2:
                        home2 = teams[0];
                        away2 = teams[1];

                }


                //Randomly generate scores
                if (temp <= 49) {
                    game1 = new Game(gameID, temp, away1, home1, randal.nextInt(6), randal.nextInt(6));
                    game2 = new Game(gameID + 1, temp, away2, home2, randal.nextInt(6), randal.nextInt(6));
                } else if (temp <= 66) {
                    game1 = new Game(gameID, temp, away1, home1, randal.nextInt(11), randal.nextInt(11));
                    game2 = new Game(gameID + 1, temp, away2, home2, randal.nextInt(11), randal.nextInt(11));

                } else if (temp <= 88) {
                    game1 = new Game(gameID, temp, away1, home1, randal.nextInt(16), randal.nextInt(16));
                    game2 = new Game(gameID + 1, temp, away2, home2, randal.nextInt(16), randal.nextInt(16));
                } else if (temp <= 100) {
                    game1 = new Game(gameID, temp, away1, home1, randal.nextInt(21), randal.nextInt(21));
                    game2 = new Game(gameID + 1, temp, away2, home2, randal.nextInt(21), randal.nextInt(21));
                }
                gameID += 2;

                // Game 1 total goals
                away1.setTotalGoalsScored(away1.getTotalGoalsScored() + game1.getAwayScore());
                away1.setTotalGoalsAllowed(away1.getTotalGoalsAllowed() + game1.getHomeScore());
                home1.setTotalGoalsScored(home1.getTotalGoalsScored() + game1.getAwayScore());
                home1.setTotalGoalsAllowed(home1.getTotalGoalsAllowed() + game1.getHomeScore());

                //Game 2 total goals
                away2.setTotalGoalsScored(away2.getTotalGoalsScored() + game1.getAwayScore());
                away2.setTotalGoalsAllowed(away2.getTotalGoalsAllowed() + game2.getHomeScore());
                home2.setTotalGoalsScored(home2.getTotalGoalsScored() + game2.getAwayScore());
                home2.setTotalGoalsAllowed(home2.getTotalGoalsAllowed() + game2.getHomeScore());

                gamesPlayed.add(game1);
                gamesPlayed.add(game2);

                recordWLT(game1);
                recordWLT(game2);
            }


        }
        // results print here
        System.out.println("Season is over.\n\n");
        System.out.println("********Results********");

        for(Team team : teams){
            team.printStats();
        }

        for (Game game : gamesPlayed){
            game.PrintGameStats();
        }
    }

    public static void recordWLT(Game game){
        if (game.getAwayScore() > game.getHomeScore()){
            game.getAway().setWinTotal(game.getAway().getWinTotal() + 1);
            game.getHome().setLossTotal(game.getHome().getLossTotal() + 1);
        }
        else if (game.getHomeScore() > game.getAwayScore()) {
            game.getAway().setWinTotal(game.getAway().getWinTotal() + 1);
            game.getHome().setLossTotal(game.getHome().getLossTotal() + 1);
        }
        else {
            game.getAway().setTieTotal(game.getAway().getTieTotal() + 1);
            game.getHome().setTieTotal(game.getAway().getTieTotal() + 1);
        }

    }
}




