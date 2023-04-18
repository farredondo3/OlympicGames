package com.solvd.olympics;

public class Football
{
    private String name;
    private int touchdowns;
    private int explosiveness;

    public Football(String name, int touchdowns, int explosiveness)
    {
        this.name = name;
        this.touchdowns = touchdowns;
        this.explosiveness = explosiveness;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getTouchdowns() {
        return touchdowns;
    }

    public void setTouchdowns(int touchdowns) {
        this.touchdowns = touchdowns;
    }

    public int getExplosiveness() {
        return explosiveness;
    }

    public void setExplosiveness(int explosiveness) {
        this.explosiveness = explosiveness;
    }
}