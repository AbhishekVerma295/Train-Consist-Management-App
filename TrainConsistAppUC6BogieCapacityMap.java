import java.util.HashMap;
import java.util.Map;

public class TrainConsistAppUC6BogieCapacityMap {

    public static void main(String[] args) {

        System.out.println("=== Train Consist Management App ===");
        System.out.println("Mapping Bogies to Capacity\n");

        // Create HashMap for bogie-capacity mapping
        Map<String, Integer> bogieCapacity = new HashMap<>();

        // Insert bogie capacities
        bogieCapacity.put("Sleeper", 72);
        bogieCapacity.put("AC Chair", 60);
        bogieCapacity.put("First Class", 40);

        // Display bogie capacities using entrySet()
        System.out.println("Bogie Capacity Details:");

        for (Map.Entry<String, Integer> entry : bogieCapacity.entrySet()) {
            String bogie = entry.getKey();
            Integer capacity = entry.getValue();

            System.out.println(bogie + " -> Capacity: " + capacity);
        }
    }
}
