package lr3;

import java.util.Scanner;

public class example3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите сколько чисел суммировать");
        int x = in.nextInt();
        int[] fibb = new int [x];
        int o = 2;
        fibb[0] = 0;
        fibb[1] = 1;

        while (o < fibb.length) {
            fibb[o] = fibb[o - 1] + fibb[o - 2];
            System.out.println("while" + fibb[o]);
            o++;
        }
        for (int i = 2; i < fibb.length; ++i) {
            fibb[i] = fibb[i - 1] + fibb[i - 2];
        }
        for (int e = 1; e< fibb.length; ++e) {
            System.out.println(" for " + fibb[e]);
        }
    }
}
