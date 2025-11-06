package Core.GenericsTopic.EngineeringDigest.GenericContructor;

public class Box {
    private Object value;

    public <T> Box(T value){
        this.value = value;
    }

    static void main() {
        Box box = new Box(3);
        System.out.println(box.value);
    }
}
