
import java.util.Scanner;

public class Dice
{

    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        int roll = 0;
        int total = 0;
        String ans = "y";

        while (ans.equals("y")){
            System.out.println("How many dice do you want to roll?");
            int diceNum = sc.nextInt();
            System.out.println("How many sides do these dice have?");
            int sideNum = sc.nextInt();
            System.out.print("You rolled");
            for (int rollNum = 0; rollNum < diceNum; rollNum ++) {
                rollDie(sideNum);
                total = total + roll;
                System.out.println("Total: " + total);
            }
            System.out.println("Roll again? [y/n]");
            ans = sc.next();
            if ("n".equals(ans)) {
                System.out.print("Goodbye");
            }
        }
    }

    public static int rollDie(int s) {
        return (int)(s*Math.random() + 1);

    }

}
