package Pokemon;
//// Napada: Vodom
//    // Brani se: Vodom
//    // Pobedjuje: Fire type
//    // Gubi od: Grass type
public class WaterPokemon extends Pokemon{

    public WaterPokemon(String lapras, int i) {

    }

    public WaterPokemon() {

    }

    @Override
    public String logAll(){
        return     name+ "\n"+
                "napada "+ attack() + "\n"
                + "brani se " + defend()  + "\n"
                +"pobedjuje " + wins() + "\n"
                +"gubi od "+loses() + "\n";
    }

    public WaterPokemon(String name, String type, int health) {
        super(name, type, health);
    }

    @Override
    public String attack() {
       String a="water";
        return a;
    }

    @Override
    public String defend() {
        String a="water";
        return a;
    }

    @Override
    public String wins() {
        String a="fire";
        return a;
    }

    @Override
    public String loses() {
        String a="grass";
        return a;
    }


    // Ispisuje kako pokemon napada, kako se brani, koga pobedjuje i od koga gubi
    @Override
    public String toString() {
        return
                "name= " + name + '\n' +
                " type='" + type + '\n' +
                ", health=" + health +
                '}';
    }
}
