import java.util.*;
import java.util.stream.Collectors;

record Person(String name, int age) {}

public class Records {
    public static void main(String[] args) {
        List<Person> people = List.of(
            new Person("Alice", 22),
            new Person("Bob", 18),
            new Person("Charlie", 25)
        );
        people.stream()
              .filter(p -> p.age() >= 20)
              .forEach(System.out::println);
    }
}