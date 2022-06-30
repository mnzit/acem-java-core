public class Football implements Passable, Dribbleable, Bounceable, Kickable{

    
    
}

public class Human {

    void breathe();

}


public class Parent extends Human{

    void lectureChild(){

    }
}


public class Child extends Human{

    void lectureParent(){

    }

    void alwaysCry(){

    }
    
}

['1' => "One",'2' => "Two",'3']

Human parent = new Child();
parent.alwaysCry();



// Concrete 
public class MySqlConnector {

    public void openAndConnect(){

    }

    public void executeUpdate(){

    }
}

public class OracleConnector {

    public void open(){
        
    }
    public void connect(){

    }
    public void close(){
        
    }

    public void query(){
        
    }
}



public class Nokia1100 {

void call (){
// CONNECTIONS
}

void sms(){


}

}


public class Nokia2200 extends Nokia1100{

    @Override
    void call(){
        super.call();
        // enhancing the quality of call
    }


    void takePhoto(){

    }
}