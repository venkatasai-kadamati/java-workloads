package Core.CollectionTopic.P2CompCmpblPQ.EngDigest;

import java.util.ArrayList;
import java.util.List;

public class ArrayListDemo {
    public static void main(String[] args) {
        //int[] arr = new int[10]; -- STATIC SIZED ARRAY

        ArrayList<Integer> list = new ArrayList<>();

        // adding new elements at the end
        list.add(1);
        list.add(5);
        list.add(90);


        // adds an element at index 2 and moves the rest to right
        list.add(2, 50);

        // add another collection to our list
        List<Integer> anotherColl = List.of(10, 30);
        list.addAll(anotherColl);

        // get the element at index 1
        System.out.println(list.get(1));
        //System.out.println(list.get(11));

        // size of a list
        System.out.println(list.size());

        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }

        for (Integer integer : list) {
            System.out.println(integer);
        }

        // contains - checks for the presence of an element in a collection
        System.out.println(list.contains(5));
        System.out.println(list.contains(33));

        System.out.println(list);

        // removes an element from the list using index
        list.remove(2);

        /*
         We can also remove the value directly from a list instead of giving the index
         >>> list.remove("Value")
         but suppose we want to remove the element with value 9, so if we directly pass it, the system would consider it as an index. So for this we explicitly mention and pass this as an object.
         >>> list.remove(Integer.valueOf(9));
        */

        // updates value at index 2
        list.set(2, 50);

        // internally calls .toString() method from abstractList derived from abstractCollection
        System.out.println(list);

        // while removing an element, the arraylist doesn't downsize capacity automatically; for this we need to use trimToSize()
        list.trimToSize();


        // ========== List/ArrayList creation and initialization  ===========
        // method 1: List<String> list = new List<>();
        System.out.println(list.getClass().getName());

        // method 2: List<Integer> list = Arrays.asList("2", "3", "9", "1");

        /*
        method 3:
        String[] strArr = {"apple", "mongo", "orange"}
        Arrays.asList(strArr);
        */

        /*
         method 4: List<Integer> list = List.of(1,2,3,4);
         to make the above modifiable, we can specify it as arrayList

         List<Integer> list3 = new ArrayList<>(List.of(1, 2, 3));
        */


        // converting a list into an array
        Object[] listToArray = list.toArray();
        Integer[] listToArray1 = list.toArray(new Integer[0]);
    }
}
