package com.solvd.olympics;

public class Golf
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
}
