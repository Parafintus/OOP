package StudentDomen;

/**
 * Класс Работник дочерний от Пользователь
 */
public class Emploee extends Person {

    /**
     * Конструктор класса
     * 
     * @param firstName  имя
     * @param secondName фамилия
     * @param patronymic отчество
     * @param age        возраст
     * @param id         идентификационный номер
     */
    public Emploee(String firstName, String secondName, String patronymic, int age, int id) {
        super(firstName, secondName, patronymic, age, id);
        this.id = id;
    }

    /* перегрузка метода вывода */
    @Override
    public String toString() {
        return "Employee{"
                + "firstName=" + super.getFirstName()
                + ", secondName=" + super.getSecondName()
                + ", patronymic=" + super.getPatronymic()
                + ", age=" + super.getAge()
                + ", ID=" + id
                + '}';
    }

    public int getId() {
        return id;
    }
}