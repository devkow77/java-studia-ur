public class Kwadrat {
    private Float bok;

    public Kwadrat(Float bok) {
        this.bok = bok;
    }

    public Float getBok() {
        return this.bok;
    }

    public void setBok(Float bok) {
        this.bok = bok;
    }

    public void obliczPole() {
        Float pole = this.bok * this.bok;
        System.out.format("Pole kwadratu o boku: %.2f wynosi: %.2f \n", this.bok, pole);
    }

    public void obliczObwod() {
        Float obwod = this.bok * 4.0F;
        System.out.format("Obwod kwadratu o boku: %.2f wynosi: %.2f \n", this.bok, obwod);
    }
}
