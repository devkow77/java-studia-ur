//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Kwadrat kwadrat = new Kwadrat(4, "niebieski");
        Prostokat prostokat = new Prostokat(4, 10, "czarny");
        Punkt punkt = new Punkt(4, 5);
        Trojkat trojkat = new Trojkat(10, 6, "czerwony");

        kwadrat.obliczPole();
        System.out.println(prostokat.opis());
        System.out.println(trojkat.opis());
    }
}