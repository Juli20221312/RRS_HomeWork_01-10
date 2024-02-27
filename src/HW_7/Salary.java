package HW_7;
//    Задача №3
//
//    Необходимо создать класс Salary с единственным методом - getSum(HW_7.Employee[] employeeArray),
//    метод должен возвращать сумму зарплат всех сотрудников из массива переданного в качестве аргумента
//    вызова метода.


public class Salary {
    static int getSum(Employee[] employeeArray){
        int sumSalary = 0;
        for (int i = 0; i < employeeArray.length; i++) {
            sumSalary = employeeArray[i].salary+sumSalary;
        }
        return sumSalary;
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
        person2.salary = 1200;

        Employee person3 = new Employee();

        person3.name = "Penny";
        person3.age = 32;
        person3.sex = "F";
        person3.salary = 1050;

        Employee person4 = new Employee();

        person4.name = "Nora";
        person4.age = 28;
        person4.sex = "j";
        person4.salary = 2000;

        Employee person5 = new Employee();

        person5.name = "Tim";
        person5.age = 25;
        person5.sex = "f";
        person5.salary = 1500;


        Employee[] employeeArray = {person1, person2, person3, person4,person5};
        System.out.println(Salary.getSum(employeeArray));
    }
}
