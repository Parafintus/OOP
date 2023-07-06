
// import java.net.NoRouteToHostException;
import java.util.ArrayList;
// import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Random;
// import Controllers.EmploeeController;

// import StudentDomen.Emploee;
import StudentDomen.Student;
// import StudentDomen.StudentSteam;
import StudentDomen.StudentGroup;
import StudentDomen.Teacher;
// import StudentDomen.Person;
import StudentService.EmploeeService;
import StudentService.StudentService;
import StudentService.TeacherService;

public class App {
    /**
     * @param args
     * @throws Exception
     */
    public static void main(String[] args) throws Exception {

        // Создаем сервис студентов - экземпляр класса StudentService
        StudentService serv = new StudentService();

        // Добавляем студентов внутрь сервиса
        serv.create("Алибаева", "Альбина", "Ринатовна", 20, 0001);
        serv.create("Бобровский", "Ярослав", "Александрович", 22, 0002);
        serv.create("Варзер", "Назарий", "Алексеевич", 20, 0003);
        serv.create("Маслова", "Арина", "Михайловна", 22, 0062);
        serv.create("Яковлев", "Илья", "Денисович", 20, 0075);
        serv.create("Родченко", "Тихон", "Владимирович", 22, 0077);
        serv.create("Смирнова", "Елизавета", "Эдуардовна", 20, 0125);
        serv.create("Тимашев", "Леонид", "Янович", 22, 0325);
        serv.create("Лебедев", "Всеволод", "Борисович", 20, 0456);
        serv.create("Медведев", "Артемий", "Ильич", 22, 0012);
        serv.create("Болдырева", "Ксения", "Артемовна", 20, 0112);
        serv.create("Шимко", "Алёна", "Александровна", 22, 1111);
        serv.create("Ковач", "Алёна", "Валентиновна", 20, 1101);
        serv.create("Долгих", "Олеся", "Викторовна", 22, 1000);

        // Выводим список студентов внутри сервиса
        System.out.println("Список всех студентов:");
        for (Student s : serv.getAll()) {
            System.out.println(s);
        }
        System.out.println();
        System.out.println("=============Список студентов после сортировки==============");
        // Выводим отсортированный список студентов из сервиса по Id
        List<Student> sortedList = new ArrayList<>(serv.getAll());
        Collections.sort(sortedList, Comparator.comparing(Student::getId));
        for (Student s : sortedList) {
            System.out.println(s);
        }

        // Рандомное разбиение студентов на группы
        System.out.println();
        List<Student> students = serv.getAll();
        int groupSize = students.size() / 3;
        Collections.shuffle(students, new Random());
        List<StudentGroup> groups = new ArrayList<>();
        groups.add(new StudentGroup(students.subList(0, groupSize), groupSize));
        groups.add(new StudentGroup(students.subList(groupSize, groupSize * 2), groupSize));
        groups.add(new StudentGroup(students.subList(groupSize * 2, students.size()), groupSize));

        // Выводим список групп
        System.out.println();
        System.out.println("Список групп студентов:");
        for (StudentGroup group : groups) {
            System.out.println(group);
        }

        // Выводим список студентов внутри каждой группы
        System.out.println();
        for (StudentGroup group : groups) {
            System.out.println("Список студентов группы " + group.getGroupID() + ":");
            for (Student student : group.getStudents()) {
                System.out.println(student);
            }
            System.out.println();
        }

        // Создаем сервис работников - экземпляр класса EmploeeService
        EmploeeService servEmp = new EmploeeService();
        // Добавляем работников внутрь сервиса
        servEmp.create("Иванова", "Дарья", "Ивановна", 34, 0245);
        servEmp.create("Сидорова", "Ольга", "Леонидовна", 45, 0246);
        servEmp.create("Карасева", "Сергей", "Сергеевич", 43, 0247);
        servEmp.create("Тарарова", "Зиновий", "Клавдиевич", 49, 0242);

        // Выводим список работников из сервиса
        System.out.println();
        System.out.println("Список работников:");
        for (int i = 0; i < servEmp.getAll().size(); i++) {
            System.out.println(servEmp.getAll().get(i));
        }
        System.out.println("=============Список работников после сортировки==============");
        // Выводим отсортированный список работников из сервиса
        for (int i = 0; i < servEmp.getSortedByIdStudentGroup().size(); i++) {
            System.out.println(servEmp.getSortedByIdStudentGroup().get(i));
        }

        // Создаем сервис преподавателей - экземпляр класса TeacherService
        TeacherService servTeach = new TeacherService();
        // Добавляем преподавателей внутрь сервиса
        System.out.println();
        servTeach.create("Поликарпов", "Владислав", "Сергеевич", 30, "Доцент", 0111);
        servTeach.create("Алыбаев", "Евгений", "Иванович", 44, "Старший преподаватель", 0033);
        servTeach.create("Смирнов", "Анатолий", "Владленович", 68, "Профессор", 0077);
        servTeach.create("Иванова", "Елена", "Вячеславовна", 62, "Доцент", 1234);
        servTeach.create("Соседов", "Валерий", "Васильевич", 52, "Доцент", 2345);
        servTeach.create("Васечкин", "Юрий", "Иванович", 62, "Профессор", 3456);
        // Выводим список преподавателей из сервиса
        System.out.println("Список преподавателей:");
        for (Teacher t : servTeach.getAll()) {
            System.out.println(t);
        }
        System.out.println("===========После сортировки================");
        // Выводим отсортированный список преподавателей из сервиса
        for (Teacher t : servTeach.getSortedByIdStudentGroup()) {
            System.out.println(t);
        }

    }
}