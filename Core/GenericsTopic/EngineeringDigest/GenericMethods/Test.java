package Core.GenericsTopic.EngineeringDigest.GenericMethods;

public class Test {
    static void main() {
        Integer[] intArr = {1,2,3,4};
        String[] strArr = {"test", "welcome", "el"};
        printArray(intArr);
        printArray(strArr);

        // to understand method overloading in case of Generic methods
        display(3);
        display("String Wording");
    }

    public static <T> void printArray(T[] arr){
        for(T elem: arr){
            System.out.println(elem + " ");
        }
        System.out.println();
    }

    static <T> void display(T value){
        System.out.println("Generic Display: " + value);
    }

    static void display(Integer value){
        System.out.println("Integer Display: " + value);
    }



}

// syntax template: Generic Method
// public <T> void methodName(T parameter){}
