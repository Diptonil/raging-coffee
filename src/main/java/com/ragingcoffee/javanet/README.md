# The `java.net` Package

Since its early days, Java has been associated with internet programming. And it is very good at what it does, even by the standards of today, although it has taken a backseat in the world of web as of now due to the popularity of JavaScript (for reasons that are deserving and justifiable, but this is not a place for opinionated dicussions). <br />
The `java.net` package is associated with the tools required for handling internet resources in Java. The whole package contains a lot of important classes and interfaces. However, due to the complexity and enormity of the topic, the whole package would not be explored exhaustively. Rather, the core concepts and use-cases would be more focussed on. <br />
This sections assumes an elementary understanding of networking concepts since a rough overview has been provided for all the important topics. To understand how each component connects and links to each other, further independent study is advisable.


## Overview of Networking Concepts

1. **Socket**: It is the endpoint of a network that allows two or more systems to exchange data (by a continuously maintainer or unmaintained connection). Socket communication might occur via many protocols:
    - Low-level **IP** can be used for this, which breaks data into small packets and sends them to an address across a network. But it does not guarantee to deliver the said packets.
    - A better alternative is the high-level **TCP** that manages to robustly string together the packets, sorting or retransmitting them as necessary as to transmit data reliably. Throughout the exchange, a connection is maintained between the sender and the recipient parties.
    - **UDP** can be used for a fast, connectionless and unreliable transfer of packets.
1. **Ports**: It is the gateway to support the operation of a certain protocol over the internet that may or may not be predefined. This is done so that on a particular system, multiple connections can operate on certain protocols simultaneously without disturbing any other operation. TCP/IP reserves the ports below 1024 for specific services or protocols. Some known ones may be:
    - FTP: 21
    - Telnet: 23
    - SMTP: 25
    - whois: 43
    - HTTP: 80
    - netnews: 119
1. **HTTP**: Expands to *Hypertext Transfer Protocol*. It is the protocol used by servers and browsers to transfer hypertext pages and images. It is used for the functioning of the basic request-response model of a client and the server.
1. **Address**: The details of addresses while working with Java does not need to be cared about, for all those things get taken care of by Java. Every computer has an address. It is what uniquely identifies a machine over the internet. The IPv4 is a 32 bit valued address split in 4 chunks of 8 bits. The IPv6 is a 64 bit valued address split in 4 chunks of 16 bits. The primary advantage here is the fact that a larger address space is supported by IPv6.


## Internet Addresses

- Three classes exist in Java to work with the domain name and the numerical addresses - `InetAddress`, `Inet4Address` and `Inet6Address`. The first class superclasses the other two. These classes are designed without any constructors. Instead, we have factory methods in here (refer to the sections concerning Design Patterns to know more).
- Speaking about the superclass, we have three methods to actually get the IP addresses of the local machine (`getLocalHost()`), a machine with a hostname (`getByName()`) as well as a set of machines representing the same hostname (`getAllByName()`) since such instances might occur is a website has scaled out into different machines. Refer to the first program from the list below.
- Internet addresses are looked up in a series of heirarchially cached servers. This means that the local computer might know a particular name-to-IP address mapping automatically - such as itself or nearby servers. If the given hosts aren't found like that, it may venture on to ask a local DNS. If that too fails, it may go to a remote site to ask. The point is that it can manage to go up to the root server and it may take a lot of time. So, it is better to cache the IP address info locally rather than resorting to do constant lookups.
- Some important instance methods are (look at the second program):
    - `byte[] getAddress()`: Returns a byte array that represents the object's IP address in network byte order.
    - `boolean isMulticastAddress()`: Returns true if the address is a multicast address.
    - `String getHostName()`: Returns a String that represents the host name associated with the object.
    - `String getHostAddress()`: Returns a String that represents the host address associated with the object.


## Programs

1. `AddressRetriever.java`: Uses the `InetAddress` and three of its methods to get the IP addresses of Google.
1. `AddressRetrieverDetails.java`: Uses the `InetAddress` and its instance methods to draw out address data from the object.