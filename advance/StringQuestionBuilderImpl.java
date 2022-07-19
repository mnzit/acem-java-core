import java.util.ArrayList;
import java.util.List;

public class StringQuestionBuilderImpl implements QuestionBuilder {

    @Override
    public List<Question> build(String result) {
        List<Question> questions = new ArrayList<>();
        try {
            String[] lines = result.split("\n");
            for (String line : lines) {
                Question question = new Question();
                String[] breaker = line.split(",");
                question.setName(breaker[0]);
                question.setAnswer(Integer.parseInt(breaker[breaker.length - 1]));
                List<String> options = new ArrayList<>();
                for (int i = 1; i < breaker.length - 1; i++) {
                    options.add(breaker[i]);
                }
                question.setOptions(options);
                questions.add(question);
            }
        } catch (Exception exception) {
        }
        return questions;
    }
}
