package com.ragingcoffee.javanet;

import java.net.InetAddress;
import java.net.UnknownHostException;

public final class AddressRetriever {
    
    public static void main(String[] args) {
        try {
            InetAddress address = InetAddress.getLocalHost();
            System.out.println("Localhost address: " + address);

            address = InetAddress.getByName("www.google.com");
            System.out.println("Google's address: " + address);
            System.out.println("Google's addresses: ");

            InetAddress[] addresses = InetAddress.getAllByName("www.google.com");
            for (InetAddress anAddress : addresses) {
                System.out.print(anAddress + "\t");
            }
        } catch (UnknownHostException exception) {
            System.out.print("Host is unable to be resolved.");
        }
    }
}
