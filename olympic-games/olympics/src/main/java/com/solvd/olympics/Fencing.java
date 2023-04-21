package com.solvd.olympics;

public class Fencing extends Competition
{
    private String name;
    private int touchScored;
    private int touchReceived;
    private int wins;

    public Fencing(String name, int touchScored, int touchReceived, int wins)
    {
        this.name = name;
        this.touchScored = touchScored;
        this.touchReceived = touchReceived;
        this.wins = wins;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getTouchScored() {
        return touchScored;
    }

    public void setTouchScored(int touchScored) {
        this.touchScored = touchScored;
    }

    public int getTouchReceived() {
        return touchReceived;
    }

    public void setTouchReceived(int touchReceived) {
        this.touchReceived = touchReceived;
    }

    public int getWins() {
        return wins;
    }

    public void setWins(int wins) {
        this.wins = wins;
    }

    public int total() {
        return getTouchReceived() + getTouchScored() + getWins();
    }
}



