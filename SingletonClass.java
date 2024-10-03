class Test {
    private static Test t1 = new Test();
    private Test() {

    }

    static Test getTest() {
        return t1;
    }
}

class Test2 {
    private static Test2  t2 = null;
    private Test2() {

    }

    static Test2 getTest2() {
        if (t2 == null) {
            t2 = new Test2();
        }
        return t2;
    }
}

public class SingletonClass {
    public static void main(String[] args) {
        Test t1 = Test.getTest();

        Test2 t2 = Test2.getTest2();

        System.out.println("Singleton class created successfully");
    }
    
}
