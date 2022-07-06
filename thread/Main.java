
public class Main {

    public static void main(String args[]) {
        Player player = new Player(10);
        System.out.println(Thread.currentThread().getName() + " started " + player.getName());
        player.start();
        try {
            player.join();
        } catch (Exception ex) {
            System.out.println("Exception: " + ex.getMessage());
        }
        System.out.println(Thread.currentThread().getName() + " waited for " + player.getName());
    }

}
