//Example of polymorphism.
interface MyCamera2 {
    void takeSnap();

    void recordVideo();

    private void greet() {
        System.out.println("Good morning.");
    }

    // creating default methods.
    default void record4kVideo() {
        greet();
        System.out.println("Recording in 4k...");
    }
}

interface MyWifi2 {
    String[] getNetwork();

    void connectToNetwork(String network);
}

class MyCellPhone2 {
    void callNumber(long phoneNumber) {
        System.out.println("Calling " + phoneNumber);
    }

    void pickCall() {
        System.out.println("Picking the call...");
    }
}

class MySmartPhone2 extends MyCellPhone2 implements MyCamera2, MyWifi2 {
    public void takeSnap() {
        System.out.println("Taking the snap.");
    }

    public void recordVideo() {
        System.out.println("recording the video.");
    }

    public String[] getNetwork() {
        System.out.println("Getting list of networks.");
        String[] networkLists = { "swadhin", "abhijit", "pabitra" };
        return networkLists;
    }

    public void connectToNetwork(String network) {
        System.out.println("Connecting to " + network);
    }

    // public void record4kVideo(){
    // System.out.println("what are you doing.");
    // }
    public void samplemeth() {
        System.out.println("I am a method.");
    }
}

public class Polymorphism {
    public static void main(String[] args) {
        MyCamera2 cam = new MySmartPhone2();// this is a smartphone but used as a camera.
        // cam.getNetwork();---->not allowed
        // cam.samplemeth()----->not allowed
        cam.record4kVideo();

        MySmartPhone2 sp = new MySmartPhone2();
        sp.samplemeth();
        sp.recordVideo();
        sp.record4kVideo();
        
        sp.callNumber(9861678850l);
        String[] arr = sp.getNetwork();
        for (String element : arr) {
            System.out.println(element);
        }
        sp.connectToNetwork("balle balle");
    }

}
