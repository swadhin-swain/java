//create an abstract class pen with methods write() and refill() as abstract methods.
abstract class Pen {
    abstract void write();

    abstract void refill();
}

class FountainPen extends Pen {
    public void write() {
        System.out.println("writting....");
    }

    public void refill() {
        System.out.println("refilling....");
    }

    public void ChangeNib() {
        System.out.println("changing the nib....");
    }
}

public class Abstract_Interface_Qns1 {
    public static void main(String[] args) {
        // create the object of fountainpen.
        FountainPen pen = new FountainPen();
        pen.write();
        pen.refill();
        pen.ChangeNib();
    }
}
