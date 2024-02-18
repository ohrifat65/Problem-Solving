package Thread;
public class ThreadCom extends Thread {

    int amount = 1000;
    synchronized void withdraw(int amount) {
        System.out.println("Withdraw...");
        if (this.amount < 1000) {
            System.out.println("Less balance, Waiting for depost... ");
            try {
                wait();
            } catch (InterruptedException e) {
            }
        }
        this.amount -= amount;
        System.out.println("Withdraw completed..." + this.amount);
    }
    synchronized void deposti(int amount) {
        System.out.println("Deposit...");
        this.amount += amount;
        System.out.println("Deposit completed...");
        notify();
    }
    public static void main(String[] args) {
        final ThreadCom c = new ThreadCom();
        new Thread() {
            @Override
            public void run() {
                c.withdraw(5000);
            }
        }.start();
        new Thread() {
            @Override
            public void run() {
                c.deposti(1000);
            }
        }.start();

    }
} 