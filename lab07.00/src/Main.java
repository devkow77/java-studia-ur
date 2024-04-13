//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        MetodaPlatnosci paypal = new Paypal();
        MetodaPlatnosci kartaKredytowa = new KartaKredytowa();

        Transakcja zakupPayPal = new Zakup(paypal);
        zakupPayPal.przetworzTransakcje(100.00);

        Transakcja zakupKarta = new Zakup(kartaKredytowa);
        zakupKarta.przetworzTransakcje(200.00);
    }
}