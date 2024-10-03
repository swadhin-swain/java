// how enums used in swicth statement

enum Beer {
    KF,KO,RC,FO;
}

public class EnumVsSwitchStatement {
    public static void main(String[] args) {
        Beer b = Beer.RC;

        switch (b) {
            case KF:System.out.println("It is children's brand.");
                break;
            case KO:System.out.println("It is too Light");
                break;
            case RC:System.out.println("It is not that much kick.");
                break;
            case FO:System.out.println("Buy one Get one free.");
                break;
            // case KALYANI:System.out.println("It is children's brand."); // if enum class has not availbe a enum then it throws compile time error
            //     break;
        
            default:System.out.println("Other brands are not recommended");
                break;
        }
    }
}
