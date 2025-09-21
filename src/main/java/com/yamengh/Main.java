package com.yamengh;

public class Main {
    public static void main(String[] args) {
        System.out.println(methodOne());
        System.out.println(methodTwo());
    }

    public static String methodOne() {
        return "methodOne: Hello from methodOne";
    }

    public static String methodTwo() {
        return "methodTwo: Hello from methodTwo";
    }
}