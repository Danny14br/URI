import java.util.Scanner;

public class Bazinga {
    //This problem is 5% wrong :(
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int numberOfTests, k;
        numberOfTests = input.nextInt();
        String[] gameWords = new String[2];

        for(int i = 1; i <= numberOfTests; i++){
            gameWords[0] = "";
            gameWords[1] = "";
            String gameText = input.nextLine();
            k = 0;

            for (int j = 0; j < gameText.length(); j++){
                if(Character.isLetter(gameText.charAt(j))){
                    gameWords[k]+=gameText.charAt(j);
                }else{ if(!gameWords[0].equals(""))
                    k = 1;
                }
            }



            if (gameWords[0].equals("Spock") && gameWords[1].equals("Spock"))
                System.out.println("Caso #" + i + ": De novo!");
            else {
                if ((gameWords[0].equals("tesoura")) && (gameWords[1].equals("papel") || gameWords[1].equals("lagarto")))
                    System.out.println("Caso #" + i + ": Bazinga!");
                else if ((gameWords[0].equals("papel")) && (gameWords[1].equals("pedra") || gameWords[1].equals("Spock")))
                    System.out.println("Caso #" + i + ": Bazinga!");
                else if ((gameWords[0].equals("pedra")) && (gameWords[1].equals("lagarto") || gameWords[1].equals("tesoura")))
                    System.out.println("Caso #" + i + ": Bazinga!");
                else if ((gameWords[0].equals("lagarto")) && (gameWords[1].equals("Spock") || gameWords[1].equals("papel")))
                    System.out.println("Caso #" + i + ": Bazinga!");
                else if ((gameWords[0].equals("Spock")) && (gameWords[1].equals("tesoura") || gameWords[1].equals("pedra")))
                    System.out.println("Caso #" + i + ": Bazinga!");
                else
                    System.out.println("Caso #" + i + ": Raj trapaceou!");
            }

        }

    }
}

