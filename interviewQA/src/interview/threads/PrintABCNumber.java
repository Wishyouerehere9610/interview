package interview.threads;

public class PrintABCNumber {
    private int times;
    private int state;

    private static final Object LOCK = new Object();

    public PrintABCNumber(int times) {
        this.times = times;
    }

    public static void main(String args[]) {
        PrintABCNumber printABCNumber = new PrintABCNumber(10);
        new Thread(() -> printABCNumber.run("A", 0), "A").start();
        new Thread(() -> printABCNumber.run("B", 1), "B").start();
        new Thread(() -> printABCNumber.run("C", 2), "C").start();
    }

    private void run(String name, int targetState) {
        for (int i = 0; i < times; i++) {
            synchronized (LOCK) {
                while (state % 3 != targetState) {
                    try {
                        LOCK.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                state++;
                System.out.print(name);
                LOCK.notifyAll();
            }
        }
    }


}
