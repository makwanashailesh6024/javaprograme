import java.util.Hashtable;

public class Hashs {
    public static void main(String[] args) {
        // Create a Hashtable
        Hashtable<Integer, String> table = new Hashtable<>();

        // Adding key-value pairs
        table.put(1, "Apple");
        table.put(2, "Banana");
        table.put(3, "Cherry");

        // Retrieve and print values
        System.out.println("Hashtable: " + table);
        System.out.println("Value for key 2: " + table.get(2));

        // Remove a key
        table.remove(1);
        System.out.println("After removing key 1: " + table);
    }
}
