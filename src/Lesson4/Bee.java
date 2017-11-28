package Lesson4;

public class Bee extends Insect implements Attack {

    private AttackImpl attack;

    public Bee(int size, String color, AttackImpl attack) {
        super(size, color);
        this.attack = attack;
    }

    public Bee(int size, String color) {
        super(size, color);
        this.attack = new AttackImpl("no move", "no attack");
    }

    public Bee() {
        super(0, "black");
        this.attack = new AttackImpl("no move", "no attack");
    }

    @Override
    public void move() {
        attack.move();
    }

    @Override
    public void attack() {
        attack.attack();
    }
}
