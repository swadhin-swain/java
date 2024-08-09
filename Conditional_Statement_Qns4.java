//WAP to sum first n even numbers using while loop.
public class Conditional_Statement_Qns4 {
  public static void main(String[] args) {
    int i=0;
    int n=5;
    int sum=0;
    while(i<n){
        sum=sum+2*i;
        i++;
    }
    System.out.println("the sum of "+n+" natural number is "+sum);
  }  
}
