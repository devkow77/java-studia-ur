//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
       Samochod samochod = new Samochod("Chevrolet", "Aveo", "idealne", "zolte", 2012, 204382);
       Samochod samochodOsobowy = new SamochodOsobowy("Opel", "Corsa", "slaby", "biale", 2005, 126111, 2.1, 1.6, 5);

       samochod.pokazInformacje();
       samochodOsobowy.pokazInformacje();
    }
}