package lr1;

import java.util.Scanner;

public class ex13 {
    public static void main( String[] args ) {
        int a, b, c ;
        Scanner sum = new Scanner( System.in );
        System.out.println( "Введите первое число: ");
        a = sum.nextInt();
        System.out.println( "Введите второе число: ");
        b = sum.nextInt();
        c = a + b;
        System.out.println( "Сумма равна: " + c );
    }

}
