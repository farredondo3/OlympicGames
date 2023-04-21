package com.solvd.olympics;

public class Competition
{
    public static String winnerVolleyBall(Volleyball player1, Volleyball player2)
    {
        if(player1.total() > player2.total())
        {
            return player1.getName();
        }
        else return player2.getName();
    }
    public static String winnerBasketball(Basketball player1, Basketball player2)
    {
        if(player1.total() > player2.total())
        {
            return player1.getName();
        }
        else return player2.getName();
    }
    public static String winnerBaseball(Baseball player1, Baseball player2)
    {
        if(player1.total() > player2.total())
        {
            return player1.getName();
        }
        else return player2.getName();
    }
    public static String winnerFencing(Fencing player1, Fencing player2)
    {
        if(player1.total() > player2.total())
        {
            return player1.getName();
        }
        else return player2.getName();
    }
    public static String winnerFootball(Football player1, Football player2)
    {
        if(player1.total() > player2.total())
        {
            return player1.getName();
        }
        else return player2.getName();
    }
    public static String winnerGolf(Golf player1, Golf player2)
    {
        if(player1.total() > player2.total())
        {
            return player1.getName();
        }
        else return player2.getName();
    }
    public static String winnerHockey(Hockey player1, Hockey player2)
    {
        if(player1.total() > player2.total())
        {
            return player1.getName();
        }
        else return player2.getName();
    }
    public static String winnerSoccer(Soccer player1, Soccer player2)
    {
        if(player1.total() > player2.total())
        {
            return player1.getName();
        }
        else return player2.getName();
    }
    public static String winnerSwimming(Swimming player1, Swimming player2)
    {
        if(player1.total() > player2.total())
        {
            return player1.getName();
        }
        else return player2.getName();
    }
    public static String winnerTennis(Tennis player1, Tennis player2)
    {
        if(player1.total() > player2.total())
        {
            return player1.getName();
        }
        else return player2.getName();
    }
}
