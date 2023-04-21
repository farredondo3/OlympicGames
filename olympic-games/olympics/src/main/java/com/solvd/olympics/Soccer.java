package com.solvd.olympics;

public class Soccer extends Competition
{
    private String name;
    private int goals;
    private int assists;

    public Soccer(String name, int goals, int assists)
    {
        this.name = name;
        this.goals = goals;
        this.assists = assists;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getGoals() {
        return goals;
    }

    public void setGoals(int goals) {
        this.goals = goals;
    }

    public int getAssists() {
        return assists;
    }

    public void setAssists(int assists) {
        this.assists = assists;
    }

    public int total() {
        return getGoals() + getAssists();
    }

    public static String winner(Soccer player1, Soccer player2)
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