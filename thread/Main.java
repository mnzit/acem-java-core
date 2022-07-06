import java.util.stream.IntStream;

public class Main {
    
    public static void main(String args[]){
        
        TestValue testValue = new TestValue(1);

        Thread t1 = new Thread(() -> IntStream.range(1, 100).forEach(i -> testValue.increment()));
        Thread t2 = new Thread(() -> IntStream.range(1, 100).forEach(i -> testValue.decrement()));

        t1.start();
        t2.start();
        try{
        Thread.sleep(4000);
        }catch(Exception ex){

        }
        System.out.println(testValue);
        
    }

}
