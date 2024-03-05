package HW_9;
//Задача №3
//
//Необходимо создать класс Manager с полями: имя, возраст, пол, ЗП в день и количество подчиненных.
// Все поля сделать приватными и для каждого поля добавить методы set и get.
// Класс должен иметь метод - getSalary(Month[] monthArray), метод возвращает зарплату за те месяцы которые были переданы в качестве аргумента.
//К рассчитанной ЗП должно прибавляться по 1% за каждого подчиненного.
public class Manager {

    private String name;
    private int age;
    private char sex;
    private double daySalary;
    private int amountSub;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public char getSex() {
        return sex;
    }

    public void setSex(char sex) {
        this.sex = sex;
    }

    public double getDaySalary() {
        return daySalary;
    }

    public void setDaySalary(double daySalary) {
        this.daySalary = daySalary;
    }

    public int getAmountSub() {
        return amountSub;
    }

    public void setAmountSub(int amountSub) {
        this.amountSub = amountSub;
    }


    public double getSalary(Month[] monthArray) {
        double sum = 0;

        for (int i = 0; i < monthArray.length; i++) {
            sum = sum + monthArray[i].getAmountWorkDays()* daySalary;
        }
        return sum*(1+0.01*amountSub);
    }
}
