package loop.demo;

public class CountDigitInNumber {
    static void main(String[] args) {
        int n = 1234;
        int res = countDigit(n);
        System.out.println(res);
    }

    private static int countDigit(int n) {
        int count =0;
        while(n > 0){
            int div = n % 10;
            count++;
            n = n / 10;
        }

        return count;
    }
}
