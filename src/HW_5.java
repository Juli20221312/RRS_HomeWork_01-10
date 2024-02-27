public class HW_5 {
    public static void main(String[] args) {

//        + Задача №1
//
//        Дан массив:
//        int[] array = {9, 2, 6, 4, 5, 12, 7, 8, 6};
//        необходимо вывести сумму всех значений массива.

//        int[] array = {9, 2, 6, 4, 5, 12, 7, 8, 6};
//        int sum = 0;
//        for (int i = 0; i < array.length; i++) {  //i++ = i=i+1
//            sum += array [i]; // равнозначно sum = sum + arr[i];
//        }
//        System.out.println(sum);


//       + Задача №2
//
//        Дан массив:
//        int[] array = {9, 2, 6, 4, 5, 12, 7, 8, 6};
//        необходимо вывести максимальное значение массива.
//        int[] array = {9, 2, 6, 4, 5, 12, 7, 8, 6};
//        int max = array[0];
//        for (int i = 0; i < array.length; i++) {
//            if (array[i]>max) {
//                max = array[i];
//            }
//        }
//        System.out.println(max);
//
//
//        + Задача №3
//
//        Дан массив:
//        int[] array = {9, 2, 6, 4, 5, 12, 7, 8, 6};
//        необходимо вывести минимальное значение массива.
//        int[] array = {9, 2, 6, 4, 5, 12, 7, 8, 6};
//        int min = array[0];
//        for (int i = 0; i < array.length; i++) {
//            if (array[i] < min) {
//                min = array[i];
//            }
//        }
//        System.out.println(min);
//
//
//      +  Задача №4
//
//        Дан массив:
//        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9};
//        необходимо вывести среднее арифметическое всех значений массива.
//        int[] array = {3, 2, 3, 4, 5, 6, 7, 8, 9};
//        double sum = 0; //тип переменной не int для того, чтобы отображался, в том числе, дробный корректный ответ или можно sum * 1.0 ниже
//        for (int i = 0; i < array.length; i++) {  //i++ = i=i+1
//            sum += array [i];
//        }
//        sum = sum/ array.length;
//        System.out.println(sum);


//
//
//        + Задача №5
//
//        Дан массив:
//        int[][] array = {{1, 2, 3, 4, 5}, {6, 7, 8, 9}, {-1, -2, -3, -4}, {-5, -6}};
//        необходимо вывести сумму элементов массива.
//        int[][] array = {{1, 2, 3, 4, 5}, {6, 7, 8, 9}, {-1, -2, -3, -4}, {-5, -6}};
//        int sum = 0;
//        for (int i = 0; i < array.length; i++) {
//            for (int j = 0; j < array[i].length; j++) {
//                sum += array [i][j];
//            }
//        }
//        System.out.println(sum);
//
//
//        + Задача №6
//
//        Дан массив:
//        int[][] array = {{1, 2, 3, 4, 5}, {6, 7, 8, 9}, {-1, -2, -3, -4}, {-5, -6}};
//        необходимо вывести максимальное значение массива

//        int[][] array = {{1, 2, 3, 4, 5}, {6, 7, 8, 9}, {-1, -2, -3, -4}, {-5, -6}};
//        int max = Integer.MIN_VALUE;
//        for (int i = 0; i < array.length; i++) {
//            for (int j = 0; j < array[i].length; j++) {
//                if (array[i][j] > max) {
//                    max = array[i][j];
//                }
//            }
//        }
//        System.out.println(max);

        // вариант 2
//        int[][] array = {{1, 2, 3, 4, 5}, {6, 7, 8, 9}, {-1, -2, -3, -4}, {-5, -6}};
//
//        int count = 0;
//        for (int i = 0; i < array.length; i++) {
//            count+= array[i].length;
//        }
//        System.out.println(count);


//        Вывести следующие строки с соответствующим форматированием (как пирамиды):

//
//
//        + Задача №1
//
//        0  1  2  3  4  5  6  7  8  9
//        0  1  2  3  4  5  6  7  8
//        0  1  2  3  4  5  6  7
//        0  1  2  3  4  5  6
//        0  1  2  3  4  5
//        0  1  2  3  4
//        0  1  2  3
//        0  1  2
//        0  1
//        0

//        for (int i = 0; i < 10; i++) {
//            for (int j = 0; j < 10 - i; j++) {
//                System.out.print(j + " ");
//            }
//            System.out.println();
//        }

        //или
//        for (int i = 10; i >= 0; i--) {
//            for (int j = 0; j < i; j++) {
//                System.out.print(j + " ");
//            }
//            System.out.println();
//        }


//        Задача №2
//
//        0  1  2  3  4  5  6  7  8  9
//           0  1  2  3  4  5  6  7  8
//              0  1  2  3  4  5  6  7
//                 0  1  2  3  4  5  6
//                    0  1  2  3  4  5
//                       0  1  2  3  4
//                          0  1  2  3
//                             0  1  2
//                                0  1
//                                   0

        for (int i = 10; i >= 0; i--) {
            for (int j = 10; j > i; j--) {
                System.out.print("  ");
            }

            for (int k = 0; k < i; k++) {
                System.out.print(k + " ");
            }
            System.out.println();
        }

//
//
//        Задача №3
//
//        9 8 7 6 5 4 3 2 1 0 1 2 3 4 5 6 7 8 9
//          8 7 6 5 4 3 2 1 0 1 2 3 4 5 6 7 8
//            7 6 5 4 3 2 1 0 1 2 3 4 5 6 7
//              6 5 4 3 2 1 0 1 2 3 4 5 6
//                5 4 3 2 1 0 1 2 3 4 5
//                  4 3 2 1 0 1 2 3 4
//                    3 2 1 0 1 2 3
//                      2 1 0 1 2
//                        1 0 1
//                          0


//        for (int i = 10; i >= 0; i--) {
//            for (int j = 10; j > i; j--) {
//                System.out.print("  ");
//            }
//
//            for (int j = i-1; j > 0; j--) {
//                System.out.print(j + " ");
//            }
//
//
//            for (int j = 0; j < i; j++) {
//                System.out.print(j + " ");
//            }
//            System.out.println();
//
//        }
    }
}


