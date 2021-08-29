package Pokemon;
//// Napada: Travom
//    // Brani se: Izbegava
//    // Pobedjuje: Water type
//    // Gubi od: Fire type
public class GrassPokemon extends Pokemon{

    public GrassPokemon(String bulbasaur, int i) {
    }

    public String logAll() {
        return       "\n"+
                "napada "+ attack() + "\n"
                + "brani se " + defend()  + "\n"
                +"pobedjuje " + wins() + "\n"
                +"gubi od "+loses() + "\n";
    }

    public GrassPokemon(String name, String type, int health) {
        super(name, type, health);
    }

    @Override
    public String attack() {
        String a="grass";
        return a;
    }

    @Override
    public String defend() {
        String a="avoids";
        return a;
    }

    @Override
    public String wins() {
        String a="water";
        return a;
    }

    @Override
    public String loses() {
        String a="fire";
        return a;
    }
}
