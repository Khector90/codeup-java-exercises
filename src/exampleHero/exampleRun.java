package exampleHero;

public class exampleRun {

    public static void main(String[] args) {

        Hero kiley = new Fighter(100, 20, "Kiley", "Defender");

        Hero ken = new Healer(25, 80, "Ken", "Herald Caller");

        ken.attack();

        kiley.attack();

        System.out.println("The enemy rushes the front line");

        kiley.run();

        ken.run();


    }
}
