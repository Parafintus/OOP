package Controllers;

import StudentDomen.Person;

// интерфейс контроллера за пользователем
public interface iUserController<T extends Person> {
    // метод создания экземпляра типа Т
    void create(String firstName, String secondName, String patronimic, int age, int id);
}