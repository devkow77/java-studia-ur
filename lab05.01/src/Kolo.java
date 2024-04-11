public class Kolo {
    private Float promien;

    public Kolo(Float promien) {
        this.promien = promien;
    }

    public Float getPromien() {
        return this.promien;
    }

    public void setPromien(Float promien) {
        this.promien = promien;
    }

    public void obliczPole() {
        Float pole = (float)(Math.PI * Math.pow((double)this.promien, 2.0));
        System.out.format("Pole kola o promieniu: %.2f wynosi: %.2f \n", this.promien, pole);
    }

    public void obliczObwod() {
        Float obwod = (float)(6.283185307179586 * (double)this.promien);
        System.out.format("Obwod kola o promieniu: %.2f wynosi: %.2f \n", this.promien, obwod);
    }
}
