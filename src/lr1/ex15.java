package lr1;

import java.util.Scanner;

public class ex15 {
    public static void main( String[] args ) {
        int a, b, c, d;
        Scanner sum = new Scanner( System.in );
        System.out.println( "Введите первое число: ");
        a = sum.nextInt();
        System.out.println( "Введите второе число: ");
        b = sum.nextInt();
        c = a + b;
        d = a - b;
        System.out.println( "Сумма значений: " + c );
        System.out.println( "Разница значений: " + d );
    }

}
