import java.util.Scanner;

public class SumOfConsecutiveEvenNumbers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int numberX, sum;
        numberX = input.nextInt();

        while(numberX != 0){

            sum = 0;

            for(int even = 1; even <= 5; numberX++){
                if(numberX % 2 == 0){
                    sum += numberX;
                    even++;
                }
            }
            System.out.println(sum);
            numberX = input.nextInt();
        }



    }
}
