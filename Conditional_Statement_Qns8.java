/*WAP to print thepattern
 ****
 ***
 **
 *   by using while loop.
*/
public class Conditional_Statement_Qns8 {
  public static void main(String[] args) {
    int i=1;
    while(i<=4){
        int j=4;
        while(j>=i){
            System.out.print('*');
            j--;
        }
 System.out.print('\n');
        i++;
    }
  }  
}
