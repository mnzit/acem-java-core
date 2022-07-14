import java.util.Objects;

public class Student {

    private Long rollNumber;
    private String name;


    public Student() {
    }

    public Student(Long rollNumber, String name) {
        this.rollNumber = rollNumber;
        this.name = name;
    }

    public Long getRollNumber() {
        return rollNumber;
    }

    public void setRollNumber(Long rollNumber) {
        this.rollNumber = rollNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return Objects.equals(rollNumber, student.rollNumber);
    }

    @Override
    public int hashCode() {
        int hashCode = Objects.hash(rollNumber);
        System.out.println(hashCode);
        return hashCode;
    }
}
