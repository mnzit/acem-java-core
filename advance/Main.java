import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        Reader fileReader = new FileReader("quiz.txt");
        try {
            String result = fileReader.read();
            QuestionBuilder questionsBuilder = new StringQuestionBuilderImpl();

            System.out.println(questionsBuilder.build(result));


        }catch (Exception ex){
            System.out.println(ex.getMessage());
        }

    }
}
