import java.util.HashSet;
import java.util.Set;

public class TrainConsistAppUC3UniqueBogieIDs {

    public static void main(String[] args) {

        System.out.println("=== Train Consist Management App ===");
        System.out.println("Tracking Unique Bogie IDs\n");

        // Create HashSet to store unique bogie IDs
        Set<String> bogieIDs = new HashSet<>();

        // Adding bogie IDs (with intentional duplicates)
        bogieIDs.add("BG101");
        bogieIDs.add("BG102");
        bogieIDs.add("BG103");
        bogieIDs.add("BG101"); // duplicate
        bogieIDs.add("BG104");
        bogieIDs.add("BG102"); // duplicate

        // Display unique bogie IDs
        System.out.println("Unique Bogie IDs in Train:");
        for (String id : bogieIDs) {
            System.out.println(id);
        }

        // Display total unique count
        System.out.println("\nTotal Unique Bogies: " + bogieIDs.size());
    }
}
