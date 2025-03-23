//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Pokemon p = new Pokemon("Garchomp", "Dragon");
        p.evolve();
        System.out.println(p.getName());
        System.out.println(p.getType());

        Charizard c = new Charizard("Ash", "Fire", true);
        System.out.println(c.isFire());
        c.fireDamage();

        Turtwig t = new Turtwig("Wicks", "Grass", true);
        System.out.println(t.isGrass());
        t.grassDamage();

    }
}