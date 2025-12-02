package loop.demo;

public class AddAllDigitOfNumber {
    static void main(String[] args) {
        int n = 1234;

        int res = digitSum(n);
        System.out.println(res);
    }

    private static int digitSum(int n) {
        int sum = 0;
        while ( n != 0){
            int digit = n % 10;
            sum += digit;
            n /= 10;
        }

        return sum;
    }
}
