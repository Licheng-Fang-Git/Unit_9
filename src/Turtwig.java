public class Turtwig extends Pokemon {
    private boolean grass;
    public Turtwig(String name, String type, boolean grass ){
        super(name, type);
        this.grass = grass;
    }

    public boolean isGrass() {
        return grass;
    }

    public void grassDamage(){
        System.out.println("Rose Sharp!");
    }

}
