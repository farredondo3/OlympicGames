package com.solvd.olympics;

public class Baseball extends Competition
{
    //private int battingAvg;
    private String name;
    private int runs;

    public Baseball(String name, int battingAvg, int runs)
    {
        //this.battingAvg = battingAvg;
        this.name = name;
        this.runs = runs;

    }

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

//    public int getBattingAvg()
//    {
//        return battingAvg;
//    }

//    public void setBattingAvg(int battingAvg)
//    {
//        this.battingAvg = battingAvg;
//    }

    public int getRuns()
    {
        return runs;
    }

    public void setRuns(int runs) {
        this.runs = runs;
    }

    public int total() {
        return getRuns();
    }

    public static String winner(Baseball player1, Baseball player2)
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