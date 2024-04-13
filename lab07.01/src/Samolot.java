public class Samolot implements Lata{
    private String nazwa;

    public Samolot(String nazwa){
        this.nazwa = nazwa;
    }

    public void lec(){
        System.out.format("Samolot %s rozpoczal swoj lot! \n", this.nazwa);
    }
}
