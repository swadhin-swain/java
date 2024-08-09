 //create a constructor
class Employee6{
    private int id;
    private String name;
public Employee6(int myid,String myname){
    id=myid;
    name=myname;
}    
public String getName(){
    return name;
}
public int getId(){
    return id;
}
}
public class Constructor2 {
   
     public static void main(String[] args) {
        Employee6 pinu=new Employee6(2305094,"swadhin swain");
       System.out.println("the name is "+pinu.getName());
       System.out.println("the id is "+pinu.getId()); 
   }
    }

 


