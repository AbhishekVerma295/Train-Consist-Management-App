import java.util.LinkedList;

public class TrainConsistAppUC4LinkedListConsist {

    public static void main(String[] args) {

        System.out.println("=== Train Consist Management App ===");
        System.out.println("Maintaining Ordered Train Consist\n");

        // Create LinkedList to represent train consist
        LinkedList<String> trainConsist = new LinkedList<>();

        // Add bogies
        trainConsist.add("Engine");
        trainConsist.add("Sleeper");
        trainConsist.add("AC");
        trainConsist.add("Cargo");
        trainConsist.add("Guard");

        System.out.println("Initial Train Consist:");
        System.out.println(trainConsist);

        // Insert Pantry Car at position 2
        trainConsist.add(2, "Pantry Car");

        System.out.println("\nAfter inserting Pantry Car at position 2:");
        System.out.println(trainConsist);

        // Remove first and last bogie
        trainConsist.removeFirst();
        trainConsist.removeLast();

        System.out.println("\nAfter removing first and last bogie:");
        System.out.println(trainConsist);

        // Final consist
        System.out.println("\nFinal Ordered Train Consist:");
        for (String bogie : trainConsist) {
            System.out.println(bogie);
        }
    }
}
