package Core.GenericsTopic.EngineeringDigest.GenericEnum;

// Enums are by-default type safe, as only valid entries can be used
enum Operation{
    ADD, MULTIPLE;

    public <T extends Number> double apply(T a, T b){
        switch (this){
            case ADD:
                return a.doubleValue() + b.doubleValue();
            case MULTIPLE:
                return a.doubleValue() * b.doubleValue();
            default:
                System.out.println("wrong entry");
        }
        return 0;
    }
}
public class Test {
    static void main() {
        // EnumName <var> = EnumName.OPTIONS
        double result = Operation.ADD.apply(10,30);
        System.out.println(result);
    }
}
