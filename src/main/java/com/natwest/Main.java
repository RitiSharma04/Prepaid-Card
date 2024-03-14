package com.natwest;
public class Main {
    public static void main(String[] args) {
        TravelCard travelCard = new TravelCard(123456789, 5000.0, 1000.0);
        double amountToSwipe = 800.0;
        if (travelCard.swipeCard(amountToSwipe)) {
            System.out.println("Transaction successful!");
        } else {
            System.out.println("Transaction failed! Insufficient balance or exceeded swipe limit.");
        }
        System.out.println(travelCard);
    }
}
