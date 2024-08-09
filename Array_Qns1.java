//create an array of 5 floats & calculate their sum.
public class Array_Qns1 {
    public static void main(String[] args) {
     float [] arr={23.3f,34.5f,12.2f,11.1f,77.6f};
     float sum=0;
     for(float element:arr){
        sum=sum+element;
     } 
     System.out.println("the sum is "+sum);  
    }
}
