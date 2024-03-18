package interview.threads;

public class PrintTwoThreadOneTwo {
    public static void main(String[] args) {
        Print print = new Print();

        Thread foo = new Thread(print);
        foo.setName("foo");
        Thread bar = new Thread(print);
        bar.setName("bar");

        foo.start();
        bar.start();
    }

    public static class Print implements Runnable {

        private volatile int i = 0;

        @Override
        public void run() {
            synchronized (this) {
                while (i < 4) {
                    for (int j = 1; j < 3; j++) {
                        System.out.println(Thread.currentThread().getName() + j);
                    }
                    i++;
                    notifyAll();
                    try {
                        if (i < 4) {
                            wait();
                        } else {
                            break;
                        }
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        }
    }
}

