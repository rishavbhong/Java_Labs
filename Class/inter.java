interface A{
    float PI = 3.14f;  //Public static final
    void show();        //Public Abstract
}
abstract class B{
    void info(){
        System.out.println("Info Abstarct");
    }
    abstract void display();
}
class C extends B implements A{

    void display() {
        System.out.println("Display");
    }

    @Override
    public void show() {
        System.out.println("Show call");    // Here mentioning of Public is important
    }
}


public class inter {
    public static void main(String[] args) {
        System.out.println(A.PI); // We are directly able to access the variable from the Interface A as it's static & public
        C c = new C();
        c.display();
        c.show();
        c.info();
    }

}
