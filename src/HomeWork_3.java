public class HomeWork_3 {
//    public static void main(String[] args) {
//        int a = 10;
//        int b = 5;
//
//        if (a == b) {
//            System.out.println("a==b");
//        } else if (a < b) {
//                System.out.println("a < b");
//        } else {
//               // единственный оставшийся вариант a>b
//                System.out.println("a > b");
//            }
//    }

//    public static void main (String[] args) {
//        int a = 10;
//        int b = 4;
//
//        if ((a + b) % 2 == 0) {
//            System.out.println("maybe a and b are even");
//        } else {
//            System.out.println("some variable is odd");
//        }
//    }

    public static void main(String[] args) {
        int a = 41;

        if (a > 10) {
            System.out.println("больше 10");
        }
        if (a < 100) {
            System.out.println("меньше 100");
        }
        if (a * 1.0 / 2 > 20) {
            // в случае, если переменная нечетная, то нужно умножение одного из операндов на дробное число, чтобы при делении не исказился результат
            System.out.println("результат деления на 2 больше 20");
        }
        if (a >= 5 && a <= 40) {

            System.out.println("значение переменной между 5 и 40 включительно");
        } else {
            System.out.println("значение переменной меньше 5 или больше 40");
        }
    }
}

