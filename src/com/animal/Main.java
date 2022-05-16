package com.animal;

public class Main {

    public static void main(String[] args) {
       /* Animal деген класс тузунуз жана бир метод кошунуз.
        Анын 3 наследнигин тузунуз.

        Shark деген класска attack(), Turtle деген класска swim() жана Eagle деген класска fly() методторун тузосуз.
        Animal тибин колдонуп массив тузунуз жана ал жакка анын наследниктерин
        кошунуз.
                instanceOf жана getClass()-ты колдонуп Animal массивиндеги жаныбарлардын оздорунун методдорун
        чыгарыныз.
                Ар бир объект учун оз озунчо массив тузуп Animal массивиндеги жаныбарларды
        болуп оз озунун массивине салыныз.

        */

        Animal animal = new Animal();
        Animal[] animals = {new Shark(), new Turtle(), new Eagle()};
        Shark[] predator = new Shark[2];
        Turtle[] turtle = new Turtle[5];
        Eagle[] eagle = new Eagle[8];

        for (Animal name : animals) {
            if (name instanceof Shark) {
                ((Shark) name).attack();
                System.out.println(name.getClass().getName());
                if (name.getClass().getName() == "com.animal.Shark") {
                    ((Shark) name).attack();
                    predator[0] = (Shark) name;
                }
            } else if (name instanceof Turtle) {
                ((Turtle) name).swim();
                System.out.println(name.getClass().getName());
                if (name.getClass().getName() == "com.animal.Turtle") {
                    ((Turtle) name).swim();
                    turtle[3] = (Turtle) name;
                }
            } else if (name instanceof Eagle) {
                ((Eagle) name).fly();
                System.out.println(name.getClass().getName());
                if (name.getClass().getName() == "com.animal.Eagle") {
                    ((Eagle) name).fly();
                    eagle[1] = (Eagle) name;
                }
            }

        }


    }
}

