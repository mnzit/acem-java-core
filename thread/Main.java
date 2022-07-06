
public class Main {
    
    public static void main(String args[]){
        System.out.println("Started Main Thread");
        
        Player player1 = new Player();
        player1.setName("player-1");
        Player player2 = new Player();
        player2.setName("player-2");

        player1.setThread(player2);
        player2.setThread(player1);

        player1.start();
        player2.start();
       
        System.out.println("Ended Main Thread");
    }

}
