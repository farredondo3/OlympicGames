package com.solvd.olympics;

public class Hockey extends Competition
{
    private String name;
    private int wins;
    private int losses;
    private int ties;
    private int fouls;

    public Hockey(int wins, int losses, int ties, int fouls)
    {
        this.wins = wins;
        this.losses = losses;
        this.ties = ties;
        this.fouls = fouls;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getWins() {
        return wins;
    }

    public void setWins(int wins) {
        this.wins = wins;
    }

    public int getLosses() {
        return losses;
    }

    public void setLosses(int losses) {
        this.losses = losses;
    }

    public int getTies() {
        return ties;
    }

    public void setTies(int ties) {
        this.ties = ties;
    }

    public int getFouls() {
        return fouls;
    }

    public void setFouls(int fouls) {
        this.fouls = fouls;
    }

    public int total() {
        return getWins() + getLosses() + getTies() + getFouls();
    }

    public static String winner(Hockey player1, Hockey player2)
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