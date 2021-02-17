package Interface;

public class Game implements Sports {
    @Override
    public void setHomeTeam(String name) {
        System.out.println("Falcons");
    }

    @Override
    public void setVisitingTeam(String name) {
        System.out.println("Braves");

    }

    public static void main(String[] args) {
        Football football = new Football() {
            @Override
            public void homeTeamScore(int points) {
                points = 2;
            }

            @Override
            public void visitingTeamScore(int points) {

            }

            @Override
            public void endOfQuarter(int quarter) {

            }

            @Override
            public void setHomeTeam(String name) {

            }

            @Override
            public void setVisitingTeam(String name) {

            }
        };
    }
}
