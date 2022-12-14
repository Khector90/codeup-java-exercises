package exampleHero;

public class Fighter extends Hero{
    public Fighter(int hp, int mp, String name, String jobclass) {
        super(hp, mp, name, jobclass);
    }

    @Override
    public void attack() {
        System.out.println("You attack with a sword at your side");
    }

    @Override
    public void defend() {
        System.out.println("You raise your shield to intercept the incoming blow");
    }

    @Override
    public void item() {
        System.out.println("You reach for your health potion on your belt");
    }

    @Override
    public void run() {
        System.out.println("You turn to your allies and tell them to make haste, then focus back on the enemy to distract");
    }
}
