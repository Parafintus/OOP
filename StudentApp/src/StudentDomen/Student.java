package StudentDomen;

/**
 * Класс Студент дочерний от Пользователь, с добавлением интерфейса для
 * сравнения студентов
 */
public class Student extends Person implements Comparable<Student> {
    private long studentID;

    /**
     * конструктор класса
     * 
     * @param firstName  имя
     * @param secondName фамилия
     * @param patronymic отчество
     * @param age        возраст
     * @param id         идентификационный номер
     */
    public Student(String firstName, String secondName, String patronymic, int age, int id) {
        super(firstName, secondName, patronymic, age, id);
        this.id = id;
    }

    /* перегрузка метода вывода */
    @Override
    public String toString() {
        return "Student{"
                + "firstName=" + super.getFirstName()
                + ", secondName=" + super.getSecondName()
                + ", patronymic=" + super.getPatronymic()
                + ", age=" + super.getAge() +
                ", ID=" + id +
                '}';
    }

    /* перегрузка метода для сравнения двух студентов */
    @Override
    public int compareTo(Student o) {
        if (super.getAge() == o.getAge()) {
            if (this.studentID == o.studentID) {
                return 0;
            }
            if (this.studentID < o.studentID) {
                return -1;
            }
            return 1;
        }
        if (super.getAge() < o.getAge()) {
            return -1;
        }
        return 1;
    }
}