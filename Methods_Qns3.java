//write a function to find average of a set of numbers.
public class Methods_Qns3 {
    static float average(float...arr){
        float average=0;
        for(float element:arr){
            average=average+element;
        }
        average=average/arr.length;
        return average;
    } 
    public static void main(String[] args) {
        System.out.println("the average is "+average(4.5f,23.6f,1.7f,78.4f,444.4f));
    }
}
