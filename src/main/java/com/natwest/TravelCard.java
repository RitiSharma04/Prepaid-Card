package com.natwest;

class TravelCard extends PrepaidCard implements Rewardable {
    private int rewardPoints;

    public TravelCard(int cardNo, double availableBalance, double swipeLimit) {
        super(cardNo, availableBalance, swipeLimit);
    }
    @Override
    public boolean swipeCard(double amount) {
        if (amount <= swipeLimit && amount <= availableBalance) {
            double amountInINR = amount * 60;
            double processingCharge = amountInINR * 0.05;
            double totalAmount = amountInINR + processingCharge;

            if (totalAmount <= availableBalance) {
                availableBalance -= totalAmount;
                return true;
            }
        }
        return false;
    }
    @Override
    public int calculateRewardPoints(double amount) {
        return 0;
    }
    @Override
    public String toString() {
        return super.toString() + "\nReward Points: " + rewardPoints;
    }
}

