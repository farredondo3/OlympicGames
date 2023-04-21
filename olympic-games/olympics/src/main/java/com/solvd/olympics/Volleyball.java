package com.solvd.olympics;

public class Volleyball extends Competition{
    private String name;
    private int height;
    private int reach;
    private int blocks;
    //private int total = height + reach + blocks;


    public Volleyball(String name, int height, int reach, int blocks) {
        this.name = name;
        this.height = height;
        this.reach = reach;
        this.blocks = blocks;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getReach() {
        return reach;
    }

    public void setReach(int reach) {
        this.reach = reach;
    }

    public int getBlocks() {
        return blocks;
    }

    public void setBlocks(int blocks) {
        this.blocks = blocks;
    }

    public int total()
    {

        return getHeight() + getBlocks() + getReach();
    }

    public static String winner(Volleyball player1, Volleyball player2)
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