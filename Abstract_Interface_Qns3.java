//create a class telephone with ring(),lift() and disconnect() abstract methods.Create another class SmartTelephone and demonstrate polymorphism.
abstract class TelePhone {
    abstract void ring();

    abstract void lift();

    abstract void disConnect();
}

class SmartTelephone extends TelePhone {
    public void ring() {
        System.out.println("ringing....");
    }

    public void lift() {
        System.out.println("lifting....");
    }

    public void disConnect() {
        System.out.println("disconnecting....");
    }

    public void roam() {
        System.out.println("roaming....");
    }
}

public class Abstract_Interface_Qns3 {
    public static void main(String[] args) {
        // demonstrate of polymorphism.
        TelePhone te = new SmartTelephone();
        te.ring();
        // te.roam();---->throws error
    }
}
