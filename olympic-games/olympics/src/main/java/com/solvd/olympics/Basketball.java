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
}