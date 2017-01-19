import java.util.Arrays;
import java.util.Random;

/**
 * Created by Belyj on 19.01.2017.
 */
public class TestAlgor1 {
    public static void main(String[] args) {
        // Пункт 1 - массив из случайных чисел
        int[] mass = new int[10];
        formMass(mass);
        // Пункт 2 - поиск минимального и максимального
        search(mass);
        // Пункт 3 - Сортировка массива
        sortMass(mass);
    }

    static void formMass(int[] mass) {
        for (int i = 0; i < mass.length; i++) {
            Random random = new Random();
            mass[i] = random.nextInt();
            System.out.println(mass[i]);
        }
    }

    static void search(int[] mass) {
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < mass.length; i++) {
            if (mass[i] < min) {
                min = mass[i];
            }
            if (mass[i] > max) {
                max = mass[i];
            }
        }
        System.out.println("MIN = " + min);
        System.out.println("MAX = " + max);
    }

    static void sortMass(int[] mass) {
        Arrays.sort(mass);
        for (int i = 0; i < mass.length; i++) {
            System.out.println(mass[i]);
        }
    }
}
