import java.util.Date;

public class SingletonExample {

    private static SingletonExample instance = null;

    private SingletonExample(){}
    
    public static SingletonExample getInstance(){
        if(instance == null){
            instance =  new SingletonExample();
        }
        return instance;
    }

  
}



// WAP make a quiz game;

// 1. Enter your name

// Press 1 to see current highscore
// Press 2 to play
// Press 3 to exit

// 01:20
// 1. What is the captial of Nepal
// a) KTM b) Sydney c) Hetauda
// -> a)
// 01:25

// 9/10




// Scanner scanner = new Scanner(System.in);
//