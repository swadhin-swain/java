//Example of interface with default methods.
interface MyCamera {
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

interface MyWifi {
    String[] getNetwork();

    void connectToNetwork(String network);
}

class MyCellPhone {
    void callNumber(long phoneNumber) {
        System.out.println("Calling " + phoneNumber);
    }

    void pickCall() {
        System.out.println("Picking the call...");
    }
}

class MySmartPhone extends MyCellPhone implements MyCamera, MyWifi {
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
}

public class Interface_With_Default_Methods {
    public static void main(String[] args) {
        MySmartPhone ms = new MySmartPhone();
        String[] arr = ms.getNetwork();
        for (String element : arr) {
            System.out.println(element);
        }
        ms.record4kVideo();
        // ms.greet();------>throws an error
        ms.connectToNetwork("HARI OMM");
        ms.callNumber(9861678850l);
    }
}
