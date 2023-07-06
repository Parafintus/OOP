package StudentDomen;

/**
 * Класс Пользователь, описывающий человека, который может быть связан с
 * Деканатом
 */
public class Person {
    private String firstName;
    private String secondName;
    private String patronymic;
    private int age;
    public int id;

    /**
     * конструктор
     * 
     * @param firstName  имя
     * @param secondName фамилия
     * @param patronymic отчество
     * @param age        возраст
     * @param id         Id человека в системе
     */
    public Person(String firstName, String secondName, String patronymic, int age, int id) {
        this.firstName = firstName;
        this.secondName = secondName;
        this.patronymic = patronymic;
        this.age = age;
        this.id = id;
    }

    public Person(String firstName2, String secondName2, int age2) {
    }

    /* получение имени */
    public String getFirstName() {
        return firstName;
    }

    /* установить имя */
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    /* получение отчества */
    public String getPatronymic() {
        return patronymic;
    }

    /* установить отчество */
    public void setPatronymic(String patronymic) {
        this.patronymic = patronymic;
    }

    /* получение фамилии */
    public String getSecondName() {
        return secondName;
    }

    /* установить фамилию */
    public void setSecondName(String secondName) {
        this.secondName = secondName;
    }

    /* получение возраста */
    public int getAge() {
        return age;
    }

    /* установить возраст */
    public void setAge(int age) {
        this.age = age;
    }

    /* Получение Id */
    public int getId() {
        return id;
    }

    /* Установка Id */
    public void setId(int id) {
        this.id = id;
    }

    /* перегрузка метода вывода */
    @Override
    public String toString() {
        return "User{" +
                "firstName='" + firstName + '\'' +
                ", secondName='" + secondName + '\'' +
                ", patronymic='" + patronymic + '\'' +
                ", age=" + age +
                ", Id=" + id +
                '}';
    }
}