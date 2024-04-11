public class Stozek {
    private Float promien;
    private Float wysokosc;

    public Stozek(Float promien, Float wysokosc) {
        this.promien = promien;
        this.wysokosc = wysokosc;
    }

    public Float getWysokosc() {
        return this.wysokosc;
    }

    public void setWysokosc(Float wysokosc) {
        this.wysokosc = wysokosc;
    }

    public Float getPromien() {
        return this.promien;
    }

    public void setPromien(Float promien) {
        this.promien = promien;
    }

    public void obliczPole() {
        Float pole = (float)(Math.PI * Math.pow((double)this.promien, 2.0) + Math.PI * (double)this.promien * (double)this.wysokosc);
        System.out.format("Pole stozka o promieniu: %.2f i wysokosci: %.2f wynosi: %.2f \n", this.promien, this.wysokosc, pole);
    }

    public void obliczObjetosc() {
        Float obj = (float)(Math.PI * Math.pow((double)this.promien, 2.0) * (double)this.wysokosc / 3.0);
        System.out.format("Objetosc stozka o promieniu: %.2f i wysokosci: %.2f wynosi: %.2f \n", this.promien, this.wysokosc, obj);
    }
}
