package ru.yakimovvn;

public class Cat {
    private String name;

    private int appetite;
    private boolean full=false;

    public Cat(String name,int appetite){
        this.name=("Кошка "+ name);
        this.appetite=appetite;

    }



    protected void feedCat( Bawl obj){
        while(!isCatFull()) {
            if (obj.bawl >= appetite) {
                obj.bawl -= appetite;
                full = true;
                System.out.println("Мы покормили "+name);
                System.out.println("В миске осталось: "+obj.getBawlInfo());

                if(obj.bawl==0) emptyBowl(obj,"Кот съел всё что было!");
            }
            else emptyBowl(obj,"В миске недостаточно еды: " + obj.getBawlInfo());
        }
    }
    private void emptyBowl(Bawl obj,String txt){
        System.out.println(txt);
        obj.fillBawl();
    }

    private boolean isCatFull(){
        String result=(full)?(name+" сыт(та) и доволен(на)!"):(name+" испытовает голод");
        System.out.println(result);
        return full;
    }


}
