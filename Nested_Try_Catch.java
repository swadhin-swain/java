import java.util.Scanner;
public class Nested_Try_Catch {
    public static void main(String[] args) {
        int [] marks=new int[5];
        marks[0]=33;
        marks[1]=43;
        marks[2]=53;
        marks[3]=63;
        marks[4]=73;
    Scanner p=new Scanner(System.in);
    boolean flag=true;
    while(flag){
      System.out.println("Enter the value of index");
    int ind=p.nextInt();
    try{
        System.out.println("WelCome to my world.");
        try{
            System.out.println("The value of array index is "+marks[ind]);
            flag=false;
        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println("sorry this index doesn't exist.");
            System.out.println("Exception in level 2");
        }
    }
    catch(Exception e){
        System.out.println("Exception in level 1.");
    }
    }
    
    }
}
