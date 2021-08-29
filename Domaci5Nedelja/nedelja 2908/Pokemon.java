package Pokemon;

// Dopuniti proslednjene klase na odgovarajuci nacin.
//      Napraviti interfejs sa 4 metode koje vracaju String
//public abstract class Pokemon implements Attackable{
//    String name, type;
//    int health;
//
//    public abstract String logAll();
// Ispisuje kako pokemon napada, kako se brani, koga pobedjuje i od koga gubi
//}
public abstract class Pokemon implements Attackable {
    public String name;
    public String type;
    public int health;

    public Pokemon() {

    }

   // public abstract String logAll(); // Ispisuje kako pokemon napada, kako se brani, koga pobedjuje i od koga gubi


    public Pokemon(String name, String type, int health) {
        this.name = name;
        this.type = type;
        this.health = health;
    }
    public abstract String logAll();
    public String getName() {
        return name;
    }

    public String getType() {
        return type;
    }

    public int getHealth() {
        return health;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setHealth(int health) {
        this.health = health;
    }
}

