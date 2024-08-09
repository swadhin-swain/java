/*write a java program to print the pattern ****
                                            ***
                                            **
                                            *
*/
public class ethods_Qns2 {
    static void printpattern(int n){
        for(int i=1;i<=n;i++){
            for(int j=n;j>=i;j--){
                System.out.print('*');
            }
            System.out.print('\n');
        }
    }
    public static void main(String[] args) {
        printpattern(4);
    }
}
