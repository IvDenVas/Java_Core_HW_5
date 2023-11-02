import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Student student1 = new Student("Иван", Arrays.asList(4.2, 4.8, 5.0), "Математика");
        Student student2 = new Student("Петр", Arrays.asList(4.9, 4.4, 4.7), "Информатика");
        Student student3 = new Student("Олег", Arrays.asList(4.1, 4.1, 4.2), "Физика");
        Student student4 = new Student("Елена", Arrays.asList(4.0, 3.9, 4.7), "Литература");
        Student student5 = new Student("Ирина", Arrays.asList(5.0, 4.9, 4.2), "Информатика");
        Student student6 = new Student("Денис", Arrays.asList(4.5, 4.5, 4.5), "Информатика");
        Student student7 = new Student("Дмитрий", Arrays.asList(5.0, 4.3, 4.5), "Информатика");
        Student student8 = new Student("Александр", Arrays.asList(5.0, 4.5, 5.0), "Информатика");
        Student student9 = new Student("Евгений", Arrays.asList(3.2, 4.0, 4.1), "Информатика");
        Student student10 = new Student("Юрий", Arrays.asList(3.0, 3.4, 3.9), "Информатика");
        Student student11 = new Student("Оля", Arrays.asList(5.0, 5.0, 5.0), "Информатика");

        List<Student> list = Arrays.asList(student1, student2, student3, student4, student5, student6,
                student7, student8, student9, student10, student11);
        var res = list.stream()
                .filter(s -> s.getSpecialty().equals("Информатика"))
                .filter(s -> s.getAverageGrade() > 4.5)
                .sorted(Comparator.comparingDouble(Student::getAverageGrade).reversed())
                        .toArray();

//        System.out.println(res.length);
        System.out.println(Arrays.toString(res));


    }

}
