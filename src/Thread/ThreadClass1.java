package Thread;

public class ThreadClass1 extends Thread {

    ThreadClass1() {
        System.out.println("ThreadClass 1" + this);
    }

    @Override
    public void run() {
        try {
            for (int i = 0; i < 10; i++) {
                System.out.println("ThreadClass 1");
                sleep(500);
            }
        } catch (InterruptedException e) {
            System.out.println(e);
        }
    }

}

class ThreadClass2 extends Thread {

    ThreadClass2() {
        System.out.println("ThreadClass 2" + this);
    }

    @Override
    public void run() {
        try {
            for (int i = 0; i < 10; i++) {
                System.out.println("ThreadClass 2");
                sleep(500);
            }
        } catch (InterruptedException e) {
            System.out.println(e);
        }
    }

}

class child {

    public static void main(String args[]) {
        new ThreadClass1().start();

        new ThreadClass2().start();

        for (int i = 0; i < 10; i++) {
            try {
                System.out.println("Main Method");
                Thread.sleep(500);
            } catch (InterruptedException ex) {
                System.out.println(ex);
            }
        }
    }
}
