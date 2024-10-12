import java.util.Scanner;
import java.util.Random;
public class Craps_Game
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        Random rng = new Random();
        boolean done = false;
        String continueYN = "";

        do
        {
            String readyRollYN = "";
            boolean readyRoll = false;
            do {
                System.out.print("Welcome to craps ready to roll? [Y/N]: ");
                if (in.hasNextLine())
                {
                    readyRollYN = in.nextLine().trim();
                    readyRoll = readyRollYN.equalsIgnoreCase("Y");
                }
            } while (!readyRoll && in.hasNextLine());

            int die1 = rng.nextInt(6)+1;
            int die2 = rng.nextInt(6)+1;
            int roll = die1 + die2;

            if(roll == 2 || roll ==3 || roll == 12)
            {
                System.out.println(roll + " You crapped out. YOU LOSE");
                System.out.print("Play again? [Y/N]: "); // end loop
                if(in.hasNextLine())
                {
                    continueYN = in.nextLine();
                    if(continueYN.equalsIgnoreCase("N"))
                    {
                        done = true;
                    }
                }
            }
            else if(roll == 7 || roll == 11)
            {
                System.out.println(roll + " You rolled a natural. YOU WIN");
                System.out.print("Play again? [Y/N]: "); // end loop
                if(in.hasNextLine())
                {
                    continueYN = in.nextLine();
                    if(continueYN.equalsIgnoreCase("N"))
                    {
                        done = true;
                    }
                }
            }
        }
        while(!done);
    }
}