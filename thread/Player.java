public class Player extends Thread {

    private Thread thread;

    public Thread getThread() {
        return thread;
    }

    public void setThread(Thread thread) {
        this.thread = thread;
    }

    @Override
    public void run() {
        try {
            System.out.println("Started thread is " + Thread.currentThread().getName());
            thread.join();
            System.out.println("Ended thread is " + Thread.currentThread().getName());
        } catch (Exception ex) {
        }
    }

}
