//create an interface TvRemote and use it to inherit another interface Smartremote.create an class tv which implements smartremote.
interface TvRemote {
    void volumeUp();

    void volumeDown();
}

interface SmartRemote extends TvRemote {
    void connect();

    void playYoutube();
}

class Tv implements SmartRemote {
    public void volumeUp() {
        System.out.println("Increase the volume.");
    }

    public void volumeDown() {
        System.out.println("Decrease the volume.");
    }

    public void connect() {
        System.out.println("Connecting to the network.");
    }

    public void playYoutube() {
        System.out.println("Playing the youtybe.");
    }
}

public class Abstract_Interface_Qns4 {
    public static void main(String[] args) {
        // creating the object.
        Tv t = new Tv();
        t.volumeDown();
        t.connect();
    }
}
