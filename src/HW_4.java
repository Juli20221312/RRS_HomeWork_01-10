import java.util.Arrays;

public class HW_4 {
//    public static void main(String[] args) {
//        //1
//        for (int i = 0; i < 16; i = i + 1) {
//            System.out.println(i);
//        }
//        //2
//        for (int i = 5; i < 10000; i = i * 5) {
//            System.out.println(i);
//        }
//      // 3
//        for (int i = 40; i < 61; i++) {
//            if (i % 4 == 0) {
//                System.out.println(i);
//
//            }
//        }
//        for (int i = 40; i < 61 ; i = i+4) {
//            System.out.println(i);
//        }
//    }

    public static void main(String[] args) {
        //Дан массив:
        //int[] array = {9, 2, 6, 4, 5, 12, 7, 8, 6};
        //необходимо вывести все нечетные числа из массива

//        int[] array = {9, 2, 6, 4, 5, 12, 7, 8, 6};
//        for (int i = 0; i < array.length; i= i+1){
//            if (array[i]%2==1) {
//                System.out.println(array[i]);
//            }
//        }
//        Дан массив:
//        int[] array = {9, 2, 6, 4, 5, 12, 7, 8, 6};
//        необходимо вывести все значения массива больше 5.
//        int[] array = {9, 2, 6, 4, 5, 12, 7, 8, 6};
//        for (int i = 0; i < array.length; i= i+1){
//            if (array[i] > 5) {
//                System.out.println(array[i]);
//            }
//        }

//        Дан массив:
//        int[] array = {9, 2, 6, 4, 5, 12, 7, 8, 6};
//        необходимо увеличить все значения массива на 15.
        int[] array = {9, 2, 6, 4, 5, 12, 7, 8, 6};
        for (int i = 0; i < array.length; i = i+1) {
            array[i] = array[i] + 15;
        }
        {
               System.out.println(Arrays.toString(array));
           }
        }
    }

