public class SSequenceII {
    public static void main(String[] args) {
        double i, j, sum;
        sum = 0;
        i = 3;
        j = 2;

        sum += 1.0;
        while(i <= 39){
            sum += i/j;
            i += 2.0;
            j *= 2.0;
        }

        System.out.printf("%.2f\n", sum);
    }
}
