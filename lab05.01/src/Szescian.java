public class Szescian {
    private Float bok;

    public Szescian(Float bok) {
        this.bok = bok;
    }

    public Float getBok() {
        return this.bok;
    }

    public void setBok(Float bok) {
        this.bok = bok;
    }

    void obliczPole() {
        Float pole = 6.0F * this.bok * this.bok;
        System.out.format("Pole szescianu o boku: %.2f wynosi: %.2f \n", this.bok, pole);
    }

    void obliczObjetosc() {
        Float objetosc = (float)Math.pow((double)this.bok, 3.0);
        System.out.format("Objetosc szescianu o boku: %.2f wynosi: %.2f \n", this.bok, objetosc);
    }
}