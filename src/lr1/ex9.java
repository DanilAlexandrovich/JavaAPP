package lr1;

import java.util.Scanner;

public class ex9 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите номер месяца");

        int month = in.nextInt();
        if (month == 1){
            System.out.println("Январь 31 день");

        }
        else if (month == 2){
            System.out.println("Февраль 28 дней");
        }
        else if (month == 3){
            System.out.println("Март 31 день");
        }
        else if (month == 4){
            System.out.println("Апрель 30 дней");
        }
        else if (month == 5){
            System.out.println("Май 31 день");
        }
        else if (month == 6){
            System.out.println("Июнь 30 дней");
        }
        else if (month == 7){
            System.out.println("Июль 31 день");
        }
        else if (month == 8){
            System.out.println("Август 31 день");
        }
        else if (month == 9){
            System.out.println("Сентябрь 30 дней");
        }
        else if (month == 10){
            System.out.println("Октябрь 31 день");
        }
        else if (month == 11){
            System.out.println("Ноябрь 30 дней");
        }
        else if (month == 12) {
            System.out.println("Декабрь 31 день");
        }
        else System.out.println("Такого месяца нет");

        in.close();
    }
}