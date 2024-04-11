import java.util.Scanner;

public class Runner {
    public Runner() {
    }

    public void runKolo() {
        System.out.println("Wybrano figure: Kolo");
        System.out.println("Podaj promien: ");
        Scanner scan = new Scanner(System.in);
        Float r = scan.nextFloat();
        Kolo kolo = new Kolo(r);
        kolo.obliczPole();
        kolo.obliczObwod();
        this.run();
    }

    public void runKula() {
        System.out.println("Wybrano figure: Kula");
        System.out.println("Podaj promien: ");
        Scanner scan = new Scanner(System.in);
        Float r = scan.nextFloat();
        Kula kula = new Kula(r);
        kula.obliczPoleCalkowite();
        kula.obliczObjetosc();
        this.run();
    }

    public void runKwadrat() {
        System.out.println("Wybrano figure: Kwadrat");
        System.out.println("Podaj bok: ");
        Scanner scan = new Scanner(System.in);
        Float bok = scan.nextFloat();
        Kwadrat kwadrat = new Kwadrat(bok);
        kwadrat.obliczPole();
        kwadrat.obliczObwod();
        this.run();
    }

    public void runProstokat() {
        System.out.println("Wybrano figure: Prostokat");
        System.out.println("Podaj bok1: ");
        Scanner scan = new Scanner(System.in);
        Float bok1 = scan.nextFloat();
        System.out.println("Podaj bok2: ");
        Float bok2 = scan.nextFloat();
        Prostokat prostokat = new Prostokat(bok1, bok2);
        prostokat.obliczPole();
        prostokat.obliczObwod();
        this.run();
    }

    public void runProstopadloscian() {
        System.out.println("Wybrano figure: Prostopadloscian");
        System.out.println("Podaj bok1: ");
        Scanner scan = new Scanner(System.in);
        Float bok1 = scan.nextFloat();
        System.out.println("Podaj bok2: ");
        Float bok2 = scan.nextFloat();
        System.out.println("Podaj bok3: ");
        Float bok3 = scan.nextFloat();
        Prostopadloscian prostopadloscian = new Prostopadloscian(bok1, bok2, bok3);
        prostopadloscian.obliczPoleCalkowite();
        prostopadloscian.obliczObjetosc();
        this.run();
    }

    public void runStozek() {
        System.out.println("Wybrano figure: Stozek");
        System.out.println("Podaj promien: ");
        Scanner scan = new Scanner(System.in);
        Float r = scan.nextFloat();
        System.out.println("Podaj wysokosc: ");
        Float wysokosc = scan.nextFloat();
        Stozek stozek = new Stozek(r, wysokosc);
        stozek.obliczPole();
        stozek.obliczObjetosc();
        this.run();
    }

    public void runSzescian() {
        System.out.println("Wybrano figure: Szescian");
        System.out.println("Podaj bok: ");
        Scanner scan = new Scanner(System.in);
        Float bok = scan.nextFloat();
        Szescian szescian = new Szescian(bok);
        szescian.obliczPole();
        szescian.obliczObjetosc();
        this.run();
    }

    public void runTrojkat() {
        System.out.println("Wybrano figure: Trojkat");
        System.out.println("Podaj bok: ");
        Scanner scan = new Scanner(System.in);
        Float bok = scan.nextFloat();
        System.out.println("Podaj wysokosc: ");
        Float wysokosc = scan.nextFloat();
        Trojkat trojkat = new Trojkat(bok, wysokosc);
        trojkat.obliczPole();
        trojkat.obliczObwod();
        this.run();
    }

    public void exit() {
        System.out.println("Czy napewno chcesz wyjsc? [T/t]: ");
        Scanner scan = new Scanner(System.in);
        String wybor = scan.nextLine();
        if (!wybor.equals("T") && !wybor.equals("t")) {
            this.run();
        } else {
            System.exit(0);
        }

    }

    public void handleError() {
        System.out.println("Wybrana opcja nie istnieje!");
        this.run();
    }

    public void run() {
        System.out.println("--- Menu Kalkulatora Figur Geometrycznych ---");
        System.out.println(" 1.Kolo \n 2.Kula \n 3.Kwadrat \n 4.Prostokat \n 5.Prostopadloscian \n 6.Stozek \n 7.Szescian \n 8.Trojkat \n 9.Wyjscie");
        System.out.println("Wybierz opcje: ");
        Scanner scan = new Scanner(System.in);
        Integer wybor = scan.nextInt();
        switch (wybor) {
            case 1 -> this.runKolo();
            case 2 -> this.runKula();
            case 3 -> this.runKwadrat();
            case 4 -> this.runProstokat();
            case 5 -> this.runProstopadloscian();
            case 6 -> this.runStozek();
            case 7 -> this.runSzescian();
            case 8 -> this.runTrojkat();
            case 9 -> this.exit();
            default -> this.handleError();
        }

    }
}
