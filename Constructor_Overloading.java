class Employee7{
    private int id;
    private String name;
    public Employee7(){
       id=2305094;
       name="swadhin swain";
    }
     public Employee7(int myid){
       id=myid;
       name="swadhin swain";
    }
     public Employee7(String myname){
        id=2305094;
        name=myname;
    }
    public Employee7(int myid,String myname){
        id=myid;
        name=myname;
    }
    //getters for getting details.
    public String getName(){
        return name;
    }
    public int getId(){
        return id;
    }
}
public class Constructor_Overloading {
    public static void main(String[] args) {
        Employee7 pinu=new Employee7(2305094,"swadhin swain");
        System.out.println("The name of the employee is "+pinu.getName());
        System.out.println("The id of the employee is "+pinu.getId());

    }
    
}
