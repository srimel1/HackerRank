package Interface;

public interface Sports {
    public void setHomeTeam(String name);

    public void setVisitingTeam(String name);
}
interface Football extends Sports{
    public void homeTeamScore(int points);
    public void visitingTeamScore(int points);
    public void endOfQuarter(int quarter);
}
interface Hockey extends Sports{
    public void homeGoal();
    public void visitingGoal();
    public void endOfPeriod(int period);
    public void overtime(int overtime);

}
