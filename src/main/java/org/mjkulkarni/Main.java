package org.mjkulkarni;

import org.mjkulkarni.compare.QuirkyTwoItemContainerComparator;
import org.mjkulkarni.compare.impl.StringCompare;
import org.mjkulkarni.container.impl.StringUtil;

public class Main {

    /*
     * Question:
     * Define a class named StringCompare which has two member variables 'first' and 'second' of String type.
     * Next, define another class named Util with one method named compare which takes two arguments, each of String type.
     * Implement the compare method such that if the sum of the length of the two string args is greater than 10, it returns null, otherwise it returns the second string.
     * */
    public static void main(String[] args) {
        System.out.println("Hello world!");
        QuirkyTwoItemContainerComparator<String> comparator = new StringUtil();
        comparator.compare(new StringCompare("test", "testing"));

        Main m = new Main();
        Test t = m. new Test();
        t.hashCode();
    }

    class Test {}

}