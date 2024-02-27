package HW_1_2;

public class Fourth {
//    Задача №1
//
//    Необходимо создать целочисленные переменные a и b, присвоить произвольные значения переменным на ваш выбор и вывести результаты следующих операций с этими переменными:
//            ●	сложение;
//●	умножение;
//●	вычитание;
//●	деление;
//●	остаток от деления.
//    Так же сделать проверку на четность этих переменных и вывести результат.

    public static void main(String[] args) {
        int x = 5;
        int y = 15;

        int z = x+y;
        int c = x*y;
        int v = y-x;
        double d = (1.0 * z / c);
        double b = z/c;

        System.out.println(z);
        System.out.println(c);
        System.out.println(v);
        System.out.println(d);
        System.out.println(b);
        System.out.println(z % c);
        System.out.println(v % 2); //четное/нечетное
        System.out.println(y % 2);


    }
}
