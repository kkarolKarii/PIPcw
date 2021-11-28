package cw4;

// import java.sql.Time;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        zadanie1();
        // zadanie2();
        // zadanie3();
        // zadanie4();
        // zadanie5();
    }

    public static void zadanie1() {

        Scanner scan = new Scanner(System.in);

        System.out.println("Zadanie 1");
        String imie, nazwisko, plec;
        System.out.print("Podaj imie: ");
        imie = scan.nextLine();

        System.out.print("Podaj nazwisko: ");
        nazwisko = scan.nextLine();

        System.out.print("Podaj plec(kobieta/mezczyzna): ");
        plec = scan.nextLine();

        wypisz(plec, imie, nazwisko);
        scan.close();
    }

    public static void wypisz(String plec, String imie, String nazwisko) {
        String napis = "";
        if (plec.equals("mezczyzna"))
            napis += "Student: ";
        else if (plec.equals("kobieta"))
            napis += "Studentka: ";

        napis = plec + " " + imie + " " + nazwisko;
        System.out.println(napis);
    }

    public static void zadanie2() {
        String miesiac, rok;
        Scanner scan = new Scanner(System.in);

        System.out.print("Podaj miesiac(numer): ");
        miesiac = scan.nextLine();

        System.out.print("Podaj rok: ");
        rok = scan.nextLine();

        wypiszmieisac(miesiac, rok);
        scan.close();

    }

    public static void wypiszmieisac(String miesiac, String rok) {
        String napis = miesiac + "." + rok + " " + "to ";
        int mies = Integer.parseInt(miesiac);
        mies /= 4;
        if (mies == 0) {
            napis += "I";
        } else if (mies == 1) {
            napis += "II";
        } else if (mies == 2) {
            napis += "III";
        } else if (mies == 3) {
            napis += "IV";
        }
        System.out.println(napis + " kwartał " + rok + " roku ");
    }

    public static void zadanie3() {
        int rok;
        Scanner scan = new Scanner(System.in);
        System.out.print("Podaj rok(liczba): ");
        rok = scan.nextInt();
        if (czyPrzestepny(rok)) {
            System.out.println(rok + " rok jest przystępny");
        } else {
            System.out.println(rok + " rok nie jest przystępny");
        }
        scan.close();
    }

    public static boolean czyPrzestepny(int rok) {
        boolean przystepnosc = false;
        if ((rok % 4 == 0 && rok % 100 != 0) || rok % 400 == 0) {
            przystepnosc = true;
        }
        return przystepnosc;
    }

    public static void zadanie4() {
        Scanner scan = new Scanner(System.in);
        int ileSztuk;
        double cena = 10.0;
        String czyPromka;

        // boolean promka;

        System.out.print("Podaj liczbe sztuk zakupionego towaru: ");
        ileSztuk = scan.nextInt();

        System.out.print("czy jest promocja(tak/nie): ");
        czyPromka = scan.next();
        scan.close();
        if (czyPromka.equals("tak")) {
            if (ileSztuk > 10) {
                cena = cena / 2.0;
                // System.out.println("cena=cena/2.0");
            } else {
                // System.out.println("STOP");
                return;
            }
        } else if (czyPromka.equals("nie")) {
            System.out.println("ziwkszyłem cene o 10% nowa cena to " + zwiekszCene(cena, 10) + " zł");
        }

    }

    public static double zwiekszCene(double cena, double procent) {
        double wynik = cena * (procent / 100) + cena;
        return wynik;
    }

    public static void zadanie5() {
        Scanner scan = new Scanner(System.in);
        String tytul1, tytul2;
        int minuty1, minuty2;
        int sekundy1, sekundy2;

        System.out.print("Podaj tytul pierwszego utworu: ");
        tytul1 = scan.nextLine();

        System.out.print("Podaj czas trwania pierwszego tytulu(minuty): ");
        minuty1 = scan.nextInt();

        System.out.print("Podaj czas trwania pierwszego tytulu(sekundy): ");
        sekundy1 = scan.nextInt();
        System.out.println();
        System.out.print("Podaj tytul drugiego utworu: ");
        tytul2 = scan.next();

        System.out.print("Podaj czas trwania drugiego tytulu(minuty): ");
        minuty2 = scan.nextInt();

        System.out.print("Podaj czas trwania drugiego tytulu(sekundy): ");
        sekundy2 = scan.nextInt();
        int sumaMin = minuty1 + minuty2;
        int sumaSekund = sekundy1 + sekundy2;
        if (sumaSekund > 60) {
            sumaSekund = sumaSekund % 60;
            sumaMin++;
        }

        if (minuty1 >= minuty2) {
            System.out.println("1. " + tytul1 + " " + minuty1 + ":" + sekundy1);
            System.out.println("2. " + tytul2 + " " + minuty2 + ":" + sekundy2);
        } else {
            System.out.println("1. " + tytul2 + " " + minuty2 + ":" + sekundy2);
            System.out.println("2. " + tytul1 + " " + minuty1 + ":" + sekundy1);
        }
        System.out.println("laczny czas trwania:" + sumaMin + ":" + sumaSekund);

        scan.close();
    }

}
