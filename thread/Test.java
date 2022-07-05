public class Test {

    private static int number = 0;
    private String name;

    public Test(){
       this("name-"+number++);
    }

    public Test(String name){
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

 
    
}
