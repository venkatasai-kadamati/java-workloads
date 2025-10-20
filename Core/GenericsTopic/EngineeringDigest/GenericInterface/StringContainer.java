package Core.GenericsTopic.EngineeringDigest.GenericInterface;

// We can either make the interface generic else the class as generic
public class StringContainer implements Container<String>{
    private String item;

    @Override
    public void add(String item) {
        this.item = item;
    }

    @Override
    public String get() {
        return item;
    }
}
