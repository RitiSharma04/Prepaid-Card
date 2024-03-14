package com.natwest;

abstract class PrepaidCard {
    protected int cardNo;
    protected double availableBalance;
    protected double swipeLimit;

    public PrepaidCard(int cardNo, double availableBalance, double swipeLimit) {
        this.cardNo = cardNo;
        this.availableBalance = availableBalance;
        this.swipeLimit = swipeLimit;
    }

    public abstract boolean swipeCard(double amount);

    public void rechargeCard(double amount) {
        this.availableBalance += amount;
    }

    @Override
    public String toString() {
        return "Card No: " + cardNo +
                "\nAvailable Balance: " + availableBalance +
                "\nSwipe Limit: " + swipeLimit;
    }
}
