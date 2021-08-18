package Karatisti;

import java.util.Arrays;
import java.util.Random;



//  Karatisti
//Napraviti klasu za Karatistu. Ta klasa sadrzi naredna privatna polja:
//String ime; Ime karatiste
// int godine; Kolko karatista ima godina
// String rang; Koji je njegov rang. Rangovi u karateu ide od
// 10Kyu, 9Kyu, ..., 1kyu, 1Dan, 2Dan, ..., 10Dan
// String[] kata; Lista karate formi
//Napraviti gettere i setter za sve ove atribute, ali paziti na validnost polja!
// Napraviti metod napadni(int index), koja za prosledjeni indeks ispisuje poruku:
// "Karatista {ime} napada sa {kata[index]} katom".
//  Napraviti metod vatreniNapad(), koja ispisuje istu poruku kao i napadni() metod,
//  osim sto bira nasumicnu katu.
//Napraviti metod log() koji ispisuje narednu prouku:
// "Karatistia: {ime], {godine}, {rang} - zna naredne kate {kata}"
public class Karatisti {

    private String ime;
    private int godine;
    private String rang;
    private String[] kata;

    public Karatisti(String ime, int godine, String rang, String[] kata) {
        this.ime = ime;
        if (godine < 2 || godine > 100) {
            System.out.println("Unesite godine");
        } else this.godine = godine;
        if ((!Character.isDigit(rang.charAt(0))&& rang.length()<6)&& (rang.contains("Kyu")||rang.contains("Dan"))) {
            this.rang = rang;
        }
        this.rang="10Kyu";
        System.out.println("rang nije tacan, upisan je 10Kyu");
        this.kata = kata;
    }

    public String getIme() {
        return ime;
    }

    public void setIme(String ime) {
        this.ime = ime;
    }

    public int getGodine() {
        return godine;
    }

    public void setGodine(int godine) {
        this.godine = godine;
    }

    public String getRang() {
        return rang;
    }

    public void setRang(String rang) {
        this.rang = rang;
    }

    public String[] getKata() {
        return kata;
    }

    public void setKata(String[] kata) {
        this.kata = kata;
    }
;
    //Napraviti metod napadni(int index), koja za prosledjeni indeks ispisuje poruku:
// "Karatista {ime} napada sa {kata[index]} katom".

    public void napadni(int index) {  // ovo bi mozda trebalo void ali se buni
        //int index=1;
        return System.out.println("Karatista " + getIme() + "napada katom " + kata.(index));
    }

    //  Napraviti metod vatreniNapad(), koja ispisuje istu poruku kao i napadni() metod,
//  osim sto bira nasumicnu katu.
    public  void vatreniNapad() {
        Random a = new Random();
        return System.out.println("Karatista " + (getIme()) + "napada katom " + kata.[get(a.nextInt(kata.length))]);
    }

    //Napraviti metod log() koji ispisuje narednu prouku:
//"Karatista: {ime], {godine}, {rang} - zna naredne kate {kata}"
    int x = 0; //x treba proslediti -odakle -pozivanje iz klase test?
    public void log() {
        System.out.println("Karatista: "+ getIme() + ", "+ getGodine()+ ", "+ getRang()+ ", "+ "zna naredne kate"+ getKata());

    }
    int index=1;
        k1.napadni(index); /
        k2.vatreniNapad(3);
        k3.log();


    @Override
    public String toString() {
        return "Karatisti{" +
                "ime='" + ime + '\'' +
                ", godine=" + godine +
                ", rang='" + rang + '\'' +
                ", kata=" + Arrays.toString(kata) +
                '}';
    }

}


