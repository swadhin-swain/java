/**
 *  Interf
 */
interface Interf {
    public int square(int n);
}

// class Demo implements Interf {
//     public int square(int n) {
//         return n * n;
//     }
// }

public class Lambda3 {
    public static void main(String[] args) {
        Interf i = n -> n*n;
        System.out.println(i.square(5));
    }
}
