//Example of inheritance in interface.
interface SampleInterface {
    void meth1();

    void meth2();
}

// inheritance interface
interface ChildOfSampleInterface extends SampleInterface {
    void meth3();

    void meth4();
}

// interface
class MySampleClass implements ChildOfSampleInterface {
    public void meth1() {
        System.out.println("I am method 1.");
    }

    public void meth2() {
        System.out.println("I am method 2.");
    }

    public void meth3() {
        System.out.println("I am method 3.");
    }

    public void meth4() {
        System.out.println("I am method 4.");
    }
}

public class Inheritance_In_Interface {
    public static void main(String[] args) {
        // creating object.
        MySampleClass sm = new MySampleClass();
        sm.meth1();
        sm.meth2();
        sm.meth3();
        sm.meth4();
    }
}
