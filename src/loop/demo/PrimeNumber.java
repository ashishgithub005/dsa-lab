package loop.demo;

import java.util.Scanner;

public class PrimeNumber {
    static void main(String[] args) {
        //if number divisible by 2 to n-1 then is not a prime number
        //if number n < 2 then also not a prime number
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number n : ");
        int n = sc.nextInt();
        if(n <= 2){
            System.out.println("Not a Prime Number");
            return;
        }
        for(int i=2;i < n;i++){
            if(n % i == 0){
                System.out.println(n + " is not a prime number");
                return;
            }
        }

        System.out.println(n+" is a Prime Number");
    }
}
