package lr5;

import java.util.Scanner;

public class example2 {
    public static void main(String[] args) {
        Example_2 myexample = new Example_2();

        myexample.Setch('A', 'Z');

        myexample.showCharArray();
    }
}

class Example_2 {
    private char ch1;
    private char ch2;

    public void Setch(char ch1, char ch2) {
        this.ch1 = ch1;
        this.ch2 = ch2;
    }

    public void showCharArray() {


        int int1 = ch1;
        int int2 = ch2;
        if (ch1>ch2) {
            int1 = ch2;
            int2 = ch1;
        }
        int schet = 1;
        for (int i = int1; i<=int2; i++) {
            System.out.println(schet + " symbol = " + (char) i);
            schet++;
        }
    }

}
