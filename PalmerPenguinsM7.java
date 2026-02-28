// PalmerPenguinsM7.java
// Tiffany Agosto-Martinez
// 2/27/2026
// Refactoring Palmer Penguins analysis using object-oriented approach

public class PalmerPenguinsM7 {
    public static void main(String[] arg) {
        // Create an instance of SpeciesCounter
        SpeciesCounter counter = new SpeciesCounter();
        
        //Read species data
        counter.readSpeciesData();
        
        // Initialize species count
        counter.initializeSpeciesCount();
        
        // Check if data is empty
        if (counter.isDataEmpty()) {
            System.out.println("Error: The file is empty " +
                              "or could not be read.");
            return;
        }
        
        // Count species occurrences
        counter.countSpecies();
        
        // Print results
        counter.printSpeciesCount();
    }
}                              