package StudentDomen;

import java.beans.IntrospectionException;
import java.util.Comparator;

/**
 * Класс для сравнения пользователей с параметрическим типом T,
 * причем T может быть только потомком класса Пользователь, с добавлением
 * интерфейса для сравнения
 */
public class PersonComparator<T extends Person> implements Comparator<T> {
    /* перегрузка метода сравнения */
    @Override
    // public int compare(T o1, T o2) {
    // int resultOfComparing = ;
    // if (resultOfComparing == 0) {
    // resultOfComparing = ;
    // return resultOfComparing;
    // } else {
    // return resultOfComparing;
    // }
    // }
    public int compare(T o1, T o2) {
        return o1.getId() - o2.getId();
    }

}