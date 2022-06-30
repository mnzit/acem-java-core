public class Main {
    public static void main(String args[]){

        SingletonExample singletonExample = SingletonExample.getInstance();
       
        System.out.println(singletonExample);

        SingletonExample singletonExample2 = SingletonExample.getInstance();
       
        System.out.println(singletonExample2);
    }
}