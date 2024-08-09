class EkClass{
    int x;
    EkClass(int x){
        this.x=x;
    }
    public int getx(){
        return x;
    }
}
class Doclass extends EkClass{
Doclass(int x){
    super(x);
    System.out.println("I am a doclass constructor.");
}
public int getx(){
    return x;
}
}
public class Super_Keyword {
    public static void main(String[] args) {
        EkClass e1=new EkClass(5);
        Doclass d=new Doclass(45);
        System.out.println(e1.getx());
        System.out.println(d.getx());

    }
}
