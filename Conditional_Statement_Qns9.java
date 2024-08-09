//WAP to calculate sum of the number occuring in the multiplication table of 8.
public class Conditional_Statement_Qns9 {
 public static void main(String[] args) {
    int n=8;
    int sum=0;
    for(int i=1;i<=10;i++){
        sum=sum+(n*i);
    }
    System.out.println("the sum of numbers occuring in multiplication table of 8 are "+sum);
 }   
}
