package lr3;

import java.util.Scanner;
public class example1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Введите целое число в диапазоне от 1 до 7");
        int number = in.nextInt();
        switch(number){
            case 1:{
                System.out.println("Число " + number + " Понедельник");
                break;
            }
            case 2:{
                System.out.println("Число " + number + "  Вторник");
                break;
            }
            case 3:{
                System.out.println("Число " + number + "  Среда");
                break;
            }
            case 4:{
                System.out.println("Число " + number + "  Четверг");
                break;
            }
            case 5:{
                System.out.println("Число " + number + "  Пятница");
                break;
            }
            case 6:{
                System.out.println("Число " + number + "  Суббота");
                break;
            }
            case 7:{
                System.out.println("Число " + number + " Воскресение");
                break;
            }
            default:{
                System.out.println("Введено некорректное значение");
                break;
            }
        }
    }
}

