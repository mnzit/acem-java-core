import java.util.concurrent.atomic.AtomicInteger;

public class TestValue extends Object{

    private AtomicInteger number;

    public TestValue(Integer number){
        this.number = new AtomicInteger(number);
    }


    public void increment(){
        // synchronized(number){
            System.out.println("Incrementing: "+ number + " to ");
            number.incrementAndGet();
            
        // }
  
    }

    public void decrement(){
        // synchronized(number){
            System.out.println("Decrementing: "+ number + " to ");
            number.decrementAndGet();
        // }
       
    }


    @Override
    public String toString() {
        return "TestValue [number=" + number + "]";
    }

    

}