public class Methods {
    static int sum(int x,int y){
        int d=x+y;
        return d;
    }
    public static void main(String[] args) {
        int a=56;
        int b=44;
        int c=sum(a,b);
        System.out.println("the sum of a & b is "+c);
        /*
         Methods obj=new Methods();
         int c=obj.sum(a,b);
         */
    }
}
