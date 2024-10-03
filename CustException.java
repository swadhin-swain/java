class TooYoungException extends RuntimeException {
    TooYoungException(String s) {
        super(s);
    }
}

class TooOldException extends RuntimeException {
    TooOldException(String s) {
        super(s);
    }
}

public class CustException {
    public static void main(String[] args) {
        int age = Integer.parseInt(args[0]);

        if (age>60) {
            throw new TooOldException("Your age already crossed marriage age .. no chance of getting marriage");
        } else if (age < 18) {
            throw new TooYoungException("Plz wait some more time ... you will get best match soon");
        } else {
            System.out.println("you will get match details soon by email...!!!");
        }
    }
    
}
