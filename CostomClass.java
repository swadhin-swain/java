//creating own custom class by oops.
class Employee{
int id;
int salary;
String name;
public void printDetails(){
  System.out.print("my id is "+id);
  System.out.println(" and my name is "+name);
}
public int getSalary(){
    return salary;
}
};

public class CostomClass {
    public static void main(String[] args) {
        //creating objects.
        Employee swadhin=new Employee();
        Employee mantu=new Employee();
        //setting the attributes for objects.
        swadhin.name="swadhin swain";
        swadhin.id=2305094;
        swadhin.salary=50000;
        mantu.name="abhijit swain";
        mantu.id=20354678;
        mantu.salary=45000;
        //printing the attributes.
        swadhin.printDetails();
        mantu.printDetails();
        int money=swadhin.getSalary();
        int paisa=mantu.getSalary();
        System.out.println("the salary of swadhin is "+money);
        System.out.println("the salary of mantu is "+paisa);
    }
}
