import java.awt.*;
import java.util.Scanner;
import java.lang.Math;
public class Stepladder {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int sizeOfSequence, gap, countStepladder, difference;
        countStepladder = 0;
        sizeOfSequence = input.nextInt();
        int[] sequence = new int[sizeOfSequence];

        for (int i = 0; i < sizeOfSequence; i++)
            sequence[i] = input.nextInt();

        if (sizeOfSequence > 2) {
            gap = sequence[1] - sequence[0];
            for (int j = 0; j < sizeOfSequence - 1; j++) {
                difference = sequence[j + 1] - sequence[j];
                if (difference != gap) {
                    countStepladder++;
                    gap = difference;
                }
            }
        }
        if (sizeOfSequence <= 2)
            System.out.println(1);
        else
            System.out.println(countStepladder+1);

    }
}
