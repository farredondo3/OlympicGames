package com.solvd.olympics;

public class Swimming extends Competition
{
    private String name;
    private int heartRate;
    private int distance;
    private int strokeCount;

    public Swimming(String name, int heartRate, int distance, int strokeCount)
    {
        this.name = name;
        this.heartRate = heartRate;
        this.distance = distance;
        this.strokeCount = strokeCount;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHeartRate() {
        return heartRate;
    }

    public void setHeartRate(int heartRate) {
        this.heartRate = heartRate;
    }

    public int getDistance() {
        return distance;
    }

    public void setDistance(int distance) {
        this.distance = distance;
    }

    public int getStrokeCount() {
        return strokeCount;
    }

    public void setStrokeCount(int strokeCount) {
        this.strokeCount = strokeCount;
    }

    public int total() {
        return getDistance() + getHeartRate() + getStrokeCount();
    }

    public static String winner(Swimming player1, Swimming player2)
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