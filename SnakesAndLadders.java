import java.util.*;
import java.io.*;
public class SnakesAndLadders
{
    void snakeGame() throws IOException
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("WELCOME TO SNAKES AND LADDERS");
        System.out.println("===================================================================================");
        System.out.println("Press an key to start the game...");
        br.readLine();
        Random r=new Random();
        int player1Index=0;
        int turn1=1;
        System.out.println("your current position is "+player1Index+".");

        System.out.println("\nPlayer 1, press any key to shuffle the die...");
            br.readLine();
            int dThrow=r.nextInt(6);
            if(dThrow==0)
            {
                dThrow++;
            }
            System.out.println("The number on the die is "+dThrow);

     }
public static void main(String[]args) throws IOException
    {
        SnakesAndLadders s=new SnakesAndLadders();
        s.snakeGame();
    }
}






