package com.ragingcoffee.strings;

public final class StringBufferCapacity {

    public static void main(String[] args) {
        StringBuffer stringBuffer = new StringBuffer("Hello, world!");
    
        System.out.println("Buffer stores: " + stringBuffer);
        System.out.println("Buffer length: " + stringBuffer.length());
        System.out.println("Buffer capacity: " + stringBuffer.capacity());
    }
}
