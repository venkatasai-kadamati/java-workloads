class TestOuter1 {
    int x = 10;
}

class TestOuter2 extends TestOuter1 {
    int y = 101;
}

class TestOuter3 extends TestOuter2 {
    int z = 1011;
}

public class Test {
    public static void main(String[] args) {
        TestOuter3 to3 = new TestOuter3();
        System.out.println(to3.x);
        System.out.println(to3.y);
        System.out.println(to3.z);
    }
}
