public class Player extends Thread {

    private Integer countCopy;
    private Integer count;

    public Player(Integer count) {
        this.count = count;
        this.countCopy = count;
    }

    private Player(Integer count, Integer countCopy) {
        this.count = count;
        this.countCopy = countCopy;
    }

    @Override
    public void run() {
        try {
            if (count >= 1) {
                Player thread = new Player(count - 1, countCopy);
                thread.start();
                Thread.sleep((countCopy - (count - 1)) * 500);
                System.out.println(Thread.currentThread().getName()+ " started " + thread.getName() );
                thread.join();
                Thread.sleep(500);
                System.out.println(Thread.currentThread().getName() + " waited for " + thread.getName());
            }
        } catch (Exception ex) {
            System.out.println("Exception: " + ex.getMessage());
        }
    }

}
