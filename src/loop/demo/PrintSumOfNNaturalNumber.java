package loop.demo;

public class PrintSumOfNNaturalNumber {
    static void main(String[] args) {
        int n = 10;
        usingLoop(n);
        usingFormula(n);
    }

    private static void usingFormula(int n) {
        /*
         *  sum of n natural number == n * (n+1)/2
         */
        int sum = n * (n+1)/2;
        System.out.println("usingFormula : "+sum);
    }

    private static void usingLoop(int n) {
        int sum = 0;
        for(int i = 1; i<= n; i++){
            sum += i;
        }

        System.out.println("usingLoop : "+sum);
    }
}
