//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Species HomoSapiens = new Species("HomoSapiens", "Homo", 23,46, "\"Species\" represents Homo sapiens, the human species. Its speciesName is \"Homo sapiens\" and it belongs to the genus \"Homo\". The haploid chromosome count x for humans is 23, with a diploid chromosome count of 46. Humans are intelligent bipedal mammals with advanced cognitive abilities, language, culture, and social organization, dominating Earth as a species with sophisticated social, technological, and intellectual capacities.");
        HomoSapiens.showFullName();
        HomoSapiens.showHaploidalNumberOfChromosomes();
        HomoSapiens.showFullDetails();

        Species Fishes = Species.cloneObject("Fishes", HomoSapiens);
        Fishes.showFullName();
        Fishes.showHaploidalNumberOfChromosomes();
        Fishes.showFullDetails();
    }
}