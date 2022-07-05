public class TestValue extends Object{

    private Integer number;

    public TestValue(Integer number){
        this.number = number;
    }


    public void increment(){
        synchronized(number){
            number++;
        }
  
    }

    public void decrement(){
        synchronized(number){
            number--;
        }
       
    }


    @Override
    public String toString() {
        return "TestValue [number=" + number + "]";
    }

    

}