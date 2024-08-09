/* create a class monkey with jump and bite methods.
   create a class human which inherits this monkey class and implements basic animal interface with eat and sleep methods.
   Demonstrate polymorphism. 
 */
class Monkey{
    public void jump(){
       System.out.println("jumping....");
    }
    public void bite(){
        System.out.println("biting....");
    }
}
interface BasicAnimal{
    void eat();
    void sleep();
}
class Human extends Monkey implements BasicAnimal{
    @Override
    public void eat(){
        System.out.println("eating....");
    }
    @Override
    public void sleep(){
        System.out.println("sleeping....");
    }
    public void speak(){
        System.out.println("speking.....");
    }
}
public class Abstract_Interface_Qns2 {
    public static void main(String[] args) {
        //polymorphism
        Monkey mn=new Human();
        mn.jump();
       // mn.eat();------>throws error
       BasicAnimal ba=new Human();
       ba.sleep();
       Human hu=new Human();
       hu.speak();
       hu.sleep();
       hu.eat();
       hu.jump();
       hu.bite();
    }
    
}
