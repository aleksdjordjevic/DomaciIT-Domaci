package Pokemon;
//public class FirePokemon extends Pokemon{
//    // Napada: Vatrom
//    // Brani se: Telesno
//    // Pobedjuje: Grass type
//    // Gubi od: Water type
//}
public class FirePokemon extends Pokemon{


    public FirePokemon(String name, String type, int health) {
        super(name, type, health);
    }

    public FirePokemon(String charizard, int i) {
    }


    @Override
    public String attack() {
        String a="fire";
        return a;
    }

    @Override
    public String defend() {
        String a="body";
        return a;
    }

    @Override
    public String wins() {
        String a="grass";
        return a;
    }

    @Override
    public String loses() {
        String a="water";
        return a;
    }

    @Override
    public String logAll() {
        return  name +   "\n"+
                "napada "+ attack() + "\n"
                + "brani se " + defend()  + "\n"
                +"pobedjuje " + wins() + "\n"
                +"gubi od "+loses() + "\n";
    }


}
