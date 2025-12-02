package loop.demo;

public class ReverseDigit {
    static void main(String[] args) {
        int n = 1234;
        int res = reverseDigit(n);
        System.out.println(res);
    }

    private static int reverseDigit(int n) {
        int rev = 0;
        while(n != 0){
            int lastDigit = n % 10;
            rev = rev * 10 + lastDigit;
            n = n / 10;
        }

        return rev;
    }
}
