package loop.demo;

public class Fibbonaccinumber {
    static void main(String[] args) {
       int first = 0;
       int second = 1;
       int n = 5;
       System.out.print(first +" "+second);
       for (int i = 1; i < n; i++) {
           int sum = first + second;
           System.out.print(" "+ sum);
           first = second;
           second = sum;
       }
    }
}
