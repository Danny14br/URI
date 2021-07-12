import java.util.Scanner;

public class ArraySelectionI {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        float[] numbers = new float[4];

        for(int i = 0; i < 4; i ++)
            numbers[i] = input.nextFloat();

        for(int i = 0; i < 4; i ++){
            if(numbers[i] <= 10)
                System.out.println(String.format("A[%d] = %.1f", i, numbers[i]));
        }
    }
}
