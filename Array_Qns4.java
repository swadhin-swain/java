//create ajava programme to add 2 matrices.
public class Array_Qns4 {
   public static void main(String[] args) {
    int [][] m1={{1,2,3},
                 {4,5,6}};
    int [][] m2={{7,8,9},
                 {4,9,6}};
                 int [] [] m3=new int[2][3];
    //adding the matrices
    for(int i=0;i<m1.length;i++){
    for(int j=0;j<m1[i].length;j++){
        m3[i][j]=m1[i][j]+m2[i][j];
    }    
    } 
    //printing the matrices
    for(int i=0;i<m1.length;i++){
    for(int j=0;j<m1[i].length;j++){
       System.out.print(m3[i][j]);
       System.out.print(" ");
    }   
    System.out.println(" ");  
    }        
   } 
}
