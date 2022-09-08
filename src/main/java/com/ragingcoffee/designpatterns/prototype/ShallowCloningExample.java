package com.ragingcoffee.designpatterns.prototype;

public final class ShallowCloningExample {

    public static void main(String[] args) {
        int[] data = {1, 2, 3, 4 ,5};
        ShallowCloner shallowCloner = new ShallowCloner(data);
        
        shallowCloner.getValues();
        data[0] = 13;
        shallowCloner.getValues();   
    }
}

final class ShallowCloner {

    private int[] data;

    ShallowCloner(int[] data) {
        this.data = data;
    }

    public void getValues() {
        System.out.print(data.toString());
    }
}