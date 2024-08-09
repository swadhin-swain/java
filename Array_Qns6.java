//write a program to find the maximum element in an array.
public class Array_Qns6 {
   public static void main(String[] args) {
    int [] arr={45,978,554,76,9,23};
    int max=arr[0];
    for(int i=0;i<arr.length;i++){
        if(arr[i]>max){
            max=arr[i];
        }
    }
    System.out.println("the maximum element in array is "+max);
   } 
}
