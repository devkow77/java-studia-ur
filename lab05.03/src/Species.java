public class Species {
    private String typeName, speciesName, description;
    private Integer numberOfChromosomes, primaryNumberOfChromosomesX;

    public Species(String typeName, String speciesName, Integer numberOfChromosomes, Integer primaryNumberOfChromosomesX, String description) {
        this.typeName = typeName;
        this.speciesName = speciesName;
        this.numberOfChromosomes = numberOfChromosomes;
        this.primaryNumberOfChromosomesX = primaryNumberOfChromosomesX;
        this.description = description;
    }

    public void setSpeciesName(String speciesName) {
        this.speciesName = speciesName;
    }

    public void showFullName(){
        System.out.format("Species: %s with type: %s \n", speciesName, typeName);
    }
    public void showHaploidalNumberOfChromosomes(){
        Float haploidalNumberOfChromosomes = (float) numberOfChromosomes / 2;
        System.out.format("haploidal number of chromosomes: %.2f \n", haploidalNumberOfChromosomes);
    }
    public void showFullDetails(){
        System.out.format("Species: %s \n", speciesName);
        System.out.format("Type: %s \n", typeName);
        System.out.format("Number of chromosomes (2n): %d \n", numberOfChromosomes);
        System.out.format("Primary number of chromosomes X: %d \n", primaryNumberOfChromosomesX);
        System.out.format("Description: %s \n", description);
    }
    public static Species cloneObject(String newSpeciesName, Species existingObject){
        Species newObject = existingObject;
        newObject.setSpeciesName(newSpeciesName);
        return newObject;
    }
}
