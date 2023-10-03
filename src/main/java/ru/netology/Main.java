package ru.netology;

public class Main {
    public static void main(String[] args) {
        BinOps bins = new BinOps();
        //демонстрация
        String a = "1111";
        String b = "101";

        System.out.println(bins.sum(a, b));
        System.out.println(bins.mult(a, b));
    }
}