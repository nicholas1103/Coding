package org.example;

public class Main {
    public static void main(String[] args) {
        int a = 3;
        int b = 4;
        Cong cong  = new Cong(a,b);
        Tru tru = new Tru(a,b);
        Nhan nhan = new Nhan(a,b);
        Chia chia = new Chia(a,b);
        System.out.println("Ket qua: ");
        System.out.println("a + b = " + cong);
        System.out.println("a - b = " + tru);
        System.out.println("a * b = " + nhan);
        System.out.println("a / b = " + chia);
    }
}