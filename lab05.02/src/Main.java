//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Building hotelRzeszow = new Building("Hotel Rzeszow", 1972, 10);
        Building hotelMarriot = new Building("Hotel Rzeszow", 1987, 42);

        hotelRzeszow.showDetails();
        hotelRzeszow.howOldIsBuilding();

        hotelMarriot.showDetails();
        hotelMarriot.howOldIsBuilding();
    }
}