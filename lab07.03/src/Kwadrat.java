class Kwadrat extends Prostokat{
    Kwadrat(int bok,String kolor){
        super(bok,bok,kolor);
    }

    public void obliczPole(){
        int pole = super.wys * super.szer;
        System.out.format("Pole o boku %d wynosi: %d \n", super.wys, pole);
    }
}
