package org.example;

public class Chia {
    private int a;
    private int b;
    public Chia (){}
    public Chia (int a, int b){
        this.a = a;
        this.b = b;
    }
    public double tinh() {
        return (double) a / b;
    }
}
