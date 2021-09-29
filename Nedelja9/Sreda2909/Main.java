import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main {

    //    Za prosledjenu Listu brojeva preko tokova izdvojiti:
//
//    Sve brojeve deljive sa 3 uvecati za 2
//    Izbaciti sve brojeve koji su deljivi sa 3 prilikom njihovog dupliranja
//    Pomnoziti svaki neparan broj sa 2 i izbaciti duplikate
//
//    public static boolean deljiviSa3(int x) {
//        if (x % 3 == 0) ;
//        return true;

    // }

    public static void main(String[] args) {
        List<Integer> number = Arrays.asList(1, 2, 3, 48, 0, 0, 1, 2, 3, 10);
        //    Sve brojeve deljive sa 3 uvecati za 2
        List<Integer> deljivi3 = number.stream().filter(x -> x % 3 == 0).
                map(y -> y + 2).collect(Collectors.toList());
        System.out.println(deljivi3);

        // List<Integer> deljivi4 = number.stream().filter(Main::deljiviSa3).   // OVO NE RADI DOBRO-zasto
        // map(y->y+2).collect(Collectors.toList());
        // System.out.println(deljivi4);


        //    Izbaciti sve brojeve koji su deljivi sa 3 prilikom njihovog dupliranja
        List<Integer> deljivi3puta2 = number.stream().
                filter(y -> (2 * y) % 3 != 0).
                collect(Collectors.toList());
        System.out.println(deljivi3puta2);

        //    Pomnoziti svaki neparan broj sa 2 i izbaciti duplikate
        List<Integer> neparni2 = number.stream().
                filter(x -> x % 2 != 0).
                map(y -> y * 2).distinct().collect(Collectors.toList());
        System.out.println(neparni2);
    }

}
