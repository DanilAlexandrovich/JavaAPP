package lr1;

import java.util.Scanner;

public class ex14 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите число:");
        int num = in.nextInt();
        int num2 = num - 1;
        int num3 = num + 1;
        int num4 = num + num2 + num3;
        int num5 = (int) Math.pow(num4,2);

        System.out.println("Число равно: " + num);
        System.out.println("Число на единицу меньше: " + num2);
        System.out.println("Число на единицу больше: " + num3);
        System.out.println("Квадрат суммы первых чисел: " + num5);
        in.close();

    }
}
