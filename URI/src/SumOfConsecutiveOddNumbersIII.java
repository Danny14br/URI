import java.util.Scanner;

public class SumOfConsecutiveOddNumbersIII {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number, numberX, numberY, sum;
        number = input.nextInt();

        for(int i = 0; i < number; i++){
            numberX = input.nextInt();
            numberY = input.nextInt();


            if(numberX % 2 == 0)
                numberX = numberX + 1;

            sum = numberX;
            for(int j = 0; j < numberY - 1; j++) {
                numberX = numberX + 2;
                sum += numberX;
            }
            System.out.println(sum);
        }

    }
}

