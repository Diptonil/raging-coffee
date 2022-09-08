package com.ragingcoffee.designpatterns.factory;

public final class CoinFactory {
    
    public static Coin getCoin(CoinType type) {
        if (type == CoinType.COPPER) {
            return new CopperCoin();
        } else if (type == CoinType.SILVER) {
            return new SilverCoin();
        } else {
            return new GoldCoin();
        }
    }
}
