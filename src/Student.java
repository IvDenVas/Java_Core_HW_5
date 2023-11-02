import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Student {
    private final String name;
    private final List<Double> grades;
    private final String specialty;

    public Student(String name, List<Double> grades, String specialty) {
        this.name = name;
        this.grades = grades;
        this.specialty = specialty;
    }

    public String getSpecialty() {
        return specialty;
    }

    @Override
    public String toString() {
        return "\nУченик: " + name + ' ' + Arrays.toString(grades.toArray()) + ' ' + specialty;
    }

    public double getAverageGrade() {
        return grades.stream()
                .mapToDouble(s -> s)
                .average().orElse(0);
    }
}

