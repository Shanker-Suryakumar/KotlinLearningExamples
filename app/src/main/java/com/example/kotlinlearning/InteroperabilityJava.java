package com.example.kotlinlearning;

public class InteroperabilityJava {

    public static void main(String[] args) {
        int sum = MyCustomKotlinFileName.add(32, 27);
        System.out.println("Printing sum from Java file : " + sum);
    }

    public static int getArea(int l, int b) {
       return l* b;
    }
}
