class MyFirst extends Thread{
    public void run(){
        for (int i =0;i<100;i+=2){
            System.out.println(getName()+":"+i);
        }
    }
}

public class ThreadManager {
    public static void main(String[] args) {
        MyFirst mf = new MyFirst();
        mf.start();
        for(int i =0; i<100;i+=2){
            System.out.println(Thread.currentThread().getName()+i);
        }
    }
}
//The class in which we extends it with Thread, then it's only applicable usage is Multithreading we cannot do anyhting like Jframe extension or anything else
//That's why Java have created an Interface "RUNNABLE" to counter this drawback.
