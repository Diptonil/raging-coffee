package com.ragingcoffee.designpatterns.factory;

public final class Consumer {
    
    public static void main(String[] args) {
        System.out.println("Using the factory pattern: ");
        factoryPattern();
        System.out.println("Using the general pattern (and yielding the same result): ");
        generalPattern();
    }

    private static void factoryPattern() {
        Coin silverCoin = CoinFactory.getCoin(CoinType.SILVER);
        Coin goldCoin = CoinFactory.getCoin(CoinType.GOLD);
        Coin copperCoin = CoinFactory.getCoin(CoinType.COPPER);
        printer(silverCoin, goldCoin, copperCoin);
    }

    private static void generalPattern() {
        Coin silverCoin = new SilverCoin();
        Coin goldCoin =new GoldCoin();
        Coin copperCoin = new CopperCoin();
        printer(silverCoin, goldCoin, copperCoin);
    }

    private static void printer(Coin silverCoin, Coin goldCoin, Coin copperCoin) {
        System.out.println(silverCoin.description());
        System.out.println(goldCoin.description());
        System.out.println(copperCoin.description());
    }
}
