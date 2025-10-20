package Core.GenericsTopic.EngineeringDigest.GenericClass;

// Number class is a superclass of all wrapper classes like Integer, Double, Float and so
// Bounding Type Parameter means that though the type is flexible yet it is restricted.
// Example: The below "<T extends Number>" means that T can either be int, float, double. But not String, Boolean
public class Box<T extends Number> {
    private T value;
    // what ever, one wants to expose, it will be listed as public and rest as private

    // getter
    public T getValue() {
        return value;
    }

    // setter
    public void setValue(T value) {
        this.value = value;
    }
}

/**
    Generic Type Template:
    ---------
    class ClassName<T> {
         // Class Body
    }
 */

