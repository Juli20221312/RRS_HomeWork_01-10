package HW_7;

//    Задача №1
//
//    Необходимо создать класс HW_7.Person с полями: имя, возраст, пол. Класс должен иметь метод - getName,
//    метод возвращает имя с префиксом “Mr. ” если пол указан как мужской и префикс “Mrs. ” если женский.
public class Person {

    String name;
    int age;
    String sex;

    String getName() {
        String prefics = "";
        if (sex.equals("M") || sex.equals("m")) {
            prefics = "Mr ";
        } else if (sex.equals("F") || sex.equals("f")) {
            prefics = "Mrs. ";
        }
     return prefics + name;
    }

    public static void main(String[] args) {
        Person person1 = new Person();

        person1.name = "Tim";
        person1.age = 30;
        person1.sex = "M";

        Person person2 = new Person();

        person2.name = "Lenny";
        person2.age = 35;
        person2.sex = "M";

        Person person3 = new Person();

        person3.name = "Penny";
        person3.age = 32;
        person3.sex = "F";

        Person person4 = new Person();

        person4.name = "Nora";
        person4.age = 28;
        person4.sex = "j";

        Person person5 = new Person();

        person5.name = "Tanja";
        person5.age = 25;
        person5.sex = "f";

        System.out.println(person1.getName());
        System.out.println(person2.getName());
        System.out.println(person3.getName());
        System.out.println(person4.getName());
        System.out.println(person5.getName());

    }
}












