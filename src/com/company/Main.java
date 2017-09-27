package com.company;

public class Main {

    public static void print(String[] args) {
        for (String s : args) {
            System.out.println(s);
        }
    }

    public static void sort(String[] args) {
        String str;

        for (int i = 0; i < args.length - 1; i++) {
            for (int j = 0; j < args.length - i - 1; j++) {
                if (args[j].compareTo(args[j + 1]) > 0) {
                    str = args[j];
                    args[j] = args[j + 1];
                    args[j + 1] = str;
                }
            }
        }
    }

    public static void main(String[] args) {
        sort(args);
        print(args);
    }
}
