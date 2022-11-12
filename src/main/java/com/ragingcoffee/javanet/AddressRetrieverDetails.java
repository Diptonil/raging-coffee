package com.ragingcoffee.javanet;

import java.net.InetAddress;
import java.net.UnknownHostException;

public final class AddressRetrieverDetails {
    
    public static void main(String[] args) {
        InetAddress address = null;

        try {
            address = InetAddress.getLocalHost();
            System.out.println("Host address: " + address.getHostAddress());
            System.out.println("Hostname: " + address.getHostName());
            System.out.println("Is the address multicast: " + address.getHostAddress());
            System.out.println("Host address in byte order: ");
            for (byte oneAddress : address.getAddress()) {
                System.out.print(oneAddress + "\t");
            }
        } catch (UnknownHostException exception) {
            System.out.print("Host is unable to be resolved.");
        }
    }
}
