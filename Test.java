package Karatisti;

import java.util.ArrayList;

public class Test {


    public static void main(String[] args) {

        String[] kata1 = new String[]{"kata1", "kata2", "kata3"};
        String[] kata2 = new String[]{"kata2", "kata3", "kata5"};
        String[] kata3 = new String[]{"kata2", "kata3", "kata5"};
        Karatisti k1 = new Karatisti("Ime1", 18, "10Kyu", kata1);
        Karatisti k2 = new Karatisti("Ime1", 18, "10Kyu", kata2);
        Karatisti k3 = new Karatisti("Ime1", 18, "10Kyu", kata3);



    }
}
//        ArrayList<Karatisti> k = new ArrayList<>();
//        k.add(new Karatisti("Karatista1", 24, "10Kyu", kata1[] ));