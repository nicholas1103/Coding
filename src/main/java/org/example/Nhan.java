package org.example;

public class Nhan {
    private int a;
    private int b;
    public Nhan (){}
    public Nhan (int a, int b){
        this.a = a;
        this.b = b;
    }
    public int tinh(){
        return a * b;
    }
}
