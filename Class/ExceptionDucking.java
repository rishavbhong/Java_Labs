public class ExceptionDucking {
    public static void main(String[] args) throws ClassNotFoundException {
        System.out.println("Main Start");
        try{
            test(9);
        }
        catch (ClassNotFoundException ex){
            ex.printStackTrace();
        }

        System.out.println("Main End");
    }
    public static void test(int i) throws ClassNotFoundException{
        System.out.println("Test start");
        test1(9);
        System.out.println("Test end");
    }
    public static void test1(int i) throws  ClassNotFoundException{
        System.out.println("Test1 Start");
       test2(9);
        System.out.println("test1 end");
    }
    public static void test2(int i) throws ClassNotFoundException{
        System.out.println("test2 start");
        Class.forName("");
        System.out.println("test 2 end");
    }
}
