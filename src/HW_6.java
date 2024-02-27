import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import static java.lang.Long.sum;


//public class HW_6 {
//    public static void main(String[] args) {


//    + Задача №1
//
//    Дана строка:
//    String s = “Перестановочный алгоритм быстрого действия”;
//    необходимо вывести все буквы “о” из этой строки.
//    Для указанной строки ответ будет “ооооо” (или в столбик)

//        String s = "Перестановочный алгоритм быстрого действия";
//
//        for (int i = 0; i < s.length(); i++) {
//            if (s.charAt(i) == 'о') {
//                System.out.println(s.charAt(i));
//            }
//        }


//   + Задача №2
//
//    Дана строка:
//    String s = “Перевыборы выбранного президента”;
//    необходимо подсчитать количество букв “е” в строке.
//    Для указанной строки ответ будет 4.

//        вариант 1
//
//        String s = "Перевыборы выбранного президента";
//        int count = 0;
//        for (int i = 0; i < s.length(); i++) {
//            if (s.charAt(i) == 'е') {
//                count++;
//            }
//        }

//        вариант 2
//        Matcher matcher = Pattern.compile(String.valueOf('е'))
//                .matcher(s);
//        while (matcher.find()) {
//            count++;
//        }
//        System.out.println(count);


//    Задача №3
//
//    Дан массив:
//    String[][] array = {{“Привет”, “всем”, “кто”}, {“изучает”, “язык”, “программирования”}, {“java”}};
//        необходимо подсчитать количество строк в массиве, которые не содержат буквы “е”.

//        String[][] array = {{"Привет", "всем", "кто"}, {"изучает", "язык", "программирования"}, {"java"}};
//        int count = 0;
//
//        for (int i = 0; i < array.length; i++) {
//            for (int j = 0; j < array[i].length; j++) {
//                if (!array[i][j].contains("е")) {
//                    count++;
//                }
//            }
//        }
//        System.out.println(count);

//        Экстра задача
//
//        Дана строка:
//        String s = “Посмотрите как Рите нравится ритм”;
//        необходимо вывести индексы начала всех подстрок - “рит”, независимо от регистра.
//        Для указанной строки ответ будет 6, 15, 29.

//        String s = "Посмотрите как Рите нравится ритм";
//        s = s.toLowerCase(Locale.ROOT); // переводим строку в нижний регистр
//
//        for (int i = 0; i <= s.length() - 3 ; i++) { // length-3 - чтобы не выйти за границы строки
//            String subStr = s.substring(i, i+3); // проверяет есть ли начиная с i-того символа +3
//            if (subStr.equals("рит")) {          // буквы "рит"
//                System.out.println(i);
//            }
//        }
// второй вариант, чтобы избавиться от конкретных цифр в коде:

//        String s = "Посмотрите как Рите нравится ритм";
//        s = s.toLowerCase(Locale.ROOT);
//
//        String subStr = "ритм"; // сохраняем искомое сочетание в переменную
//
//        for (int i = 0; i <= s.length() - subStr.length() ; i++) {
//            String temp = s.substring(i, i+subStr.length());
//            if (temp.equals(subStr)) {  // если использовать вместо equals - equalsIgnoreCase, то можно не переводить строку в нижний регистр
//                System.out.println(i);
//            }
//        }

// третий вариант
//        String s = "Посмотрите как Рите нравится ритм";
//        s = s.toLowerCase(Locale.ROOT);
//
//        int index = s.indexOf("рит");
//        while (index != -1) {
//            System.out.println(index);
//            index = s.indexOf("рит", index +1);
//        }


public class HW_6 {
    public static void main(String[] args) {

//        sumTwoNumbers(5, 6);
//        System.out.println(subtractTwoNumbers(6, 3));
//        increaseTwoNumbers(5, 9);
//        divTwoNumbers(10, 3);
//
//    }

////        Задача №1
////
////        Необходимо написать 4 метода:
////●	сложение 2х чисел
//
//    public static void sumTwoNumbers(int x, int y) {
//        int c = x + y;
//        System.out.println(c);
//    }
//
////● вычитание 2х чисел
//
//    public static int subtractTwoNumbers(int x, int y) {
//        return x - y;
//    }
//
//    //●	умножение 2х чисел
//    public static void increaseTwoNumbers(int x, int y) {
//        int c = x * y;
//        System.out.println(c);
//    }
//
//    //●	деление 2х чисел
//    public static void divTwoNumbers(double x, int y) {
//        double c = x / y;
//        System.out.println(c);
//    }

//        https://www.codewars.com/kata/53ee5429ba190077850011d4/train/java
//    public static int doubleInteger(int i) {
//        return i*2;

        //        https://www.codewars.com/kata/555086d53eac039a2a000083/train/java
//        1 вариант
//        public static boolean isLove(final int flower1, final int flower2) {  //main надо тоже закомментировать
//            return (flower1+flower2)%2!=0;
//        }
//        2 вариант
//    public static boolean isLove(final int flower1, final int flower2) {
//        return flower1 % 2 != flower2 % 2;
//    }


//        https://www.codewars.com/kata/5265326f5fda8eb1160004c8/train/java
//       1 вариант
//        public static String numberToString(int num) {
//            String str = String.valueOf (num);
//            return str;
//        }
//        2 вариант (простой, 1 правильнее)
//        public static String numberToString(int num){
//            return "" + num;
//        }
//        3 вариант
//        IntegerToString


//        https://www.codewars.com/kata/55a2d7ebe362935a210000b2/train/java
//        public static int findSmallestInt(int[] args) {
//            int min = Integer.MAX_VALUE;
//            for (int i = 0; i < args.length; i++) {
//                if (args[i]< min) {
//                    min = args[i];
//                }
//            }
//            return min;
//        }


//        https://www.codewars.com/kata/5b077ebdaf15be5c7f000077/train/java

//        public static String countingSheep(int num) {
//            String result = "";
//            for (int i = 1; i <= num; i++) {
//                result = result + i + " sheep...";
//            }
//            return result;
//        }

    }

 }

