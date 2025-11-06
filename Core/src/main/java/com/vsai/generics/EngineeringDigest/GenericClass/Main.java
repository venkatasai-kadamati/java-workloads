package Core.GenericsTopic.EngineeringDigest.GenericClass;

// uses box class for demo of generic types
public class Main {
    static void main() {
        // in one package, don't need to import

        // single generic type parameter example
        Box<Integer> box = new Box<>(); // box is not type safe
        box.setValue(1);
        int i = box.getValue();
        System.out.println(i);

        // multiple generic type parameter example
        Pair<String, Integer> pair = new Pair<>("Age", 30);
        System.out.println("key is: " + pair.getKey());
        System.out.println("value is: " + pair.getValue());

        /**
         -- the below is code before implementing generic
         Box box = new Box();
         box.setValue(1);
         String i = (String) box.getValue(); // need to type cast
         System.out.println(i);
        */
    }
}
