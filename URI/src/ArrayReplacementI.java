import java.util.Scanner;

public class ArrayReplacementI {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int[] x = new int[10];
        int number;

        for(int i = 0; i < 10; i++){
            number = input.nextInt();
            if(number > 0)
                x[i] = number;
            else
                x[i] = 1;
        }

        for(int i = 0; i < 10; i++){
            System.out.println("x["+ i +"] = "+ x[i]);
        }


    }
}
