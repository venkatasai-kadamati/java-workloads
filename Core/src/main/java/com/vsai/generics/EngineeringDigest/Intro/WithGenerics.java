package Core.GenericsTopic.EngineeringDigest.Intro;

import java.util.ArrayList;

public class WithGenerics {
    static void main() {
        ArrayList<String> list = new ArrayList<>();
        
        list.add("Hello");
        list.add("Welcome");
        String s = list.get(0);
        String s1 = list.get(1);
    }
}
