//write a program to find out whether a given integer are present in an array or not.
public class Array_Qns2 {
   public static void main(String[] args) {
    int [] arr={1,2,3,4,5,6,7,8,9,0};
    boolean isInArray=false;
    int n=5;
    //find the integer in array
    for(int i=0;i<arr.length;i++){
        if(n==arr[i]){
            isInArray=true;
            break;
        }
    }
    if(isInArray==true){
        System.out.println("the number is present in array");
    }
    else{
         System.out.println("the number is not present in array");
    }
    }
   } 

