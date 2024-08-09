//example of dynamic method dispatch.
class Phone {
    public void showtime() {
        System.out.println("The time is 8 PM.");
    }

    public void on() {
        System.out.println("Turning on phone.");
    }
}

class Smartphone extends Phone {
    public void on() {
        System.out.println("Turning on smartphone.");
    }

    public void music() {
        System.out.println("playing music.");
    }
}

public class Dynamic_Method_Dispatch {
    public static void main(String[] args) {
        Phone p = new Phone();
        Smartphone s = new Smartphone();
        s.on();
        p.on();
        // dynamic method dispatch
        Phone p1 = new Smartphone();
        p1.on();
        p1.showtime();
    }
}
