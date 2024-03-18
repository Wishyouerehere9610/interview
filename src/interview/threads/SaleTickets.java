package interview.threads;

public class SaleTickets implements Runnable {

    private String salerName;

    public SaleTickets(String salerName) {
        this.salerName = salerName;

    }

    volatile private static int total = 100;

    @Override
    public void run() {
        while (total>0) {
            synchronized (this) {
                notifyAll();
                System.out.println(salerName + "正在卖票：" + total);
                total--;
                if (total > 0) {
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

    public static void main(String[] args) {

        SaleTickets sale1 = new SaleTickets("张三");
        SaleTickets sale2 = new SaleTickets("李四");
        SaleTickets sale3 = new SaleTickets("赵五");

        Thread t1 = new Thread(sale1);
        Thread t2 = new Thread(sale2);
        Thread t3 = new Thread(sale3);

        t1.start();
        t2.start();
        t3.start();

    }
}
