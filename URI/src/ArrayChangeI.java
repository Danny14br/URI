import java.util.Scanner;

public class ArrayChangeI {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int[] numbers = new int[20];
        int x;
        for(int i = 0; i < 20; i ++)
            numbers[i] = input.nextInt();

        for(int k = 0; k < 10; k++){
            x = numbers[k];
            numbers[k] = numbers[19-k];
            numbers[19-k] = x;
        }

        for(int i = 0; i < 20; i ++)
            System.out.println("N[" + i + "] = "+numbers[i]);

    }
}
