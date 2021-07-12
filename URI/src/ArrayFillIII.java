import java.util.Scanner;

public class ArrayFillIII {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double x;
        double[] n = new double[100];
        x = input.nextDouble();

        for(int i = 0; i < 100; i++){
            n[i] = x;
            x = x / 2;
        }

        for(int j = 0; j < 100; j ++)
            System.out.printf("N[%d] = %.4f%n", j, n[j]);


    }
}
