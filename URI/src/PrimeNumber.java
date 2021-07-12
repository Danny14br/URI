import java.util.Scanner;

public class PrimeNumber {
    public static boolean IsPrime(int number){
        return Divisors(number) == 2;
    }

    public static int Divisors(int i){
        int countDivisors = 0;
        for(int j = 1; j <= i; j++){
            if(i % j == 0)
                countDivisors++;
        }
        return countDivisors;
    }
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int numberTests, number;

        numberTests = input.nextInt();

        for(int i = 0; i < numberTests; i++){
            number = input.nextInt();

            if(IsPrime(number))
                System.out.println(number + " eh primo");
            else
                System.out.println(number + " nao eh primo");
        }

    }
}
