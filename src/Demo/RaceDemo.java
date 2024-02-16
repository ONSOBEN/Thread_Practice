package Demo;

public class RaceDemo {
    private static int counter = 0;

    public static void main(String[] args) throws InterruptedException {
        // create and define the task for thread
        Runnable task = new Runnable() {
            @Override
            public void run() {
                for (double i = 1; i <= 10000; i++) {
                    synchronized (this) {
                        counter++;
                    }
                }
            }
        };
        Thread thread1 = new Thread(task);
        Thread thread2 = new Thread(task);
        thread1.start();
        thread2.start();

        thread1.join(); // wait for thread1 to finish the task first
        thread2.join();
        System.out.println("Expected Value  = 200000 ");
        System.out.println("Actual values = " + counter);

    }
}
