import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
//        task1();
//        task2();
//        task3();
//        task4();
//        task5();
//        task6();
        task7();
    }

    //Задание1
    //Напишите шаблонный метод, который возвращает
    //максимум из трёх переданных параметров.
    public static void task1() {
        System.out.println(maxFromThreeNumber(1, 2, 3));

    }
    public static int maxFromThreeNumber(int n1, int n2, int n3) {
        int result;
        if (n1 > n2) {
            result = n1;
        } else {
            result = n2;
        }
        if (result < n3) {
            result = n3;
        }
        return result;
    }


    //Задание2
    //Напишите шаблонный метод, который возвращает
    //минимум из пяти переданных параметров.
    public static void task2(){
        System.out.println(minFromFiveNumbers(1,2,3,4,5));
    }

    public static int minFromFiveNumbers(int n1, int n2, int n3, int n4, int n5){
        int[] array = new int[]{n1, n2, n3, n4, n5};
        Arrays.sort(array);
        return array[0];
    }

    //Задание 3
    //Напишите шаблонный метод для поиска среднеариф-
    //метического значения в массиве.
    public static void task3(){
        int[] arr = new int[]{1,2,3,4,5};
        System.out.println(avg(arr));
    }
    public static float avg(int[] arr){
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        return (float) sum / arr.length;
    }

    //Задание 4
    //Реализуйте шаблонный метод для поиска максимума
    //в массиве.
    public static void task4(){
        int[] arr = new int[]{1,2,3,4,5};
        System.out.println(maxFromArray(arr));
    }
    public static int maxFromArray(int[] arr){
        Arrays.sort(arr);
        return arr[arr.length-1];
    }

    //Задание 5
    //Реализуйте шаблонный метод для поиска минимума
    //в массиве.
    public static void task5(){
        int[] arr = new int[]{1,2,3,4,5};
        System.out.println(minFromArray(arr));
    }
    public static int minFromArray(int[] arr){
        Arrays.sort(arr);
        return arr[0];
    }

    //Задание 6
    //Реализуйте шаблонный метод для сортировки массива.
    public static void task6(){
        int[] arr = new int[]{4,5,3,1,2};
        sort(arr);
        System.out.println(Arrays.toString(arr));
    }
    public static void sort(int[] arr){
        int count = arr.length-1;
       boolean swapped;

       do{
           swapped = false;
           for (int i = 1; i < count; i++) {
              if(arr[i-1] > arr[i]){
                  int temp = arr[i];
                  arr[i-1] = arr[i];
                  arr[i] = temp;
                  swapped = true;
              }
           }
           count--;
       } while (swapped);
    }

    //Задание 7
    //Реализуйте шаблонный метод для двоичного поиска
    //в массиве.
    public static void task7(){
        int[] arr = new int[]{4,5,3,1,2};
        System.out.println(binarySearch(arr, 5));
        System.out.println(binarySearch(arr, 8));
    }
    public static int binarySearch(int[] arr, int valueToFind){
        Arrays.sort(arr);
        int low = 0;
        int high = arr.length - 1;
        int index = -1;

        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (arr[mid] < valueToFind) {
                low = mid + 1;
            } else if (arr[mid] > valueToFind) {
                high = mid - 1;
            } else if (arr[mid] == valueToFind) {
                index = mid;
                break;
            }
        }
        return index;
    }
}
