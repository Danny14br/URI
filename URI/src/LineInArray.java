import java.util.Scanner;

public class LineInArray {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double[][] mArray = new double[12][12];
        double sum;
        int line;
        String operation;

        sum = 0;

        line = input.nextInt();
        operation = input.next();

        for(int i = 0; i < 12; i++){
            for(int j = 0; j < 12; j++){
                mArray[i][j] = input.nextDouble();
                if(i == line){
                    sum += mArray[i][j];
                }
            }
        }

        if(operation.equals("S"))
            System.out.printf("%.1f%n",sum);
        else
            System.out.printf("%.1f%n",sum/12);
    }
}
