package com.solvd.olympics;

public class Golf extends Competition
{
    private String name;
    private int totalScore;
    private int totalPuts;

    public Golf(String name, int totalScore, int totalPuts)
    {
        this.name = name;
        this.totalScore = totalScore;
        this.totalPuts = totalPuts;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getTotalScore() {
        return totalScore;
    }

    public void setTotalScore(int totalScore) {
        this.totalScore = totalScore;
    }

    public int getTotalPuts() {
        return totalPuts;
    }

    public void setTotalPuts(int totalPuts) {
        this.totalPuts = totalPuts;
    }

    public int total() {
        return getTotalScore() + getTotalPuts();
    }

    public static String winner(Golf player1, Golf player2)
    {
        if(player1.total() > player2.total())
        {
            return player1.getName();
        }
        else return player2.getName();
    }

    @Override
    public void welcomeAnnouncement() {

    }
}
