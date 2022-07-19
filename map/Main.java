import java.util.HashMap;
import java.util.Map;

public class Main {
    private static Object[] heroes = new String[10];

    public static void main(String[] args) {
        put("superman");
        System.out.println(get("superman"));
    }

    public static Object get(Object obj){
        int hashCode = getCode(obj);
        System.out.println(hashCode);
        if(hashCode >= heroes.length){
            return null;
        }else{
            return heroes[hashCode];
        }
    }

    public static void put(Object object){
        heroes[getCode(object)] = object;
    }

    public static int getCode(Object object){
        int hashCode = object.hashCode();
        System.out.println("hashCode : "+ hashCode);
        System.out.println("mod : "+ hashCode % heroes.length);
        System.out.println(object+" location is: "+ Math.abs(hashCode % heroes.length));
        return Math.abs(hashCode % heroes.length);
    }


}