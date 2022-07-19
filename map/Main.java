import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.function.BiFunction;
import java.util.function.Consumer;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {


        List<String> names = new ArrayList<>();

        names.add("hari");
        names.add("dari");
        names.add("sari");
        names.add("bari");
        names.add("barri");
        names.add("pari");

        names.forEach(s -> System.out.println("name: " + s));

        Stream<String> stream = names.stream();

        Optional<String> result = stream
                .filter(name -> name.startsWith("ba"))
                .collect(Collectors.toList()).stream().findFirst();

        System.out.println(result);


        List<Integer> marks = List.of(1, 1, 1, 1, 1);
        marks.forEach(Main::aasd);
        System.out.println(marks.stream().map(i ->i+1).collect(Collectors.toList()));

//        System.out.println(result2);

    }

    interface MathCommand<P1, P2, R> {
        R calculate(P1 param1, P2 param2);
    }

    // Map -> Internal of Map
    // Streams -> lambda, filter, map, reduce, collector, method referencing

    public static void aasd(Object o){
        System.out.println(o);
    }
}


