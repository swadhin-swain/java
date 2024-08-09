import java.util.Scanner;
public class Two_D_Array {
    public static void main(String[] args) {
        Scanner p=new Scanner(System.in);
        int [][] arr=new int[2][3];
        //input ana array
        for(int i=0;i<arr.length;i++){
        for(int j=0;j<arr[i].length;j++){
            System.out.println("enter the value of arr["+i+"]["+j+"]");
          arr[i][j]=p.nextInt();
        }
        }
        //print an array
        for(int i=0;i<arr.length;i++){
        for(int j=0;j<arr[i].length;j++){
            System.out.println("the value of arr["+i+"]["+j+"]= "+arr[i][j]);
        }
        }
        p.close();
    }
}
