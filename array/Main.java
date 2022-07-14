import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        List<Object> list = new DynamicList<>();
        Person person = new Person();
        person.id = 1L;
        list.add(person);
        list.add(new Person("Ramlal", 12));
        list.add(new Person("Shyamlal", 13));
        list.add(true);
        list.add('A');

        for(Object element: list.all()){
            System.out.println(element);
        }
    }
}
