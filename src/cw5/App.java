package cw5;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        // System.out.println("zjazd5 21.11.2021");
        // s22563
        zadanie1();
        // zadanie2();
        // zadanie3();
        // zadanie4();
        // zadanie5();
        // zadanie6();
        // zadanie7();

    }

    static public void zadanie1() {
        System.out.println("Zadanie 1");
        double dlugoscPodstawyDolnej, dlugoscPodstawyGornej, wysokosc;
        double pole;
        Scanner scan = new Scanner(System.in);
        System.out.println("program do obliczania pola figru:");
        System.out.println("1-prostokąt");
        System.out.println("2-kwadrat");
        System.out.println("3-trojkąt");
        System.out.println("4-romb");
        System.out.println("5-równoległobok");
        System.out.println("6-trapez");
        System.out.print("Powiedz prosze, jaka figura ciebie interesuje:");
        int wybor = scan.nextInt();

        switch (wybor) {
            case 1: {
                System.out.println("wybrales prostokąt");
                System.out.print("Podaj dlugosc podstawy dolnej: ");
                dlugoscPodstawyDolnej = scan.nextDouble();
                System.out.print("podaj wysokosc:");
                wysokosc = scan.nextDouble();
                pole = poleProstokata(dlugoscPodstawyDolnej, wysokosc);
                System.out.print("Pole jest równe:" + pole);
                break;
            }
            case 2: {
                System.out.println("wybrales kwadrat");
                System.out.print("Podaj dlugosc boku: ");
                dlugoscPodstawyDolnej = scan.nextDouble();
                pole = poleKwadratu(dlugoscPodstawyDolnej);
                System.out.print("Pole jest równe:" + pole);
                break;
            }
            case 3: {
                System.out.println("wybrales trojkat");
                System.out.print("Podaj dlugosc podstawy dolnej: ");
                dlugoscPodstawyDolnej = scan.nextDouble();
                System.out.print("podaj wysokosc:");
                wysokosc = scan.nextDouble();
                pole = poleProstokata(dlugoscPodstawyDolnej, wysokosc);
                System.out.print("Pole jest równe:" + pole);
                break;
            }
            case 4: {
                System.out.println("wybrales romb");
                System.out.print("Podaj dlugosc podstawy dolnej: ");
                dlugoscPodstawyDolnej = scan.nextDouble();
                System.out.print("podaj wysokosc:");
                wysokosc = scan.nextDouble();
                pole = poleProstokata(dlugoscPodstawyDolnej, wysokosc);
                System.out.print("Pole jest równe:" + pole);
                break;
            }
            case 5: {
                System.out.println("wybrales rownoległobok");
                System.out.print("Podaj dlugosc podstawy dolnej: ");
                dlugoscPodstawyDolnej = scan.nextDouble();
                System.out.print("podaj wysokosc:");
                wysokosc = scan.nextDouble();
                pole = poleRownolegloboku(dlugoscPodstawyDolnej, wysokosc);
                System.out.print("Pole jest równe:" + pole);
                break;
            }
            case 6: {
                System.out.println("wybrales Trapez");
                System.out.print("Podaj dlugosc podstawy dolnej: ");
                dlugoscPodstawyDolnej = scan.nextDouble();
                System.out.print("Podaj dlugosc podstawy gornej: ");
                dlugoscPodstawyGornej = scan.nextDouble();
                System.out.print("podaj wysokosc:");
                wysokosc = scan.nextDouble();
                pole = poleTrapezu(dlugoscPodstawyDolnej, dlugoscPodstawyGornej, wysokosc);
                System.out.print("Pole jest równe:" + pole);
                break;
            }
        }

        scan.close();
    }

    static public double poleTrapezu(double a, double b, double h) {
        return 0.5 * (a + b) * h;
    }

    static public double poleKwadratu(double a) {
        return poleTrapezu(a, a, a);
    }

    static public double poleProstokata(double a, double h) {
        return poleTrapezu(a, 0, h);
    }

    static public double poleRownolegloboku(double a, double h) {
        return a * h;
    }

    public static void zadanie2() {
        System.out.println("Zadanie 2");
        boolean flaga = false;

        Scanner scan = new Scanner(System.in);
        System.out.print("podaj liczbe calkowita: ");
        int liczbaCalkowita = scan.nextInt();

        if (liczbaCalkowita % 2 == 0) {
            System.out.println("Liczba " + liczbaCalkowita + " jest podzielna przez 2");
            flaga = true;
        }

        if (liczbaCalkowita % 3 == 0) {
            flaga = true;
            System.out.println("Liczba " + liczbaCalkowita + " jest podzielna przez 3");
        }
        if (liczbaCalkowita % 5 == 0) {
            flaga = true;
            System.out.println("Liczba " + liczbaCalkowita + " jest podzielna przez 5");
        }
        if (!flaga) {
            System.out.println("Liczba nie jest poczielna przez 2,3 i 5");
        }
        scan.close();
    }

    public static void zadanie3() {
        System.out.println("zadanie 3");
        Scanner scan = new Scanner(System.in);

        System.out.print("Podaj liczbe: ");
        int liczba = scan.nextInt();

        if (liczba / 10 == 0) {
            System.out.println("liczba " + liczba + " jest jednocyfrowa");

        } else if (liczba / 100 == 0) {
            System.out.println("liczba " + liczba + " jest dwucyfrowa");

        } else if (liczba / 1000 == 0) {
            System.out.println("liczba " + liczba + " jest trzycyfrowa");

        } else if (liczba / 10000 == 0) {
            System.out.println("liczba " + liczba + " jest czterocyfrowa");
        } else {
            System.out.println("nieprawidłowa liczba");
        }
        scan.close();
    }

    public static void zadanie4() {
        System.out.println("zadanie 4");
        Scanner scan = new Scanner(System.in);
        System.out.print("Podaj numer miesiaca: ");
        int wybor = scan.nextInt();
        switch (wybor) {
            case 1:
                System.out.println("Wspomniales styczen");
                break;
            case 2:
                System.out.println("wspomniales luty");
                break;
            case 3:
                System.out.println("wspomniales marzec");
                break;
            case 4:
                System.out.println("wspomniales kwiecien");
                break;
            case 5:
                System.out.println("wspomniales maj");
                break;
            case 6:
                System.out.println("wspomniales czerwiec");
                break;
            case 7:
                System.out.println("wspomniales lipiec");
                break;
            case 8:
                System.out.println("wspomniales sierpien");
                break;
            case 9:
                System.out.println("wspomniales wrzesien");
                break;
            case 10:
                System.out.println("wspomniales pazdziernik");
                break;
            case 11:
                System.out.println("wspomniales listopad");
                break;
            case 12:
                System.out.println("wspomniales grudzien");
                break;
        }
        scan.close();
    }

    public static void zadanie5() {
        String napis = "Do konca roku czekaja Cie jeszcze miesiace: ";

        System.out.println("zadanie 5");
        Scanner scan = new Scanner(System.in);
        int wybor;
        System.out.print("Podaj numer miesiaca: ");
        wybor = scan.nextInt();
        if (wybor == 12) {
            napis = "Hura, to juz koniec roku.";
        } else {
            switch (wybor) {
                case 1:
                    napis += "styczen, ";
                case 2:
                    napis += "luty, ";
                case 3:
                    napis += "marzec, ";
                case 4:
                    napis += "kwiecien, ";
                case 5:
                    napis += "maj, ";
                case 6:
                    napis += "czerwiec, ";
                case 7:
                    napis += "lipiec, ";
                case 8:
                    napis += "sierpien, ";
                case 9:
                    napis += "wrzesien, ";
                case 10:
                    napis += "pazdziernik, ";
                case 11:
                    napis += "listopad, ";
                case 12:
                    napis += "grudzien";
                    break;
            }
        }
        System.out.println(napis);
        scan.close();
    }

    public static void zadanie6() {
        System.out.println("Zadanie 6");
        Scanner scan = new Scanner(System.in);
        System.out.print("Podaj liczbe: ");
        int liczba = scan.nextInt();
        System.out.println("wartosc funkcji signum dla " + liczba + " to " + znakLiczby(liczba));
        scan.close();
    }

    public static int znakLiczby(double d) {
        if (d > 0) {
            return 1;
        }
        if (d == 0) {
            return 0;
        }
        return -1;
    }

    public static void zadanie7() {
        System.out.println("zadanie 7");
        Scanner scan = new Scanner(System.in);
        System.out.print("podaj liczbe a: ");
        int a = scan.nextInt();
        System.out.print("podaj liczbe b: ");
        int b = scan.nextInt();
        System.out.print("podaj liczbe n: ");
        int n = scan.nextInt();
        if (a % n == b % n) {
            System.out.println("Liczby " + a + " i " + b + " przystaja do siebie modulo " + n);
        } else {
            System.out.println("Liczby " + a + " i " + b + " nie przystaja do siebie modulo " + n);
        }
        scan.close();
    }
}
