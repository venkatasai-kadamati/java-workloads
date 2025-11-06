package Core.GenericsTopic.W3School;

import java.util.ArrayList;
import java.util.List;

public class GenericMethod {
    static void main() {
        // string array
        String[] strList = {"Jams", "Family"};

        // int array
        Integer[] intList = {1, 2, 3};

        // double array
        Double[] dbList = {3.3, 4.4};

        // printArrayList(strList);
        printArrayList(dbList);
        printArrayList(intList);
    }

    // static void printArrayList(String[] list){
    //     for(String elem: list){
    //         System.out.println(elem + " ");
    //     }
    // }
    //
    // static void printArrayList(int[] list){
    //     for(int elem: list){
    //         System.out.println(elem + " ");
    //     }
    // }

    static <T extends Number> void printArrayList(T[] list){
        for(T elem: list){
            System.out.println(elem + " ");
        }
    }

}
