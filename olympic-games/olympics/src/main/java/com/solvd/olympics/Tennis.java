package com.solvd.olympics;

public class Tennis extends Competition
{
    private String name;
    private int serveSpeed;
    private int height;
    private int weight;

    public Tennis(String name, int serveSpeed, int wins, int losses)
    {
        this.name = name;
        this.serveSpeed = serveSpeed;
        this.height = wins;
        this.weight = losses;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getServeSpeed() {
        return serveSpeed;
    }

    public void setServeSpeed(int serveSpeed) {
        this.serveSpeed = serveSpeed;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int wins) {
        this.height = wins;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int total() {
        return getServeSpeed() + getHeight() + getWeight();
    }

    public static String winner(Tennis player1, Tennis player2)
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