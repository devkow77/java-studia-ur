public class KartaKredytowa implements MetodaPlatnosci {
    private String numerKarty;
    private String dataWaznosci;
    private String ccv;

    public void zaplac(double kwota){
        System.out.format("Platnosc karta kredytowa na kwote: %.2f \n", kwota);
    }
}
