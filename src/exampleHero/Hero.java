package exampleHero;

public abstract class Hero implements MenuSystem {

    private int hp;
    private int mp;
    private String name;
    private String jobclass;

    public Hero(int hp, int mp, String name, String jobclass) {
        this.hp = hp;
        this.mp = mp;
        this.name = name;
        this.jobclass = jobclass;
    }
}
