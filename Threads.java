public class Threads implements Runnable {
    public void run() {
        System.out.println("Hello from a thread!");

    }
    public static void main(String[] args) {
        for (int i = 1 ; i <= 10 ; i++) {
            (new Thread(new Threads())).start();
        }
        System.out.println("Hello from main thread!");

    }
}
