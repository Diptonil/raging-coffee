package com.ragingcoffee.designpatterns.prototype;

public final class DeepCloningExample {

    public static void main(String[] args) {
        int[] data = {1, 2, 3, 4 ,5};
        ShallowCloner shallowCloner = new ShallowCloner(data);
        
        shallowCloner.getValues();
        data[0] = 13;
        shallowCloner.getValues();   
    }
}

final class DeepCloner {

    private int[] data;

    DeepCloner(int[] data) {
        this.data = new int[data.length];
        for (int iterator = 0; iterator < data.length; iterator ++) {
            this.data[iterator] = data[iterator];
        }
    }

    public void getValues() {
        System.out.print(data.toString());
    }
}