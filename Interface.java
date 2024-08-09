//create an interface.
interface Bicycle {
    int x = 45;

    void applyBreak(int decrement);

    void speedUp(int increment);
}

interface HornBicycle {
    void blowhornk3g();

    void blowhornmhn();
}

class AvonCycle implements Bicycle, HornBicycle {
    public void applyBreak(int decrement) {
        System.out.println("applying break.");
    }

    public void speedUp(int increment) {
        System.out.println("applying speedup.");
    }

    public void blowhornk3g() {
        System.out.println("kabhi khusi kabhi gum pee pee pee pee");
    }

    public void blowhornmhn() {
        System.out.println("main hoon na po po po po");
    }
}

public class Interface {
    public static void main(String[] args) {
        AvonCycle cyclepinu = new AvonCycle();
        cyclepinu.speedUp(2);
        // you can create properties in interface
        System.out.println(cyclepinu.x);
        cyclepinu.blowhornk3g();
        cyclepinu.blowhornmhn();
        // you can not modify properties in interface as they are final.
        // cyclepinu.x=343;
    }
}
