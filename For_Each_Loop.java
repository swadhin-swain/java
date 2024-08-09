public class For_Each_Loop {
    public static void main(String[] args) {
        int [] marks=new int[5];
         marks[0]=12;
         marks[1]=22;
         marks[2]=32;
         marks[3]=42;
         marks[4]=52;
         for(int element:marks){
            System.out.println(element);
         }
    }
}
