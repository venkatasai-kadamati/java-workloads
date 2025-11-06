package Core.GenericsTopic.EngineeringDigest.BoundedTypeParam;

interface Printable {
    void print();
}

class MyNumber extends Number implements Printable{
    private final int value;

    public MyNumber(int value){
        this.value = value;
    }

    @Override
    public void print() {
        System.out.println(value);
    }

    @Override
    public int intValue() {
        return 0;
    }

    @Override
    public long longValue() {
        return 0;
    }

    @Override
    public float floatValue() {
        return 0;
    }

    @Override
    public double doubleValue() {
        return 0;
    }
}

class Boxx<T extends Number & Printable>{}

public class Test{
    static void main() {
        Boxx<MyNumber> box = new Boxx<>();
    }
}