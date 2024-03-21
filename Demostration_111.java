import java.util.*;
import java.lang.*;

class ThreadA implements Runnable {
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println("The thread A with i =" + -1 * i);
        }
        System.out.println("Exiting from Thread A...");
    }

    @Override
    public String toString() {
        return "ThreadA []";
    }
}

class ThreadB implements Runnable {
    public void run() {
        for (int j = 1; j <= 5; j++) {
            System.out.println("The Thread B with j" + 2 * j);
        }
        System.out.println("Exiting from Thread B...");
    }
}

class ThreadC implements Runnable {
    public void run() {
        for (int k = 1; k <= 5; k++) {
            System.out.println("The Thread C with k =" + (2 * k - 1));
        }
        System.out.println("Exiting from Thread C....");
    }
}

public class Demostration_111 {
    public static void main(String args[]) {
        Thread a = new Thread(new ThreadA());
        Thread b = new Thread(new ThreadB());
        Thread c = new Thread(new ThreadC());
        a.start();
        b.start();
        c.start();
        System.out.println("....Multithreading is over");
    }
}
