package org.mjkulkarni;

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

    class Util {

        public String compare(StringCompare stringCompare) throws Exception {

            if(stringCompare.getFirst() != null && stringCompare.getSecond() != null)
                return (stringCompare.getFirst().length() + stringCompare.getSecond().length()) > 10 ? null : stringCompare.getSecond();
            else
                throw new Exception("invalid input");

        }

    }
}