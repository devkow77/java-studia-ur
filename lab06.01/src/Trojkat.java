class Trojkat extends Figura
{
    double wys=0, podst=0;

    Trojkat(double wys, double podst, String kolor)
    {
        super(kolor);
        this.wys = wys;
        this.podst = podst;
    }
    String opis(){
        return "Klasa Trojkat. Kolor trojkata: " + this.kolor;
    }
}
