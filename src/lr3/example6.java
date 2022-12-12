package lr3;

import java.util.Random;
import java.util.Scanner;

public class example6 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        Random random = new Random();
        int i = 0, rom = 0;
        System.out.println("Введите размер масива: ");

        int k = in.nextInt();
        if (k <= 0) {
            System.out.println("Введено некоректное значение");
            return;
        }
        int[] arr = new int[k];

        while (i != k) {
            rom = random.nextInt(200);
            if ((rom%5) == 2) {
                arr[i] = rom;
                System.out.println("Элемент массива ["+i+"] = " + arr[i]);
                i++;
            }

        }
    }
}