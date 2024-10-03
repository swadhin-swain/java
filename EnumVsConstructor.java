enum Beer {
    KF,KO,RC,FO;
    Beer() {
        System.out.println("Constructor");
    }
}

public class EnumVsConstructor {
    public static void main(String[] args) {
        Beer b = Beer.KF;

        System.out.println("Hello");
    }
}
