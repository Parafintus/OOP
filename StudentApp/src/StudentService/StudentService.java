package StudentService;

import java.util.ArrayList;
import java.util.List;

import StudentDomen.Student;

/**
 * Класс Студент Сервис имплементирует интерфейс Сервис Пользователей
 */
public class StudentService implements iUserService<Student> {
    // счетчик количества элементов типа Student, так же используется в качестве
    // идентификатора для элементов
    private int count;
    // список студентов созданных внутри сервиса
    private List<Student> students;

    // конструктор класса, парпметры не принимает, определяет поле students как
    // пустой
    // массив
    public StudentService() {
        this.students = new ArrayList<Student>();
    }

    // перегрузка метода создания элемента с отчеством
    @Override
    public void create(String SecondName, String firstName, String patronymic, int age, int id) {
        Student per = new Student(SecondName, firstName, patronymic, age, id);
        count++;
        students.add(per);
    }

    // перегрузка метода получения всех элементов
    @Override
    public List<Student> getAll() {
        return students;
    }

    public List<Student> getSortedByFirstNameStudentGroup() {
        return null;
    }

    public List<Student> getSortedByIdStudentGroup() {
        return null;
    }

    public List<Student> getSortedByFirstName() {
        return null;
    }

}