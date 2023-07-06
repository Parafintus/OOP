package StudentDomen;

import java.util.Iterator;
import java.util.List;

/**
 * Класс Поток студентов, расширенный интерфейсом Iterable для возможности
 * перебора его элементов - групп
 */
public class StudentSteam implements Iterable<StudentGroup> {
    private List<StudentGroup> steam;

    /**
     * конструктор класса
     * 
     * @param steam список групп потока
     */
    public StudentSteam(List<StudentGroup> steam) {
        this.steam = steam;
    }

    /* получение списка групп в потоке */
    public List<StudentGroup> getSteam() {
        return steam;
    }

    /* установка списка групп в потоке */
    public void setSteam(List<StudentGroup> steam) {
        this.steam = steam;
    }

    /* перегрузка метода Итератора с использованием анонимного класса */
    @Override
    public Iterator<StudentGroup> iterator() {
        return new Iterator<StudentGroup>() {
            private int index = 0;

            @Override
            public boolean hasNext() {
                return index < steam.size();
            }

            @Override
            public StudentGroup next() {
                if (!hasNext()) {
                    return null;
                }
                // counter++;
                return steam.get(index++);
            }

        };
    }
}