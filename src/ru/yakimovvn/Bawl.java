package ru.yakimovvn;

public class Bawl {

    private int capacityBawl;
    protected int bawl;

    public Bawl(int capacityBawl){
        this.capacityBawl=capacityBawl;
        bawl=capacityBawl;
    }

     protected int getBawlInfo(){
        return bawl;
    }
    protected void fillBawl(){
        System.out.println("Мы наполнили миску");
        bawl = capacityBawl;
    }
}
