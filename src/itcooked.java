import java.util.Scanner;
public class itcooked
{
    public static void main(String[] args)
    {
        String readyRollYN = "";
        Scanner in = new Scanner(System.in);
        boolean readyRoll = false;
        do
        {
            System.out.print("Welcome to craps ready to roll? [Y/N]: "); // before first roll
            if(in.hasNextLine())
            {
                readyRollYN = in.nextLine().trim();
                readyRoll = readyRollYN.equalsIgnoreCase("Y");
                if(readyRollYN.equalsIgnoreCase("Y"))
                {
                    System.out.println(readyRollYN);
                    readyRoll = true;
                }
            }
        }
        while(!readyRoll);
    }
}
