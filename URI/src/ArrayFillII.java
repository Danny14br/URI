import java.util.Scanner;

public class ArrayFillII {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int number, j;
        int[] numberArray = new int[1000];
        number = input.nextInt();
        j = 0;
        for(int i = 0; i < 1000; i ++, j++){
            if (j == number)
                j = 0;

            numberArray[i] = j;

        }

        for(int k = 0; k < 1000; k++)
            System.out.println("N["+k+"] = " + numberArray[k]);


    }
}
