public class Charizard extends Pokemon {
    private boolean fire;

    public Charizard(String name, String type, boolean fire ){
        super(name, type);
        this.fire = fire;
    }

    public boolean isFire() {
        return fire;
    }

    public void fireDamage(){
        System.out.println("Fire Breath!");
    }

}
