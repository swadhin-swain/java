class Employee4{
    private int id;
    private String name;
    //setters for set details
    public void setName(String n){
        name=n;
    }
    public void setId(int n){
        id=n;
    }
    //getters for get details
    public String getName(){
        return name;
    }
    public int getId(){
        return id;
    }

}
public class Getters_And_Setters {
    public static void main(String[] args) {
        //create the objects
        Employee4 pinu=new Employee4();
        //setting the details
        pinu.setName("swadhin swain");
        pinu.setId(235094);
        //printing the details
        System.out.println("The name of the employee is "+pinu.getName());
        System.out.println("The id of the employee is "+pinu.getId());
    }
}
