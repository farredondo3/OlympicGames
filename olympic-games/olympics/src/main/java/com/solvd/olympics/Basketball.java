package com.solvd.olympics;

public class Basketball extends Competition
{
    private String name;
    private int freeThrows;
    private int threePointers;

    public Basketball(String name, int freeThrows, int threePointers)
    {
        this.name = name;
        this.freeThrows = freeThrows;
        this.threePointers = threePointers;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getFreeThrows() {
        return freeThrows;
    }

    public void setFreeThrows(int freeThrows) {
        this.freeThrows = freeThrows;
    }

    public int getThreePointers() {
        return threePointers;
    }

    public void setThreePointers(int threePointers) {
        this.threePointers = threePointers;
    }

    public int total()
    {
        return getFreeThrows() + getThreePointers();
    }

    public static String winner(Basketball player1, Basketball player2)
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