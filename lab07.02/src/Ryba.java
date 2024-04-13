public class Ryba extends Zwierze implements Plywanie{
    private String gatunek;

    public Ryba(String gatunek){
        this.gatunek = gatunek;
    }

    public void jedz(){
        System.out.format("%s je \n", gatunek);
    }
    public void wydalaj(){
        System.out.format("%s wydala \n", gatunek);
    }
    public void plyn(){
        System.out.format("%s plynie \n", gatunek);
    }
    public void wynurz(){
        System.out.format("%s wynurza sie \n", gatunek);
    }
    public void zanurz(){
        System.out.format("%s zanurza \n", gatunek);
    }
}
