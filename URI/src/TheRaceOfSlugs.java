import java.util.Scanner;

public class TheRaceOfSlugs {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int numberSlugs, speedSlugs, level, highestLevel;

        while(input.hasNext()){
            highestLevel = 0;
            numberSlugs = input.nextInt();
            for(int i = 0; i < numberSlugs; i++){
                speedSlugs = input.nextInt();
                if(speedSlugs < 10)
                    level = 1;
                else{
                    if (speedSlugs < 20)
                        level = 2;
                    else
                        level = 3;

                }
                if(level > highestLevel)
                    highestLevel = level;
            }

            System.out.println(highestLevel);


        }

    }

}
