import java.util.Scanner;

public class ArrayFillI {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int[] numbers = new int[10];
        int number;

        number = input.nextInt();

        for(int i = 0; i < 10; i ++){
            numbers[i] = number;
            number = number * 2;
        }

        for(int j = 0; j < 10; j++){
            System.out.println("N[" + j + "] = " + numbers[j]);
        }

    }

}
