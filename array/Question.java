import java.util.List;

public class Question {
    private String name;
    private List<String> options;
    private Integer answer;



    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<String> getOptions() {
        return options;
    }

    public void setOptions(List<String> options) {
        this.options = options;
    }

    public Integer getAnswer() {
        return answer;
    }

    public void setAnswer(Integer answer) {
        this.answer = answer;
    }

    @Override
    public String toString() {
        return "Question{" +
                "name='" + name + '\'' +
                ", options=" + options +
                ", answer=" + answer +
                '}';
    }
}
