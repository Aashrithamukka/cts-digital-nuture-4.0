import java.util.HashMap;
import java.util.Scanner;

public class HashMapExample {
    public static void main(String[] args) {
        HashMap<Integer, String> studentMap = new HashMap<>();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter student ID and name (type 0 to stop):");
        while (true) {
            System.out.print("ID: ");
            int id = sc.nextInt();
            if (id == 0) break;
            sc.nextLine();  // consume newline
            System.out.print("Name: ");
            String name = sc.nextLine();
            studentMap.put(id, name);
        }
        System.out.print("Enter ID to retrieve name: ");
        int searchId = sc.nextInt();
        System.out.println("Student Name: " + studentMap.getOrDefault(searchId, "Not Found"));
    }
}