class Pinu {
    String name ;
    int salary;
    String getName(){
        return name;
    }
    void setName(String name){
        this.name = name;
    }
}
public class Swadhin {
    public static void main(String[] args) {
        Pinu p = new Pinu();
        p.setName("pinu");
        System.out.println(p.getName());
    }
}
