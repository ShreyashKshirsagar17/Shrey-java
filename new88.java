package MatrixRotation;

class MyThreadd extends Thread {
    public void run() {
        for(int i = 1; i <= 5; i++) {
            System.out.println("Thread running: " + i);
        }
    }
}

public class new88 {
    public static void main(String[] args) {
        MyThreadd t1 = new MyThreadd();
        t1.start();

        for(int i = 1; i <= 5; i++) {
            System.out.println("Main Thread: " + i);
        }
    }
}