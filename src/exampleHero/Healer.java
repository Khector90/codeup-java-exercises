package exampleHero;

public class Healer extends Hero{
    public Healer(int hp, int mp, String name, String jobclass) {
        super(hp, mp, name, jobclass);
    }

    @Override
    public void attack() {
        System.out.println("Staying behind the front line, you throw a light spell.");
    }

    @Override
    public void defend() {
        System.out.println("Calling on your deity, you ask for protection as the fight goes on");
    }

    @Override
    public void item() {
        System.out.println("You reach into your backpack and rummage through your many scrolls and potions for the right one");
    }

    @Override
    public void run() {
        System.out.println("You book it on out of there!");
    }
}
