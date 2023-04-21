package com.solvd.olympics;

public class Main {

    public static void main(String[] args) {
        // write your code here

        Volleyball player1 = new Volleyball("Hank",176,280, 7);
        Volleyball player2 = new Volleyball("Crank",180,280, 7);
        //Competition comp = new Competition();

        Basketball basketplyr1 = new Basketball("Steph", 5, 7);
        Basketball basketplyr2 = new Basketball("Kev", 0,1);



        System.out.println("The winner in the volleyball competition is " + Competition.winnerVolleyBall(player1, player2) + "!");
        System.out.println("The winner in the BasketBall competition is " + Competition.winnerBasketball(basketplyr1, basketplyr2) + "!");





    }

//     System.out.println(player1.getName());
//        System.out.println(player1.getHeight());
//
//    //player1.setBlocks(8);
//        System.out.println(player1.getBlocks());
//
//        System.out.println(player1.total());
//        System.out.println(player2.total());
//    Competition comp = new Competition();
}