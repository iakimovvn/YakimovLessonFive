package ru.yakimovvn;

public class LessonFive {
    public static void main(String[] args) {
          Bawl oneBawlForAll=new Bawl(30);
          Cat [] cats=new Cat[]{new Cat("Мурка",7),
                  new Cat("Барсик",11),
                  new Cat ("Мурсик",9),
                  new Cat("Пушок",12),
                  new Cat("Шарли",8),
                  new Cat("Недотрога",10)
          };

          for(Cat obj:cats){
              obj.feedCat(oneBawlForAll);
          }
    }
}
