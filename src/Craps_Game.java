import java.util.Scanner;
import java.util.Random;
public class Craps_Game
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        Random rng = new Random();
        boolean done = false;
        String continueYN;

        do
        {
            boolean readyRoll = false;
            String startRoll;
            do {
                System.out.print("Welcome to craps, press [R] to roll: ");
                if (in.hasNextLine())
                {
                    startRoll = in.nextLine().trim();
                    readyRoll = startRoll.equalsIgnoreCase("r");
                }
            }
            while (!readyRoll);

            int die1 = rng.nextInt(6)+1;
            int die2 = rng.nextInt(6)+1;
            int roll = die1 + die2;

            if(roll == 2 || roll ==3 || roll == 12)
            {
                System.out.println("Role: " + roll + " You crapped out. YOU LOSE");
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
                System.out.println("Role: " +roll + " You rolled a natural. YOU WIN");
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
            else
            {
                System.out.println("Role: " + roll + " You're rolling for point.");
                boolean pointDone = false;
                do
                {
                    boolean pointRoll = false;
                    String pointResponse;
                    do
                    {
                        System.out.print("Press [R] to roll: ");
                        if (in.hasNextLine())
                        {
                            pointResponse = in.nextLine().trim();
                            pointRoll = pointResponse.equalsIgnoreCase("r");
                        }
                    }
                    while(!pointRoll);

                    die1 = rng.nextInt(6) + 1;
                    die2 = rng.nextInt(6) + 1;
                    int point = die1 + die2;
                    if(roll == point)
                    {
                        System.out.println("Role: " + point + " You made point. YOU WIN.");
                        pointDone =true;
                    }
                    else if(point == 7)
                    {
                        System.out.println("Role: " + point + " You sevened out. YOU LOSE.");
                        pointDone = true;
                    }
                    else
                    {
                        System.out.println("Role: " + point + " trying for point: " + roll);
                    }
                }
                while(!pointDone);
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