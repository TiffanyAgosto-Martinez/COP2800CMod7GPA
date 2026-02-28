// SpeciesCounter.java
// Tiffany Agosto-Martinez
// 2/27/2026
// Encapsulates species data and related operations

public class SpeciesCounter {
    private static final String FILE_NAME = "PalmerPenguins.csv";
    
    // Constants to represent species names
    private static final String SP_CHINSTRAP = "Chinstrap";
    private static final String SP_GENTOO = "Gentoo";
    private static final String SP_ADELIE = "Adelie";
    
    // Indexes for species count
    private static final int NUM_SPECIES = 3;
    private static final int SP_CHINSTRAP_INDEX = 0;
    private static final int SP_GENTOO_INDEX = 1;
    private static final int SP_ADELIE_INDEX = 2;
    
    // Private fields for encapsulation
    private String[] speciesData;
    private int[] speciesCount;
    
    // Default constructor
    public SpeciesCounter() {
        this.speciesData = new String[0]; // Empty array initially
        this.speciesCount = null;         // Null until initialized
    }
    
    // Reads species data from CSV file
    public void readSpeciesData() {
        this.speciesData = CSVReader.readFile(FILE_NAME, 1);    
    }
    
    // Initializes the species count array
    public void initializeSpeciesCount() {
        this.speciesCount = new int[NUM_SPECIES];    
    }        
    
    // Checks if the species data is empty
    public boolean isDataEmpty() {
        return this.speciesCount == null || this.speciesCount.length == 0;       
    }
    
    // Counts occurrences of each species
    public void countSpecies() {
        for (String species : this.speciesData) {
            if (species.equals(SP_CHINSTRAP)) {
                    this.speciesCount[SP_CHINSTRAP_INDEX]++;
                } else if (species.equals(SP_GENTOO)) {
                    this.speciesCount[SP_GENTOO_INDEX]++;
                } else if (species.equals(SP_ADELIE)) {
                    this.speciesCount[SP_ADELIE_INDEX]++;
                }
            }
        }
    
    // Prints the species count
    public void printSpeciesCount() {
        System.out.println(SP_CHINSTRAP + " count = " +
                          this.speciesCount[SP_CHINSTRAP_INDEX]);
        System.out.println(SP_GENTOO + " count = " +
                          this.speciesCount[SP_GENTOO_INDEX]);
        System.out.println(SP_ADELIE + " count = " +
                          this.speciesCount[SP_ADELIE_INDEX]);    
    }
}        