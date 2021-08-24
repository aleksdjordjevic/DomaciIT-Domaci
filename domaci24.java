package DomaciNedelja1508;
//Napisati funkciju koja vraca sve proste brojeve iz ArrayListe

import java.util.ArrayList;

public class domaci24 {
    public static int prosti(int a) {
        int b=0;
        if (!(a % 2 == 0 || a % 3 == 0 || a % 5 == 0 || a % 7 == 0) ||
                (a==2 || a==3 || a==5 || a==7)) {   //nije elegantno ali radi
            b=a;
        }return b;

          }

    public static void main(String[] args) {
        ArrayList<Integer> lista = new ArrayList<>();
        lista.add(45);
        lista.add(20);
        lista.add(7);
        lista.add(13);
        lista.add(5);
        lista.add(97);
        for (int i = 0; i < lista.size(); i++) {
//            int c = prosti(lista.get(i));
//            System.out.print("c je "+c);
//            if (c!=0){
//                System.out.print(c);
//            }else continue;

           System.out.print(prosti(lista.get(i))+", ");
        }

    }

}
