class Demo{
    void show(Integer i){
        System.out.println("Integer " + i);
    }
    void show(byte i){
        System.out.println("Autowinding Byte" + i);
    }
}
public class awinding {
    public static void main(String[] args) {
        Demo d1 = new Demo();
        int i = 10;
        d1.show(i);
    }
}
