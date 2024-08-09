//write a program to reverse an array.
public class Array_Qns5 {
   public static void main(String[] args) {
    int [] arr={1,2,3,4,5,6,7,8,9};
    for(int i=0;i<arr.length/2;i++){
     int fv=arr[i];
     int sv=arr[arr.length-i-1];
     arr[i]=sv;
     arr[arr.length-i-1]=fv;
    }
   for(int i=0; i<arr.length;i++){
            System.err.printf("%d\t",arr[i]);
        }
        // for(int j=arr.length-1;j>=0;j--){
        //     System.err.printf("%d\t",arr[j]);
        // }
    }
   } 

