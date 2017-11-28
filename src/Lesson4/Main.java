package Lesson4;

public class Main {


    public static void main(String[] args) {

        Bee bee1 = new Bee(12, "Yellow", new AttackImpl("Fly", "Sting"));

        bee1.attack();
        bee1.move();


        Bee bee2 = new Bee(10, "blue");
        bee2.move();
        bee2.attack();


        Bee bee3 = new Bee();
        bee3.attack();
        bee3.move();
        System.out.println(bee3.getColor());
        System.out.println(bee3.getSize());


    }


}
