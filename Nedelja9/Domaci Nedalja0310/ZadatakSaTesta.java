import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;
import java.util.Random;

public class ZadatakSaTesta {
//6. Написати функцију која за прослеђен низ бројева враћа:
//Колекцију истих бројева где су нуле премештене на крај
//Напомена: Поредак осталих елемената остаје исти
// [1,0,2,0,3,0,0,12,29] -> [1,2,3,12,29,0,0,0,0]
// [0,0,1,3,0,5,0,0,10] -> [1,3,5,10,0,0,0,0,0]
    // novi niz iste duyine i u njega ubacio brojeve razlicite od nule i
    // na kraju nepopunjena mesta su svakako nule

//Napisati program koji generise 1000 test primera i pise ih u fajl u obliku:
//assertEquals(new int[]{---}, imeFunkcije(new int[]{...});
//assertEquals(new int[]{---}, imeFunkcije(new int[]{...});
//itd;
//gde je --- reseni niz, a ... pocetni niz (dakle ovaj fajl ce imati 1000 redova)
// (inicijalne brojeve nasumicno generisati i duzinu niza takodje nasumicno generisati)


    public static int[] nuleNaKraj(int[] arr) {
        int[] arr2 = new int[arr.length];
        int counter = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > 0) {
                arr2[counter] = arr[i];
                counter++;
            }
        }
        return arr2;
    }

    public static int[] randomArr(int len) {  //metoda za generisanje niza za prosledjeni slucajni broj -len- duzina niza
        Random rd2 = new Random();
        int[] arr3 = new int[len];
        for (int i = 0; i < arr3.length; i++) {
            arr3[i] = rd2.nextInt(20);   //Brojevi do 20
        }
        return arr3;
    }

    public static void main(String[] args) throws IOException {

        BufferedWriter writer = new BufferedWriter(new FileWriter("Test Nizovi.txt"));

        for (int i = 0; i < 1000; i++) {
            Random rd = new Random();  //slucajni broj koji prosledjujemo metodi randomArr -duzina niza
            int rd1 = rd.nextInt(10);


            int[] b = randomArr(rd1);
            int[] c = nuleNaKraj(b);
            System.out.println(i + ". " + "slucajni broj rd1 " + rd1);
            System.out.println(Arrays.toString(b));
            System.out.println(Arrays.toString(c));

            try {
                writer.append("assertEquals(new int[]{").append(Arrays.toString(c)).append("}, ").
                        append("nuleNaKraj(new int[]{").append(Arrays.toString(b)).append("}) ");
                writer.newLine();
                writer.close();

            } catch (IOException e) {
                e.printStackTrace();
            }


        }


    }
    //int[] a = IntStream.range(0, n).map(i -> ThreadLocalRandom.current().nextInt()).toArray();-pomocu stream-a

}
