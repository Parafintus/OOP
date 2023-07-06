package StudentService;

import java.util.ArrayList;
import java.util.List;

import StudentDomen.Teacher;
import StudentDomen.PersonComparator;

/**
 * 
 * Класс Сервис преподавателей имплементирует интерфейс Сервис Пользователей
 */
public class TeacherService implements iUserService<Teacher> {

    // список преподавателей, созданных внутри сервиса
    private List<Teacher> teachers;

    // конструктор класса, параметры не принимает, определяет поле teachers как
    // пустой массив
    public TeacherService() {
        this.teachers = new ArrayList<Teacher>();
    }

    // создание элемента с учетом ученой степени
    public void create(String firstName, String secondName, String patronimic, int age, String academicDegree, int id) {
        Teacher per = new Teacher(firstName, secondName, patronimic, age, academicDegree, id);

        teachers.add(per);
    }

    // перегрузка метода создания элемента
    @Override
    public void create(String lastName, String firstName, String patronymic, int age, int id) {
        Teacher per = new Teacher(lastName, firstName, patronymic, age, "", id);
        teachers.add(per);
    }

    // перегрузка метода получения всех элементов
    @Override
    public List<Teacher> getAll() {
        return teachers;
    }

    // метод получения отсортированных преподавателей по ID
    public List<Teacher> getSortedByIdStudentGroup() {
        List<Teacher> teachs = new ArrayList<>(teachers);
        teachs.sort(new PersonComparator<Teacher>());
        return teachs;
    }
}
