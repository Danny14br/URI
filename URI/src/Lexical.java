import java.util.Scanner;

public class Lexical {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String wordA, wordB, lowestWord;
        int countLowestSizeWord;
        countLowestSizeWord = 0;

        wordA = input.next();
        wordB = input.next();

        if(wordA.length() > wordB.length())
            lowestWord = wordB;
        else
            lowestWord = wordA;

        for(int i = 0; i < lowestWord.length(); i++){
            if(Character.getNumericValue(wordB.charAt(i)) < Character.getNumericValue(wordA.charAt(i))){
                System.out.println(wordB);
                System.out.println(wordA);
                break;

            }else{
                if(Character.getNumericValue(wordB.charAt(i)) > Character.getNumericValue(wordA.charAt(i))){
                    System.out.println(wordA);
                    System.out.println(wordB);
                    break;
                }else
                    countLowestSizeWord++;
            }
        }
        if(countLowestSizeWord == lowestWord.length()){
            System.out.println(wordB);
            System.out.print(wordA);
        }
    }
}
