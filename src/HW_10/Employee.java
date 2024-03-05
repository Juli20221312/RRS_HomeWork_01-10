package HW_10;
//Задача №1
//
//Необходимо создать класс Employee со следующими методами:
//●	getBaseSalary - получить базовую ставку
//●	setBaseSalary
//●	getName - получить имя
//●	setName
//●	getSalary - получить зарплату
//
//

public class Employee {
    private double baseSalary;
    private String name;
   // private double salary; в разборе домашки не делали это поле

    public double getBaseSalary() {
        return baseSalary;
    }

    public void setBaseSalary(double baseSalary) {
        this.baseSalary = baseSalary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalary() {
        return getBaseSalary();
    }


}
