//create a constructor
class Employee5{
    private int id;
    private String name;
public Employee5(){
    id=2305094;
    name="swadhin swain";
}    
public String getName(){
    return name;
}
public int getId(){
    return id;
}
}
public class Constructor1 {
    public static void main(String[] args) {
        Employee5 pinu=new Employee5();
       System.out.println("the name is "+pinu.getName());
       System.out.println("the id is "+pinu.getId()); 
    }
}
