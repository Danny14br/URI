import java.util.Scanner;

public class FibonacciArray {


    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int numberTests, number;
        long[] fibonacciArray = new long[61];

        fibonacciArray[0] = 0;
        fibonacciArray[1] = 1;
        for(int i = 2; i <= 60; i++){
            fibonacciArray[i] = fibonacciArray[i-1] + fibonacciArray[i-2];
        }

        numberTests = input.nextInt();


        for(int k = 0; k < numberTests; k++){
            number = input.nextInt();
            System.out.println("Fib(" + number + ") = " + fibonacciArray[number]);
        }

    }
}
