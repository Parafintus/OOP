package Controllers;

import StudentDomen.Emploee;
import StudentService.TeacherService;

/**
 * Класс Контроллер Преподавателей, имплементированный интерфейсом контроллера
 * за
 * пользователями
 */
public class TeacherController implements iUserController<Emploee> {
    // поле данные сервиса преподавателей
    private final TeacherService teachService = new TeacherService();

    // перегрузка метода создания экземпляра
    @Override
    public void create(String firstName, String secondName, String patronimic, int age, int id) {
        teachService.create(firstName, secondName, patronimic, age, id);
    }

    // создание элемента с учетом ученой степени
    public void create(String firstName, String secondName, int age, String academicDegree, int id) {
        teachService.create(firstName, secondName, academicDegree, age, academicDegree, id);
    }

}