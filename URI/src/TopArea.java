import java.util.Scanner;

public class TopArea {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double[][] mArray = new double[12][12];
        double sum;
        int k, count;
        k = 2;
        count = 0;
        String operation;

        sum = 0;
        operation = input.next();

        for(int i = 0; i < 12; i++){
            for(int j = 0; j < 12; j++){
                mArray[i][j] = input.nextDouble();
                if((i <= 4) && (j > i) && (j <= 12-k)){
                    sum += mArray[i][j];
                    count++;
                }
            }
             k++;
        }
        if(operation.equals("S"))
            System.out.printf("%.1f%n",sum);
        else
            System.out.printf("%.1f%n",sum/count);
    }
}
