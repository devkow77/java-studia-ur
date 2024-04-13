public class Paypal implements MetodaPlatnosci{
    private String email;
    private String haslo;

    public void zaplac(double kwota){
        System.out.format("Platnosc paypal na kwote: %.2f \n", kwota);
    }
}
