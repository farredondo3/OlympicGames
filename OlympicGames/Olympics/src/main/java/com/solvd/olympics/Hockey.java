package com.solvd.olympics;

public class Hockey
{
    private String name;
    private int wins;
    private int losses;
    private int ties;

    public Hockey(int wins, int losses, int ties)
    {
        this.wins = wins;
        this.losses = losses;
        this.ties = ties;
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
}