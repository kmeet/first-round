package org.mjkulkarni;

import java.util.Optional;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
    }

    class StringCompare {
        private String first, second;

        public String getFirst() {
            return first;
        }

        public void setFirst(String first) {
            this.first = first;
        }

        public String getSecond() {
            return second;
        }

        public void setSecond(String second) {
            this.second = second;
        }
    }

    class StringUtil implements QuirkyComparator<String, String, String> {

        @Override
        public Optional<String> compare(String s1, String s2) throws RuntimeException {
            if(s1 != null && s2 != null)
                return (s1.length() + s2.length()) > 10 ? Optional.empty() : Optional.of(s2);
            else
                throw new RuntimeException("Invalid input");
        }
    }

    interface QuirkyComparator<T, U, V> {

        Optional<T> compare(U u, V v) throws RuntimeException;

    }
}