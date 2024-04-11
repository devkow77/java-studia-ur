public class Prostokat {
    private Float bok1;
    private Float bok2;

    public Prostokat(Float bok1, Float bok2) {
        this.bok1 = bok1;
        this.bok2 = bok2;
    }

    public Float getBok1() {
        return this.bok1;
    }

    public void setBok1(Float bok1) {
        this.bok1 = bok1;
    }

    public Float getBok2() {
        return this.bok2;
    }

    public void setBok2(Float bok2) {
        this.bok2 = bok2;
    }

    public void obliczPole() {
        Float pole = this.bok1 * this.bok2;
        System.out.format("Pole prostokata o bokach: %.2f i  %.2f wynosi: %.2f \n", this.bok1, this.bok2, pole);
    }

    public void obliczObwod() {
        Float obwod = this.bok1 * 2.0F + this.bok2 * 2.0F;
        System.out.format("Obwod prostokata o bokach: %.2f i  %.2f wynosi: %.2f \n", this.bok1, this.bok2, obwod);
    }
}
