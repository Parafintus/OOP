package StudentDomen;

/**
 * Класс Преподаватель дочерний от Пользователь
 */
public class Teacher extends Person {

    private String patronymic;

    private String academicDegree;

    /**
     * 
     * конструктор класса
     * 
     * @param firstName      имя
     * @param secondName     фамилия
     * @param patronymic     отчество
     * @param age            возраст
     * @param academicDegree ученая степень
     * @param id             id в системе
     */
    public Teacher(String firstName, String secondName, String patronymic, int age,
            String academicDegree, int id) {
        super(firstName, secondName, patronymic, age, id);
        this.patronymic = patronymic;
        this.academicDegree = academicDegree;
        this.id = id;
    }

    /* получение ученой степени преподавателя */
    public String getAcademicDegree() {
        return academicDegree;
    }

    /* установка ученой степени преподавателя */
    public void setAcademicDegree(String academicDegree) {
        this.academicDegree = academicDegree;
    }

    /* перегрузка метода вывода */
    @Override
    public String toString() {
        return "Teacher{" +
                "firstName=" + getFirstName() +
                ", secondName=" + getSecondName() +
                ", patronymic=" + getPatronymic() +
                ", age=" + getAge() +
                ", id=" + id +
                ", academicDegree=" + academicDegree +
                '}';
    }

}