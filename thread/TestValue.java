public class TestValue extends Object{

    private volatile Integer number;

    public TestValue(Integer number){
        this.number = number;
    }


    public void increment(){
        synchronized(number){
            System.out.println("Incrementing: "+ number + " to "+ (number+1));
            number++;
        }
  
    }

    public void decrement(){
        synchronized(number){
            System.out.println("Decrementing: "+ number + " to "+ (number-1));
            number--;
        }
       
    }


    @Override
    public String toString() {
        return "TestValue [number=" + number + "]";
    }

    

}