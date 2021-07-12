import java.util.Scanner;

public class ArraFillIV {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int[] even = {0,0,0,0,0};
        int[] odd = {0,0,0,0,0};
        int number, j, l;
        j =  l = 0;
        for(int k = 0; k < 15; k++){
            number = input.nextInt();
            if(number % 2 == 0){
                if(even[4] != 0) {
                    for (int i = 0; i < 5; i++)
                        System.out.println("par[" + i + "] = " + even[i]);
                    even[4] = 0;
                    j = 0;
                }
                even[j] = number;
                j++;
            }else{
                if(odd[4] != 0) {
                    for (int i = 0; i < 5; i++)
                        System.out.println("impar[" + i + "] = " + odd[i]);
                    odd[4] = 0;
                    l = 0;
                }
                odd[l] = number;
                l++;
            }
        }

        for (int i = 0; i < l; i++)
            System.out.println("impar[" + i + "] = " + odd[i]);

        for (int i = 0; i < j; i++)
            System.out.println("par[" + i + "] = " + even[i]);
    }
}
