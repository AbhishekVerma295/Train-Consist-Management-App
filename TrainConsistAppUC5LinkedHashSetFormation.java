import java.util.LinkedHashSet;
import java.util.Set;

public class TrainConsistAppUC5LinkedHashSetFormation {

    public static void main(String[] args) {

        System.out.println("=== Train Consist Management App ===");
        System.out.println("Maintaining Train Formation using LinkedHashSet\n");

        // Create LinkedHashSet to store bogies
        Set<String> trainFormation = new LinkedHashSet<>();

        // Add bogies
        trainFormation.add("Engine");
        trainFormation.add("Sleeper");
        trainFormation.add("Cargo");
        trainFormation.add("Guard");

        // Attempt to add duplicate bogie
        trainFormation.add("Sleeper");

        // Display train formation
        System.out.println("Final Train Formation:");
        for (String bogie : trainFormation) {
            System.out.println(bogie);
        }

        // Display using println
        System.out.println("\nFormation as list:");
        System.out.println(trainFormation);
    }
}
