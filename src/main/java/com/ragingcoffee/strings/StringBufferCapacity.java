package com.ragingcoffee.strings;

public final class StringBufferCapacity {

    public static void main(String[] args) {
        StringBuffer stringBuffer = new StringBuffer("Hello, world!");
    
        System.out.println("Buffer store: " + stringBuffer);
        System.out.println("Buffer store: " + stringBuffer.length());
        System.out.println("Buffer store: " + stringBuffer.capacity());
    }
}
