package lr1;

import java.util.Scanner;

public class ex8 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Введите месяц" );
        String month = in.nextLine();

        System.out.println("Введите день недели" );
        String day  = in.nextLine();

        System.out.println("Введите дату" );
        int date = in.nextInt();

        System.out.println("date: " + date);
        System.out.println("month: " + month);
        System.out.println("day: " + day);

        in.close();
    }
}
