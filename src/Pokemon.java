public class Pokemon {
    private String name;
    private String type;

    public Pokemon(String name, String type){
        this.name = name;
        this.type = type;
    }

    public void evolve(){
        System.out.println("Evolved!");
    }

    public String getName() {
        return name;
    }

    public String getType() {
        return type;
    }
}
