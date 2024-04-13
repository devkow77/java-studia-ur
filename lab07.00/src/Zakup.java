public class Zakup extends Transakcja{
    public Zakup(MetodaPlatnosci metodaPlatnosci){
        super(metodaPlatnosci);
    }

    public void przetworzTransakcje(double kwota){
        metodaPlatnosci.zaplac(kwota);
        potwierdzTransakcje();
    }
}
