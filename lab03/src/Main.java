import java.util.Random;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Random rand = new Random();
        // lab03.01
//        System.out.println("Podaj liczbe studentow w grupie: ");
//        Integer liczbaStudentow = scan.nextInt();
//        sredniaLiczbaPunktowStudentow(liczbaStudentow);
//        // lab03.02
//        zliczanieDziesieciuLiczb();
//        // lab03.03
//        sumaLiczbParzystych(22,82,53,2,4,51,6);
//        // lab03.04
//        System.out.println("Wprowadz ilosc liczb do ciagu liczbowego: ");
//        Integer iloscLiczb = scan.nextInt();
//        Integer[] ciagLiczb = new Integer[iloscLiczb];
//        System.out.println("Podaj liczby w ciagu");
//        for(Integer i = 0; i < iloscLiczb; i++){
//            Integer losowaLiczba = rand.nextInt(56) - 11;
//            System.out.format("%d.liczba: %d", i + 1, losowaLiczba);
//            ciagLiczb[i] = losowaLiczba;
//        }
//        sumaLiczbParzystych(ciagLiczb);
//        // lab03.05
        System.out.println("Podaj slowo: ");
        String slowo = scan.nextLine();
        czySlowoJestPalindromem(slowo);
    }
//    public static void sredniaLiczbaPunktowStudentow(Integer liczbaStudentow){
//        Random rand = new Random();
//        Integer i = 1;
//        Float sumaPuntkow = 0F;
//        while(i <= liczbaStudentow){
//            Integer liczbaPuntkow = rand.nextInt(20); // od 0 do 20 punktow
//            System.out.format("%d.Student: %d punktow \n", i, liczbaPuntkow);
//            sumaPuntkow += liczbaPuntkow;
//            i++;
//        }
//        System.out.format("Srednia liczba punktow dla %d studentow wynosi: %.2f \n", liczbaStudentow, sumaPuntkow / liczbaStudentow);
//    }
//    public static void zliczanieDziesieciuLiczb(){
//        Scanner scan = new Scanner(System.in);
//        Integer iloscLiczbDodatnich = 0;
//        Integer iloscLiczbUjemnych = 0;
//        Float sumaLiczbDodatnich = 0F;
//        Float sumaLiczbUjemnych = 0F;
//
//        for(Integer i = 1; i <= 10; i++){
//            System.out.format("Podaj %d liczbe: ", i);
//            Float num = scan.nextFloat();
//            if (num > 0){
//                iloscLiczbDodatnich++;
//                sumaLiczbDodatnich += num;
//            }else{
//                iloscLiczbUjemnych++;
//                sumaLiczbUjemnych += num;
//            }
//        }
//
//        System.out.format("Ilosc liczb dodatnich %d o sumie: %.2f \n", iloscLiczbDodatnich, sumaLiczbDodatnich);
//        System.out.format("Ilosc liczb ujemnych %d o sumie: %.2f \n", iloscLiczbUjemnych, sumaLiczbUjemnych);
//    }
//    public static void sumaLiczbParzystych(Integer... liczby){
//        Integer suma = 0;
//        for(Integer liczba : liczby){
//            if(liczba % 2 == 0) suma += liczba;
//        }
//        System.out.format("Suma liczb parzystych: %d \n", suma);
//    }
    public static void czySlowoJestPalindromem(String slowo){
        StringBuilder builder = new StringBuilder(slowo);
        String polindrom = builder.reverse().toString().replaceAll("\\s", "");
        if(slowo.replaceAll("\\s", "").equals(polindrom)) System.out.format("Slowo %s jest polindromem \n", slowo);
        else System.out.format("Slowo %s nie jest polindromem \n", slowo);
    }
}