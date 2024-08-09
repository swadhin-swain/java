//calculate the average marks from an array containg marks of all subject using for each loop.
public class Array_Qns3 {
    public static void main(String[] args) {
        int [] marks={34,45,67,32,44};
        int sum=0;
        for(int element:marks){
            sum=sum+element;
        }
        float average=(float)sum/marks.length;
        System.out.println("the average is "+average);
    }
}
