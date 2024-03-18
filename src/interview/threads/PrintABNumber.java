package interview.threads;

public class PrintABNumber {
    public static void main(String[] args) {
        Run run = new Run();
        Thread foo = new Thread(run,"foo");
        Thread bar = new Thread(run,"bar");

        foo.start();
        bar.start();

    }

    public static class Run implements Runnable {
        volatile int i = 0;

        @Override
        public void run() {
            while (true) {
                synchronized (this) {
                    notify();
                    for (int j = 1; j < 3; j++) {
                        System.out.println(Thread.currentThread().getName() + j);
                    }
                    i++;
                    if (i < 5) {
                        try {
                            wait();
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    } else {
                        break;
                    }

                }
            }
        }
    }

}



