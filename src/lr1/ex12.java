package lr1;

import java.util.Calendar;
import java.util.Scanner;

public class ex12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        {
            System.out.println("Введите возраст");
        }
        int yearsold = scanner.nextInt();

        int yearsOld = Calendar.getInstance().get(Calendar.YEAR  )  - yearsold;
        System.out.print(yearsOld + " год");
        scanner.close();
    }
}
