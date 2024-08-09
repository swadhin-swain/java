//Example of Abstract class.
abstract class Parent {
  Parent() {
    System.out.println("Main ek parent class ka constructor hoon.");
  }

  public void sayHello() {
    System.out.println("hello.");
  }

  abstract public void greet();
}

class Child extends Parent {
  @Override
  public void greet() {
    System.out.println("Good Morning.");
  }
}

abstract class Child1 extends Parent {
  public void th() {
    System.out.println("Hello Brother.");
  }
}

public class Abstract {
  public static void main(String[] args) {
    Child c = new Child();
    c.greet();
    c.sayHello();
    // Parent p=new Parent();-> Abstract class ka object nahi banaya ja sakta hai.
  }
}