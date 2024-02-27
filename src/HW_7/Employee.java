package HW_7;

// Задача №2
//
//    Необходимо создать класс HW_7.Employee с полями как у HW_7.Person (из предыдущего задания) и поле зарплата.
//    Класс должен иметь метод isSameName(HW_7.Employee employee) который возвращает true, если у сотрудника у
//    которого был вызван метод и сотрудника который был передан как параметр, одинаковое имя.
public class Employee {

    String name;
    int age;
    String sex;
    int salary;

    boolean isSameName(Employee employee) {
        return name.equals(employee.name);
        }

    public static void main(String[] args) {
        Employee person1 = new Employee();

        person1.name = "Tim";
        person1.age = 30;
        person1.sex = "M";
        person1.salary = 1000;

        Employee person2 = new Employee();

        person2.name = "Lenny";
        person2.age = 35;
        person2.sex = "M";

        Employee person3 = new Employee();

        person3.name = "Penny";
        person3.age = 32;
        person3.sex = "F";

        Employee person4 = new Employee();

        person4.name = "Nora";
        person4.age = 28;
        person4.sex = "j";

        Employee person5 = new Employee();

        person5.name = "Tim";
        person5.age = 25;
        person5.sex = "f";

        System.out.println(person1.isSameName(person2));
        System.out.println(person1.isSameName(person5));
    }
}
