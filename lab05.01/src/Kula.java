public class Kula {
    private Float promien;

    public Kula(Float promien) {
        this.promien = promien;
    }

    public Float getPromien() {
        return this.promien;
    }

    public void setPromien(Float promien) {
        this.promien = promien;
    }

    void obliczPoleCalkowite() {
        Float pole = (float)(12.566370614359172 * Math.pow((double)this.promien, 2.0));
        System.out.format("Pole calkowite kuli o boku %.2f wynosi: %.2f \n", this.promien, pole);
    }

    void obliczObjetosc() {
        Float objetosc = (float)(12.566370614359172 * Math.pow((double)this.promien, 3.0) / 3.0);
        System.out.format("Objetosc kuli o boku %.2f wynosi: %.2f \n", this.promien, objetosc);
    }
}
