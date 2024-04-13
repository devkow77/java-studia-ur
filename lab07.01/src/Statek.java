public class Statek implements Plywa{
    private String nazwa;

    public Statek(String nazwa){
        this.nazwa = nazwa;
    }

    public void plyn(){
        System.out.format("Statek %s zaczal swoj rejs! \n", this.nazwa);
    }
}
