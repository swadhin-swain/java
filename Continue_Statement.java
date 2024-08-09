//WAP for continue statement.
public class Continue_Statement {
   public static void main(String[] args) {
    for(int i=1;i<=5;i++){
        if(i==3){
            System.out.println("continue the loop");
            continue;
        }
        System.out.println(i);
        System.out.println("java is great.");
    }
   } 
}
