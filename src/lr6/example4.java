package lr6;

public class example4 {

    public static void main(String[] args) {
        DoubleFactorial f = new DoubleFactorial();
        int fact = f.fact(4);
        System.out.println("Factoral ="+fact);
    }
}
class DoubleFactorial {
    int fact(int n) {
        int result;
        if (n == 1) return 1;
        result = fact(n - 1) * n;
        return result;
    }

}


