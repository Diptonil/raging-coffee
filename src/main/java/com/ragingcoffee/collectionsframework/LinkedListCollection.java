package com.ragingcoffee.collectionsframework;

import java.util.LinkedList;

public final class LinkedListCollection {
    
    public static void main(String[] args) {
        LinkedList<Character> linkedList = new LinkedList<Character>();
        char[] vowels = {'A', 'E', 'I', 'O', 'U'};

        for (char vowel : vowels) {
            linkedList.add(vowel);
        }

        linkedList.remove();
    }
}
