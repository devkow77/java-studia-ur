//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

public class Prostopadloscian {
    private Float bok1;
    private Float bok2;
    private Float bok3;

    public Prostopadloscian(Float bok1, Float bok2, Float bok3) {
        this.bok1 = bok1;
        this.bok2 = bok2;
        this.bok3 = bok3;
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

    public Float getBok3() {
        return this.bok3;
    }

    public void setBok3(Float bok3) {
        this.bok3 = bok3;
    }

    void obliczPoleCalkowite() {
        Float pole = 2.0F * this.bok1 * this.bok2 + 2.0F * this.bok1 * this.bok3 + 2.0F * this.bok2 * this.bok3;
        System.out.format("Pole calkowite szescianu o bokach %.2f, %.2f, %.2f wynosi: %.2f \n", this.bok1, this.bok2, this.bok3, pole);
    }

    void obliczObjetosc() {
        Float objetosc = this.bok1 * this.bok2 * this.bok3;
        System.out.format("Objetosc szczescianu o bokach %.2f %.2f %.2f wynosi: %.2f \n", this.bok1, this.bok2, this.bok3, objetosc);
    }
}
