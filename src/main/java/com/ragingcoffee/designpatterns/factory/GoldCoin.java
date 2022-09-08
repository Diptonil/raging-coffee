package com.ragingcoffee.designpatterns.factory;

public final class GoldCoin implements Coin {

    @Override
    public String description() {
        return "This is a copper coin.";
    }
}
