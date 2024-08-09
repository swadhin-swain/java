//to find the length of the array.
public class Array_Length {
    public static void main(String[] args) {
        int [] marks=new int[5];
        System.out.println("the array length is "+marks.length);
        String [] student={"swadhin","tapas","shiv","abhijit","rajesh"};
         System.out.println("the student array length is "+student.length);
         System.out.println(student[0]);
         marks[0]=12;
         marks[1]=22;
         marks[2]=32;
         marks[3]=42;
         marks[4]=52;
         //displaying array in reverse order.
         for(int i=marks.length-1;i>=0;i--){
            System.out.println(marks[i]);
         }
    }
}
