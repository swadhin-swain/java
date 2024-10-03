enum Beer {
    KF(100),KO(75),RC(90),FO;

    int price;

    Beer(int price) {
        this.price = price;
    }

    Beer() {
        price = 65;
    }
    
    int getPrice() {
        return this.price;
    }
}

public class EnumVsConstructor2 {
    public static void main(String[] args) {
        Beer[] b = Beer.values();

        for(Beer b1 : b) {
            System.out.println(b1+"---"+b1.getPrice());
        }
    }
}
