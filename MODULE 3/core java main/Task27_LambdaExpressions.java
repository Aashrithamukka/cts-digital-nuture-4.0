import java.util.*;

public class LambdaExpressions {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("John", "Alice", "Bob", "Diana");
        names.sort((a, b) -> a.compareToIgnoreCase(b));
        System.out.println("Sorted names: " + names);
    }
}