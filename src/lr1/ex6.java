package lr1;

import java.util.Scanner;

public class ex6 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Введите фамилию" );
        String familiya = in.nextLine();
        System.out.println("Введите имя" );
        String imya = in.nextLine();
        System.out.println("Введите отчество" );
        String otchestvo = in.nextLine();
        System.out.printf("Привет  %s %s  %s \n", familiya, imya, otchestvo);
        in.close();


    }
}