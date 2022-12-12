package lr3;

import java.util.*;
public class example10  {
    public static void main(String[] args)
    {
        Random random = new Random();
        int numbers[] = new int[10];
        int numbersrev[] = new int[10];

        System.out.print("Изначальный массив: ");
        for (int i = 0; i < 10; i++)
        {
            numbers[i] = random.nextInt(200);
            System.out.print(numbers[i] + " ");
        }
        System.out.println();
        Arrays.sort(numbers);

        System.out.print("Массив в обратном порядке: ");

        for (int i = 0; i < 10; i++)
        {
            numbersrev[i]=numbers[9-i];
            System.out.print(numbersrev[i] + " ");
        }
    }
}

