//write a java program whether an array is sorted or not.
public class Array_Qns8 {
  public static void main(String[] args) {
    int [] arr={1,2,3,4,3,5,6,7,8,9};
    boolean isSorted=true;
    for(int i=0;i<arr.length-1;i++){
        if(arr[i]>arr[i+1]){
            isSorted=false;
        }   
     }
     if(isSorted){
        System.out.println("the array is sorted");
     }
     else{
        System.out.println("the array is not sorted");
     }
     }
  }  

