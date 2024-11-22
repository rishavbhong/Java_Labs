class Calculator extends Thread {
    int total = 0;


    public synchronized void run() {
        for (int i = 0; i <= 1000; i++) {
            total = total + i;
        }
        notifyAll();
    }
}

class Reader extends Thread {
    Calculator c1;

    public Reader(Calculator c1) {
        this.c1 = c1;
    }

    @Override
    public void run() {
        synchronized (c1) { // Synchronize on the Calculator object
            try {
                c1.wait(); // Wait until the Calculator thread notifies
            } catch (InterruptedException ex) {
                ex.printStackTrace();
            }
            System.out.println("Total 1 to 1000: " + c1.total);
        }
    }
}

public class CalculatorReader {
    public static void main(String[] args) {
        Calculator c1 = new Calculator();

        // Start reader threads
        new Reader(c1).start();
        new Reader(c1).start();
        new Reader(c1).start();

        // Start calculator thread
        c1.start();
    }
}
