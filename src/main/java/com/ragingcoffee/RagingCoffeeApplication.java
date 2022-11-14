package com.ragingcoffee;

import com.sun.net.httpserver.HttpServer;
import java.io.IOException;
import java.net.InetSocketAddress;

@SuppressWarnings("deprecated")
public final class RagingCoffeeApplication {

    public static void main(String[] args) throws IOException {
        HttpServer server = HttpServer.create(new InetSocketAddress(8080), 0);
        server.start();
    }

}
