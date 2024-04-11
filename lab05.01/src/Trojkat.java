//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

class Trojkat {
    private Float podstawa;
    private Float wysokosc;

    public Trojkat(Float podstawa, Float wysokosc) {
        this.podstawa = podstawa;
        this.wysokosc = wysokosc;
    }

    public Float getPodstawa() {
        return this.podstawa;
    }

    public void setPodstawa(Float podstawa) {
        this.podstawa = podstawa;
    }

    public Float getWysokosc() {
        return this.wysokosc;
    }

    public void setWysokosc(Float wysokosc) {
        this.wysokosc = wysokosc;
    }

    public void obliczPole() {
        Float pole = this.podstawa * this.wysokosc / 2.0F;
        System.out.format("Pole trojkata o podstawie: %.2f i wysokosci: %.2f wynosi: %.2f \n", this.podstawa, this.wysokosc, pole);
    }

    public void obliczObwod() {
        Float obwod = this.podstawa * 3.0F;
        System.out.format("Obwod trojkata o podstawie: %.2f wynosi: %.2f \n", this.podstawa, obwod);
    }
}
