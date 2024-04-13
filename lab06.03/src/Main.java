//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Powiesc powiesc = new Powiesc("Kamienie na szaniec", new Autor("Aleksander", "Kaminski", 80, 8), 1990, "historyczny", "historia", new String[]{"ala","ela","zosia"}, 230);
        Klient klient = new Klient("Kacper", "Kowalski", "Rzeszow", 123456789);
        Ksiegarnia ksiegarnia = new Ksiegarnia("Biblioteka Miejska", "Rzeszow");

        ksiegarnia.dodajPowiesc(powiesc);
        ksiegarnia.dodajKlienta(klient);

        ksiegarnia.pokazPowiesci();
        klient.pokazDaneKlienta();
    }
}