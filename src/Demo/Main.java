package Demo;

import java.util.LinkedHashSet;

public class Main {
    public static void main(String[] args) {
        LinkedHashSet<String> animals = new LinkedHashSet<>();
        animals.add("Dog");
        animals.add("Kangaroo");
        animals.add("Bear");
        animals.add("Bear");
        animals.add("null");
        animals.add("null");
        animals.add(null);
        System.out.println(animals);
    }
}
