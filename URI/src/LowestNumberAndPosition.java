import java.util.Scanner;

public class LowestNumberAndPosition {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int x, lowestNumber, number, position;
        x = input.nextInt();
        number = input.nextInt();
        lowestNumber = number;
        position = 0;

        int[] numbers = new int[x];
        numbers[0] = number;
        for(int i = 1; i < x ; i++){
            number = input.nextInt();
            numbers[i] = number;
            if(lowestNumber > numbers[i]){
                lowestNumber = numbers[i];
                position = i;
            }
        }
        System.out.println("Menor valor: " + lowestNumber);
        System.out.println("Posicao: " + position);

    }
}
