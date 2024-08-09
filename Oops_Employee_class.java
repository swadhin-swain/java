/* create a class Employee with following properties and methods
->salary(property)(int)
->getSalary();
 ->name(propertie(strings)
 ->getName(method returning name)
 ->setName(method setting name)
 */
class Employee1{
    int salary; 
    String name;
   
    public int getSalary(){
        return salary;
    }
    public void setName(String n){
        name=n;
    }
    public String getName(){
        return name;
    }
};
public class Oops_Employee_class {
    public static void main(String[] args) {
        Employee1 pinu=new Employee1();
        //setting the details
        pinu.salary=45567;
       // pinu.name="swadhin swain";
        pinu.setName("swadhin swain");
        //getting the details of employee
        System.out.println("the name of the employee is "+pinu.getName());
        System.out.println("the salary of the employee is "+pinu.getSalary());
    }
}

