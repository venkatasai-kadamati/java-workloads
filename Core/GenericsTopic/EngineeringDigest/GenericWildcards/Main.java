package Core.GenericsTopic.EngineeringDigest.GenericWildcards;

import java.util.ArrayList;

public class Main {
    static void main() {

    }

    public <T> void printArrayList(ArrayList<?> list){
        for(Object o: list){
            System.out.println(o);
        }
    }
}
