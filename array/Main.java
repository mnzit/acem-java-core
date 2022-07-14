import java.util.*;

public class Main {
    public static void main(String[] args) {

        Set<Student> names = new LinkedHashSet<>();

        Student student1 = new Student(1L, "Biren");
        Student student2 = new Student(1L, "Biren");
        Student student3 = new Student(2L, "Biren");
        boolean condition = student1.equals(student2);

        System.out.println(condition);
        names.add(student1);
        names.add(student2);
        names.add(student3);



        System.out.println(names);


        Queue<String> games = new PriorityQueue<>();

        games.add("Fortnite");
        games.add("PSG");

        games.poll();

        System.out.println(games.poll());


        Stack<String> movies = new Stack<>();


        movies.add("Batman");
        movies.add("Superman");
        movies.add("Minions");

        movies.pop();

        System.out.println(movies);


    }

    @Override
    public String toString() {
        return super.toString();
    }
}
