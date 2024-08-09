//find the minimum element in an array.
public class Array_Qns7 {
  public static void main(String[] args) {
    int [] arr={1,34,643,84,0,6647,33,22,1};
    int min=arr[0];
    for(int i=0;i<arr.length;i++){
        if(arr[i]<min){
            min=arr[i];
        }
    }
    System.out.println("the minimum element in array is "+min);
  }  
}
