import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        // lab02.01
        Scanner scan = new Scanner(System.in);
        System.out.println("--- Kalkulator rownan x^2+bx+c --- ");
        System.out.println("Podaj wspolczynnik a: ");
        Integer a = scan.nextInt();
        System.out.println("Podaj wspolczynnik b: ");
        Integer b = scan.nextInt();
        System.out.println("Podaj wspolczynnik c: ");
        Integer c = scan.nextInt();
        obliczPierwiastkiRownaniaKwadratowego(a,b,c);
        // lab02.02
        Float wartosc = scan.nextFloat();
        funkcjaA(wartosc);
        funkcjaB(wartosc);
        funkcjaC(wartosc);
        // lab02.03
        System.out.println("Podaj trzy liczby aby je posortowac: ");
        Float liczba1 = scan.nextFloat();
        Float liczba2 = scan.nextFloat();
        Float liczba3 = scan.nextFloat();
        sortowanieLiczbPrzezWartosc(liczba1, liczba2, liczba3);
        System.out.println("Czy pada deszcz? [t/n]: ");
        String deszcz = scan.nextLine();
        System.out.println("Czy przyjechal autobus? [t/n]: ");
        String autobus = scan.nextLine();
        // lab02.04
        transaportNaUczelnie(deszcz, autobus);
        // lab02.05
        System.out.println("Czy masz znizke na samochod? [t/n]: ");
        String znizka = scan.nextLine();
        System.out.println("Czy dostales premie? [t/n]: ");
        String premia = scan.nextLine();
        kupnoAuta(znizka, premia);
        // lab02.06
        wykonywanieDzialanMatematycznych();
    }
    public static void obliczPierwiastkiRownaniaKwadratowego(Integer a, Integer b, Integer c){
        Integer delta = b * b - 4 * a * c;
        if(delta < 0) System.out.println("Delta < 0, brak pierwiastków");
        if(delta > 0){
            Float x1 = (float)((-b - Math.sqrt(delta))/2 * a);
            Float x2 = (float)((-b + Math.sqrt(delta))/2 * a);
            System.out.format("Delta > 0, dwa pierwiastki x1: %.2f, x2: %.2f", x1,x2);
        }
        if(delta == 0){
            Float x1 = (float)(-b/2*a);
            System.out.format("Delta = 0, jeden pierwiastek x1: %.2f", x1);
        }
    }
    public static void funkcjaA(Float wartosc){
        if(wartosc > 0) System.out.format("%.2f", wartosc * 2);
        if(wartosc < 0) System.out.format("%.2f", wartosc * -3);
        if(wartosc == 0) System.out.println("0");
    }
    public static void funkcjaB(Float wartosc){
        if(wartosc >= 1) System.out.format("%.2f", Math.pow(wartosc,2));
        if(wartosc < 1) System.out.format("%.2f", wartosc);
    }
    public static void funkcjaC(Float wartosc){
        if(wartosc > 2) System.out.format("%.2f", wartosc + 2);
        if(wartosc < 2) System.out.format("%.2f", wartosc - 4);
        if(wartosc == 2) System.out.println("8");
    }
    public static void sortowanieLiczbPrzezWartosc(Float num1, Float num2, Float num3){
        Float max = Math.max(Math.max(num1, num2), num3);
        Float min = Math.min(Math.max(num1, num2), num3);
        Float avg = num1 + num2 + num3 - max - min;

        System.out.format("Najwieksza liczba: %.2f", max);
        System.out.format("Najmniejsza liczba: %.2f", min);
        System.out.format("Srednia liczba: %.2f", avg);
    }
    public static void transaportNaUczelnie(String deszcz, String autobus){
        if(deszcz.equals("t") && autobus.equals("t")) System.out.println("Wez parasol, dostaniesz sie na uczelnie");
        if(deszcz.equals("t") && autobus.equals("n")) System.out.println("Nie dostaniesz sie na uczelnie");
        if(deszcz.equals("n") && autobus.equals("t")) System.out.println("Dostaniesz sie na uczelnie, milego dnia i pieknej pogody!");
    }
    public static void kupnoAuta(String znizka, String premia) {
        if (znizka.equals("n") && premia.equals("t")) System.out.println("Mozesz kupic samochod, znizki na samochod nie ma");
        if (znizka.equals("n") && premia.equals("n")) System.out.println("Zakup samochodu trzeba odlozyc na pozniej, znizki na samochod nie ma");
        if (znizka.equals("t") && premia.equals("t")) System.out.println("Mozesz kupic samochod");
    }
    public static void wykonywanieDzialanMatematycznych(){
        System.out.println("Podaj pierwsza liczbe: \n");
        Scanner scan = new Scanner(System.in);
        Float num1 = scan.nextFloat();
        System.out.println("Podaj druga liczbe: \n");
        Float num2 = scan.nextFloat();
        System.out.println(" 1.Dodawanie \n 2.Odejmowanie \n 3.Mnozenie \n 4.Dzielenie z reszta \n");
        System.out.println("Twoj wybor: ");
        Integer wybor = scan.nextInt();
        switch (wybor){
            case 1:
                System.out.format("Dodawanie %.2f + %.2f wynosi: %.2f", num1, num2, num1 + num2);
                break;
            case 2:
                System.out.format("Odejmowanie %.2f - %.2f wynosi: %.2f", num1, num2, num1 - num2);
                break;
            case 3:
                System.out.format("Mnozenie %.2f * %.2f wynosi: %.2f", num1, num2, num1 * num2);
                break;
            case 4:
                System.out.format("Dzielenie %.2f / %.2f wynosi: %.2f z reszta: %.2f", num1, num2, num1 / num2, num1 % num2);
                break;
            default:
                System.out.println("Nieprawidlowa opcja!");
                break;
        }
    }
}