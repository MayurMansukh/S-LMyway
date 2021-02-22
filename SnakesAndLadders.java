import java.util.*;
import java.io.*;
public class SnakesAndLadders {
    public static void snakeGame() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("WELCOME TO SNAKES AND LADDERS");
        System.out.println("===================================================================================");
        System.out.println("Press an key to start the game...");
        br.readLine();
        System.out.println("\nThere are snakes on  17, 54, 62, 64, 87, 93, 95 and 98. Tread with care!");
        System.out.println("\nThere are ladders on 4, 16, 35,and 50 Good Luck!");
        Random r = new Random();
        int player1Index = 0, player2Index = 0;
        int turn1 = 1, turn2 = 1;
        while((player1Index!=100)||(player2Index!=100))
        {
            System.out.println("\nPlayer 1, press any key to shuffle the die...");
            turn1++;
            br.readLine();
            int dThrow=r.nextInt(6);
            if(dThrow==0)
            {
                dThrow++;
            }
            System.out.println("The number on the die is "+dThrow);
            if((player1Index+dThrow)>100)
            {
                System.out.println("You will have to wait for the next turn, you have exceeded 100.");
            }
            else if((player1Index+dThrow)==100)
            {
                System.out.println("Congratulations player 1, you have won the game! Better luck next time, Player 2.");
                break;
            }
            else
            {
                player1Index+=dThrow;
                System.out.println("\nYou have progressed by "+dThrow+" square(s), and your new position is "+player1Index+".");
                System.out.println("\nPress any key to see whether you encountered a snake or a ladder.");
                br.readLine();
                switch(player2Index)
                {
                    case 4  : System.out.println("Awright! You got the ladder on square 4! You play again.");
                        System.out.println("Player 1, press any key to shuffle the die...");
                        turn1++;
                        br.readLine();
                        dThrow=r.nextInt(6);
                        if(dThrow==0)
                        {
                            dThrow++;
                        }
                        System.out.println("The number on the die is "+dThrow);
                        player1Index+=dThrow;
                        System.out.println("You have progressed by "+dThrow+" square(s), and your new position is "+player2Index+".");
                        break;
                    case 16 : System.out.println("Awright! You got the ladder on square 16! You play again");
                        System.out.println("Player 1, press any key to shuffle the die...");
                        turn1++;
                        br.readLine();
                        dThrow=r.nextInt(6);
                        if(dThrow==0)
                        {
                            dThrow++;
                        }
                        System.out.println("The number on the die is "+dThrow);
                        player1Index+=dThrow;
                        System.out.println("You have progressed by "+dThrow+" square(s), and your new position is "+player2Index+".");

                        break;
                    case 17 : System.out.println("Whoops! You were caught by the snake at square 17. You're now down to square 8. :(");
                        player2Index=8;
                        break;
                    case 35 : System.out.println("Awright! You got the ladder at square 35! You play again");
                        System.out.println("Player 1, press any key to shuffle the die...");
                        turn1++;
                        br.readLine();
                        dThrow=r.nextInt(6);
                        if(dThrow==0)
                        {
                            dThrow++;
                        }
                        System.out.println("The number on the die is "+dThrow);
                        player1Index+=dThrow;
                        System.out.println("You have progressed by "+dThrow+" square(s), and your new position is "+player2Index+".");

                        break;
                    case 50 : System.out.println("Awright! You got the ladder at square 50! You play again");
                        System.out.println("Player 1, press any key to shuffle the die...");
                        turn1++;
                        br.readLine();
                        dThrow=r.nextInt(6);
                        if(dThrow==0)
                        {
                            dThrow++;
                        }
                        System.out.println("The number on the die is "+dThrow);
                        player1Index+=dThrow;
                        System.out.println("You have progressed by "+dThrow+" square(s), and your new position is "+player2Index+".");

                        break;
                    case 54 : System.out.println("Whoops! You were caught by the snake at square 54! You're now down to square 28. :(");
                        player2Index=28;
                        break;

                    case 62 : System.out.println("Whoops! You were caught by the snake at square 62! You're now down to square 13. :(");
                        player2Index=13;
                        break;
                    case 64 : System.out.println("Whoops! You were caught by the snake at square 64! You're now down to square 20. :(");
                        player2Index=20;
                        break;

                    case 87 : System.out.println("Whoops! You were caught by the snake at square 87! You're now down to square 75. :(");
                        player2Index=75;
                        break;
                    case 93 : System.out.println("Whoops! You were caught by the snake at square 93! You're now down to square 83. :(");
                        player2Index=83;
                        break;
                    case 95 : System.out.println("Whoops! You were caught by the snake at square 95! You're now down to square 64. :(");
                        player2Index=64;
                        break;
                    case 98 : System.out.println("The higher they fly the harder they fall! You have been caught by the biggest snake in the game and are now down to square 8. Good day sir!");
                        player2Index=8;
                        break;
                    default : System.out.println("No snakes or ladders here.");
                }
                System.out.println();
                System.out.println("\nPlayer 2, press any key to shuffle the die...");
                turn1++;
                br.readLine();
                dThrow=r.nextInt(6);
                if(dThrow==0)
                {
                    dThrow++;
                }
                System.out.println("The number on the die is "+dThrow);
                if((player2Index+dThrow)>100)
                {
                    System.out.println("You will have to wait for the next turn, you have exceeded 100.");
                }
                else if((player2Index+dThrow)==100)
                {
                    System.out.println("Congratulations player 2, you have won the game! Better luck next time, Player 1.");
                    break;
                }
                else
                {
                    player2Index+=dThrow;
                    System.out.println("\nYou have progressed by "+dThrow+" square(s), and your new position is "+player2Index+".");
                    System.out.println("\nPress any key to see whether you encountered a snake or a ladder.");
                    br.readLine();
                    switch(player2Index)
                    {
                        case 4  : System.out.println("Awright! You got the ladder on square 4! You play again.");
                            System.out.println("Player 2, press any key to shuffle the die...");
                            turn1++;
                            br.readLine();
                            dThrow=r.nextInt(6);
                            if(dThrow==0)
                            {
                                dThrow++;
                            }
                            System.out.println("The number on the die is "+dThrow);
                            player2Index+=dThrow;
                            System.out.println("You have progressed by "+dThrow+" square(s), and your new position is "+player2Index+".");
                            break;
                        case 16 : System.out.println("Awright! You got the ladder on square 16! You play again");
                            System.out.println("Player 2, press any key to shuffle the die...");
                            turn1++;
                            br.readLine();
                            dThrow=r.nextInt(6);
                            if(dThrow==0)
                            {
                                dThrow++;
                            }
                            System.out.println("The number on the die is "+dThrow);
                            player2Index+=dThrow;
                            System.out.println("You have progressed by "+dThrow+" square(s), and your new position is "+player2Index+".");

                            break;
                        case 17 : System.out.println("Whoops! You were caught by the snake at square 17. You're now down to square 8. :(");
                            player2Index=8;
                            break;
                        case 35 : System.out.println("Awright! You got the ladder at square 35! You play again");
                            System.out.println("Player 2, press any key to shuffle the die...");
                            turn1++;
                            br.readLine();
                            dThrow=r.nextInt(6);
                            if(dThrow==0)
                            {
                                dThrow++;
                            }
                            System.out.println("The number on the die is "+dThrow);
                            player2Index+=dThrow;
                            System.out.println("You have progressed by "+dThrow+" square(s), and your new position is "+player2Index+".");

                            break;
                        case 50 : System.out.println("Awright! You got the ladder at square 50! You play again");
                            System.out.println("Player 2, press any key to shuffle the die...");
                            turn1++;
                            br.readLine();
                            dThrow=r.nextInt(6);
                            if(dThrow==0)
                            {
                                dThrow++;
                            }
                            System.out.println("The number on the die is "+dThrow);
                            player2Index+=dThrow;
                            System.out.println("You have progressed by "+dThrow+" square(s), and your new position is "+player2Index+".");

                            break;
                        case 54 : System.out.println("Whoops! You were caught by the snake at square 54! You're now down to square 28. :(");
                            player2Index=28;
                            break;

                        case 62 : System.out.println("Whoops! You were caught by the snake at square 62! You're now down to square 13. :(");
                            player2Index=13;
                            break;
                        case 64 : System.out.println("Whoops! You were caught by the snake at square 64! You're now down to square 20. :(");
                            player2Index=20;
                            break;

                        case 87 : System.out.println("Whoops! You were caught by the snake at square 87! You're now down to square 75. :(");
                            player2Index=75;
                            break;
                        case 93 : System.out.println("Whoops! You were caught by the snake at square 93! You're now down to square 83. :(");
                            player2Index=83;
                            break;
                        case 95 : System.out.println("Whoops! You were caught by the snake at square 95! You're now down to square 64. :(");
                            player2Index=64;
                            break;
                        case 98 : System.out.println("The higher they fly the harder they fall! You have been caught by the biggest snake in the game and are now down to square 8. Good day sir!");
                            player2Index=8;
                            break;
                        default : System.out.println("No snakes or ladders here.");
                    }
                }

            }
            turn1++;
            turn2++;
        }

    }
    public static void main(String[]args) throws IOException
    {
        SnakesAndLadders s=new SnakesAndLadders();
        s.snakeGame();
    }
}
import java.util.*;
import java.io.*;
public class SnakesAndLadders {
    public static void snakeGame() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("WELCOME TO SNAKES AND LADDERS");
        System.out.println("===================================================================================");
        System.out.println("Press an key to start the game...");
        br.readLine();
        System.out.println("\nThere are snakes on  17, 54, 62, 64, 87, 93, 95 and 98. Tread with care!");
        System.out.println("\nThere are ladders on 4, 16, 35,and 50 Good Luck!");
        Random r = new Random();
        int player1Index = 0, player2Index = 0;
        int turn1 = 1, turn2 = 1;
        while((player1Index!=100)||(player2Index!=100))
        {
            System.out.println("\nPlayer 1, press any key to shuffle the die...");
            turn1++;
            br.readLine();
            int dThrow=r.nextInt(6);
            if(dThrow==0)
            {
                dThrow++;
            }
            System.out.println("The number on the die is "+dThrow);
            if((player1Index+dThrow)>100)
            {
                System.out.println("You will have to wait for the next turn, you have exceeded 100.");
            }
            else if((player1Index+dThrow)==100)
            {
                System.out.println("Congratulations player 1, you have won the game! Better luck next time, Player 2.");
                break;
            }
            else
            {
                player1Index+=dThrow;
                System.out.println("\nYou have progressed by "+dThrow+" square(s), and your new position is "+player1Index+".");
                System.out.println("\nPress any key to see whether you encountered a snake or a ladder.");
                br.readLine();
                switch(player2Index)
                {
                    case 4  : System.out.println("Awright! You got the ladder on square 4! You play again.");
                        System.out.println("Player 1, press any key to shuffle the die...");
                        turn1++;
                        br.readLine();
                        dThrow=r.nextInt(6);
                        if(dThrow==0)
                        {
                            dThrow++;
                        }
                        System.out.println("The number on the die is "+dThrow);
                        player1Index+=dThrow;
                        System.out.println("You have progressed by "+dThrow+" square(s), and your new position is "+player2Index+".");
                        break;
                    case 16 : System.out.println("Awright! You got the ladder on square 16! You play again");
                        System.out.println("Player 1, press any key to shuffle the die...");
                        turn1++;
                        br.readLine();
                        dThrow=r.nextInt(6);
                        if(dThrow==0)
                        {
                            dThrow++;
                        }
                        System.out.println("The number on the die is "+dThrow);
                        player1Index+=dThrow;
                        System.out.println("You have progressed by "+dThrow+" square(s), and your new position is "+player2Index+".");

                        break;
                    case 17 : System.out.println("Whoops! You were caught by the snake at square 17. You're now down to square 8. :(");
                        player2Index=8;
                        break;
                    case 35 : System.out.println("Awright! You got the ladder at square 35! You play again");
                        System.out.println("Player 1, press any key to shuffle the die...");
                        turn1++;
                        br.readLine();
                        dThrow=r.nextInt(6);
                        if(dThrow==0)
                        {
                            dThrow++;
                        }
                        System.out.println("The number on the die is "+dThrow);
                        player1Index+=dThrow;
                        System.out.println("You have progressed by "+dThrow+" square(s), and your new position is "+player2Index+".");

                        break;
                    case 50 : System.out.println("Awright! You got the ladder at square 50! You play again");
                        System.out.println("Player 1, press any key to shuffle the die...");
                        turn1++;
                        br.readLine();
                        dThrow=r.nextInt(6);
                        if(dThrow==0)
                        {
                            dThrow++;
                        }
                        System.out.println("The number on the die is "+dThrow);
                        player1Index+=dThrow;
                        System.out.println("You have progressed by "+dThrow+" square(s), and your new position is "+player2Index+".");

                        break;
                    case 54 : System.out.println("Whoops! You were caught by the snake at square 54! You're now down to square 28. :(");
                        player2Index=28;
                        break;

                    case 62 : System.out.println("Whoops! You were caught by the snake at square 62! You're now down to square 13. :(");
                        player2Index=13;
                        break;
                    case 64 : System.out.println("Whoops! You were caught by the snake at square 64! You're now down to square 20. :(");
                        player2Index=20;
                        break;

                    case 87 : System.out.println("Whoops! You were caught by the snake at square 87! You're now down to square 75. :(");
                        player2Index=75;
                        break;
                    case 93 : System.out.println("Whoops! You were caught by the snake at square 93! You're now down to square 83. :(");
                        player2Index=83;
                        break;
                    case 95 : System.out.println("Whoops! You were caught by the snake at square 95! You're now down to square 64. :(");
                        player2Index=64;
                        break;
                    case 98 : System.out.println("The higher they fly the harder they fall! You have been caught by the biggest snake in the game and are now down to square 8. Good day sir!");
                        player2Index=8;
                        break;
                    default : System.out.println("No snakes or ladders here.");
                }
                System.out.println();
                System.out.println("\nPlayer 2, press any key to shuffle the die...");
                turn1++;
                br.readLine();
                dThrow=r.nextInt(6);
                if(dThrow==0)
                {
                    dThrow++;
                }
                System.out.println("The number on the die is "+dThrow);
                if((player2Index+dThrow)>100)
                {
                    System.out.println("You will have to wait for the next turn, you have exceeded 100.");
                }
                else if((player2Index+dThrow)==100)
                {
                    System.out.println("Congratulations player 2, you have won the game! Better luck next time, Player 1.");
                    break;
                }
                else
                {
                    player2Index+=dThrow;
                    System.out.println("\nYou have progressed by "+dThrow+" square(s), and your new position is "+player2Index+".");
                    System.out.println("\nPress any key to see whether you encountered a snake or a ladder.");
                    br.readLine();
                    switch(player2Index)
                    {
                        case 4  : System.out.println("Awright! You got the ladder on square 4! You play again.");
                            System.out.println("Player 2, press any key to shuffle the die...");
                            turn1++;
                            br.readLine();
                            dThrow=r.nextInt(6);
                            if(dThrow==0)
                            {
                                dThrow++;
                            }
                            System.out.println("The number on the die is "+dThrow);
                            player2Index+=dThrow;
                            System.out.println("You have progressed by "+dThrow+" square(s), and your new position is "+player2Index+".");
                            break;
                        case 16 : System.out.println("Awright! You got the ladder on square 16! You play again");
                            System.out.println("Player 2, press any key to shuffle the die...");
                            turn1++;
                            br.readLine();
                            dThrow=r.nextInt(6);
                            if(dThrow==0)
                            {
                                dThrow++;
                            }
                            System.out.println("The number on the die is "+dThrow);
                            player2Index+=dThrow;
                            System.out.println("You have progressed by "+dThrow+" square(s), and your new position is "+player2Index+".");

                            break;
                        case 17 : System.out.println("Whoops! You were caught by the snake at square 17. You're now down to square 8. :(");
                            player2Index=8;
                            break;
                        case 35 : System.out.println("Awright! You got the ladder at square 35! You play again");
                            System.out.println("Player 2, press any key to shuffle the die...");
                            turn1++;
                            br.readLine();
                            dThrow=r.nextInt(6);
                            if(dThrow==0)
                            {
                                dThrow++;
                            }
                            System.out.println("The number on the die is "+dThrow);
                            player2Index+=dThrow;
                            System.out.println("You have progressed by "+dThrow+" square(s), and your new position is "+player2Index+".");

                            break;
                        case 50 : System.out.println("Awright! You got the ladder at square 50! You play again");
                            System.out.println("Player 2, press any key to shuffle the die...");
                            turn1++;
                            br.readLine();
                            dThrow=r.nextInt(6);
                            if(dThrow==0)
                            {
                                dThrow++;
                            }
                            System.out.println("The number on the die is "+dThrow);
                            player2Index+=dThrow;
                            System.out.println("You have progressed by "+dThrow+" square(s), and your new position is "+player2Index+".");

                            break;
                        case 54 : System.out.println("Whoops! You were caught by the snake at square 54! You're now down to square 28. :(");
                            player2Index=28;
                            break;

                        case 62 : System.out.println("Whoops! You were caught by the snake at square 62! You're now down to square 13. :(");
                            player2Index=13;
                            break;
                        case 64 : System.out.println("Whoops! You were caught by the snake at square 64! You're now down to square 20. :(");
                            player2Index=20;
                            break;

                        case 87 : System.out.println("Whoops! You were caught by the snake at square 87! You're now down to square 75. :(");
                            player2Index=75;
                            break;
                        case 93 : System.out.println("Whoops! You were caught by the snake at square 93! You're now down to square 83. :(");
                            player2Index=83;
                            break;
                        case 95 : System.out.println("Whoops! You were caught by the snake at square 95! You're now down to square 64. :(");
                            player2Index=64;
                            break;
                        case 98 : System.out.println("The higher they fly the harder they fall! You have been caught by the biggest snake in the game and are now down to square 8. Good day sir!");
                            player2Index=8;
                            break;
                        default : System.out.println("No snakes or ladders here.");
                    }
                }

            }
            turn1++;
            turn2++;
        }

    }
    public static void main(String[]args) throws IOException
    {
        SnakesAndLadders s=new SnakesAndLadders();
        s.snakeGame();
    }
}
import java.util.*;
import java.io.*;
public class SnakesAndLadders {
    public static void snakeGame() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("WELCOME TO SNAKES AND LADDERS");
        System.out.println("===================================================================================");
        System.out.println("Press an key to start the game...");
        br.readLine();
        System.out.println("\nThere are snakes on  17, 54, 62, 64, 87, 93, 95 and 98. Tread with care!");
        System.out.println("\nThere are ladders on 4, 16, 35,and 50 Good Luck!");
        Random r = new Random();
        int player1Index = 0, player2Index = 0;
        int turn1 = 1, turn2 = 1;
        while((player1Index!=100)||(player2Index!=100))
        {
            System.out.println("\nPlayer 1, press any key to shuffle the die...");
            turn1++;
            br.readLine();
            int dThrow=r.nextInt(6);
            if(dThrow==0)
            {
                dThrow++;
            }
            System.out.println("The number on the die is "+dThrow);
            if((player1Index+dThrow)>100)
            {
                System.out.println("You will have to wait for the next turn, you have exceeded 100.");
            }
            else if((player1Index+dThrow)==100)
            {
                System.out.println("Congratulations player 1, you have won the game! Better luck next time, Player 2.");
                break;
            }
            else
            {
                player1Index+=dThrow;
                System.out.println("\nYou have progressed by "+dThrow+" square(s), and your new position is "+player1Index+".");
                System.out.println("\nPress any key to see whether you encountered a snake or a ladder.");
                br.readLine();
                switch(player2Index)
                {
                    case 4  : System.out.println("Awright! You got the ladder on square 4! You play again.");
                        System.out.println("Player 1, press any key to shuffle the die...");
                        turn1++;
                        br.readLine();
                        dThrow=r.nextInt(6);
                        if(dThrow==0)
                        {
                            dThrow++;
                        }
                        System.out.println("The number on the die is "+dThrow);
                        player1Index+=dThrow;
                        System.out.println("You have progressed by "+dThrow+" square(s), and your new position is "+player2Index+".");
                        break;
                    case 16 : System.out.println("Awright! You got the ladder on square 16! You play again");
                        System.out.println("Player 1, press any key to shuffle the die...");
                        turn1++;
                        br.readLine();
                        dThrow=r.nextInt(6);
                        if(dThrow==0)
                        {
                            dThrow++;
                        }
                        System.out.println("The number on the die is "+dThrow);
                        player1Index+=dThrow;
                        System.out.println("You have progressed by "+dThrow+" square(s), and your new position is "+player2Index+".");

                        break;
                    case 17 : System.out.println("Whoops! You were caught by the snake at square 17. You're now down to square 8. :(");
                        player2Index=8;
                        break;
                    case 35 : System.out.println("Awright! You got the ladder at square 35! You play again");
                        System.out.println("Player 1, press any key to shuffle the die...");
                        turn1++;
                        br.readLine();
                        dThrow=r.nextInt(6);
                        if(dThrow==0)
                        {
                            dThrow++;
                        }
                        System.out.println("The number on the die is "+dThrow);
                        player1Index+=dThrow;
                        System.out.println("You have progressed by "+dThrow+" square(s), and your new position is "+player2Index+".");

                        break;
                    case 50 : System.out.println("Awright! You got the ladder at square 50! You play again");
                        System.out.println("Player 1, press any key to shuffle the die...");
                        turn1++;
                        br.readLine();
                        dThrow=r.nextInt(6);
                        if(dThrow==0)
                        {
                            dThrow++;
                        }
                        System.out.println("The number on the die is "+dThrow);
                        player1Index+=dThrow;
                        System.out.println("You have progressed by "+dThrow+" square(s), and your new position is "+player2Index+".");

                        break;
                    case 54 : System.out.println("Whoops! You were caught by the snake at square 54! You're now down to square 28. :(");
                        player2Index=28;
                        break;

                    case 62 : System.out.println("Whoops! You were caught by the snake at square 62! You're now down to square 13. :(");
                        player2Index=13;
                        break;
                    case 64 : System.out.println("Whoops! You were caught by the snake at square 64! You're now down to square 20. :(");
                        player2Index=20;
                        break;

                    case 87 : System.out.println("Whoops! You were caught by the snake at square 87! You're now down to square 75. :(");
                        player2Index=75;
                        break;
                    case 93 : System.out.println("Whoops! You were caught by the snake at square 93! You're now down to square 83. :(");
                        player2Index=83;
                        break;
                    case 95 : System.out.println("Whoops! You were caught by the snake at square 95! You're now down to square 64. :(");
                        player2Index=64;
                        break;
                    case 98 : System.out.println("The higher they fly the harder they fall! You have been caught by the biggest snake in the game and are now down to square 8. Good day sir!");
                        player2Index=8;
                        break;
                    default : System.out.println("No snakes or ladders here.");
                }
                System.out.println();
                System.out.println("\nPlayer 2, press any key to shuffle the die...");
                turn1++;
                br.readLine();
                dThrow=r.nextInt(6);
                if(dThrow==0)
                {
                    dThrow++;
                }
                System.out.println("The number on the die is "+dThrow);
                if((player2Index+dThrow)>100)
                {
                    System.out.println("You will have to wait for the next turn, you have exceeded 100.");
                }
                else if((player2Index+dThrow)==100)
                {
                    System.out.println("Congratulations player 2, you have won the game! Better luck next time, Player 1.");
                    break;
                }
                else
                {
                    player2Index+=dThrow;
                    System.out.println("\nYou have progressed by "+dThrow+" square(s), and your new position is "+player2Index+".");
                    System.out.println("\nPress any key to see whether you encountered a snake or a ladder.");
                    br.readLine();
                    switch(player2Index)
                    {
                        case 4  : System.out.println("Awright! You got the ladder on square 4! You play again.");
                            System.out.println("Player 2, press any key to shuffle the die...");
                            turn1++;
                            br.readLine();
                            dThrow=r.nextInt(6);
                            if(dThrow==0)
                            {
                                dThrow++;
                            }
                            System.out.println("The number on the die is "+dThrow);
                            player2Index+=dThrow;
                            System.out.println("You have progressed by "+dThrow+" square(s), and your new position is "+player2Index+".");
                            break;
                        case 16 : System.out.println("Awright! You got the ladder on square 16! You play again");
                            System.out.println("Player 2, press any key to shuffle the die...");
                            turn1++;
                            br.readLine();
                            dThrow=r.nextInt(6);
                            if(dThrow==0)
                            {
                                dThrow++;
                            }
                            System.out.println("The number on the die is "+dThrow);
                            player2Index+=dThrow;
                            System.out.println("You have progressed by "+dThrow+" square(s), and your new position is "+player2Index+".");

                            break;
                        case 17 : System.out.println("Whoops! You were caught by the snake at square 17. You're now down to square 8. :(");
                            player2Index=8;
                            break;
                        case 35 : System.out.println("Awright! You got the ladder at square 35! You play again");
                            System.out.println("Player 2, press any key to shuffle the die...");
                            turn1++;
                            br.readLine();
                            dThrow=r.nextInt(6);
                            if(dThrow==0)
                            {
                                dThrow++;
                            }
                            System.out.println("The number on the die is "+dThrow);
                            player2Index+=dThrow;
                            System.out.println("You have progressed by "+dThrow+" square(s), and your new position is "+player2Index+".");

                            break;
                        case 50 : System.out.println("Awright! You got the ladder at square 50! You play again");
                            System.out.println("Player 2, press any key to shuffle the die...");
                            turn1++;
                            br.readLine();
                            dThrow=r.nextInt(6);
                            if(dThrow==0)
                            {
                                dThrow++;
                            }
                            System.out.println("The number on the die is "+dThrow);
                            player2Index+=dThrow;
                            System.out.println("You have progressed by "+dThrow+" square(s), and your new position is "+player2Index+".");

                            break;
                        case 54 : System.out.println("Whoops! You were caught by the snake at square 54! You're now down to square 28. :(");
                            player2Index=28;
                            break;

                        case 62 : System.out.println("Whoops! You were caught by the snake at square 62! You're now down to square 13. :(");
                            player2Index=13;
                            break;
                        case 64 : System.out.println("Whoops! You were caught by the snake at square 64! You're now down to square 20. :(");
                            player2Index=20;
                            break;

                        case 87 : System.out.println("Whoops! You were caught by the snake at square 87! You're now down to square 75. :(");
                            player2Index=75;
                            break;
                        case 93 : System.out.println("Whoops! You were caught by the snake at square 93! You're now down to square 83. :(");
                            player2Index=83;
                            break;
                        case 95 : System.out.println("Whoops! You were caught by the snake at square 95! You're now down to square 64. :(");
                            player2Index=64;
                            break;
                        case 98 : System.out.println("The higher they fly the harder they fall! You have been caught by the biggest snake in the game and are now down to square 8. Good day sir!");
                            player2Index=8;
                            break;
                        default : System.out.println("No snakes or ladders here.");
                    }
                }

            }
            turn1++;
            turn2++;
        }

    }
    public static void main(String[]args) throws IOException
    {
        SnakesAndLadders s=new SnakesAndLadders();
        s.snakeGame();
    }
}
import java.util.*;
import java.io.*;
public class SnakesAndLadders {
    public static void snakeGame() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("WELCOME TO SNAKES AND LADDERS");
        System.out.println("===================================================================================");
        System.out.println("Press an key to start the game...");
        br.readLine();
        System.out.println("\nThere are snakes on  17, 54, 62, 64, 87, 93, 95 and 98. Tread with care!");
        System.out.println("\nThere are ladders on 4, 16, 35,and 50 Good Luck!");
        Random r = new Random();
        int player1Index = 0, player2Index = 0;
        int turn1 = 1, turn2 = 1;
        while((player1Index!=100)||(player2Index!=100))
        {
            System.out.println("\nPlayer 1, press any key to shuffle the die...");
            turn1++;
            br.readLine();
            int dThrow=r.nextInt(6);
            if(dThrow==0)
            {
                dThrow++;
            }
            System.out.println("The number on the die is "+dThrow);
            if((player1Index+dThrow)>100)
            {
                System.out.println("You will have to wait for the next turn, you have exceeded 100.");
            }
            else if((player1Index+dThrow)==100)
            {
                System.out.println("Congratulations player 1, you have won the game! Better luck next time, Player 2.");
                break;
            }
            else
            {
                player1Index+=dThrow;
                System.out.println("\nYou have progressed by "+dThrow+" square(s), and your new position is "+player1Index+".");
                System.out.println("\nPress any key to see whether you encountered a snake or a ladder.");
                br.readLine();
                switch(player2Index)
                {
                    case 4  : System.out.println("Awright! You got the ladder on square 4! You play again.");
                        System.out.println("Player 1, press any key to shuffle the die...");
                        turn1++;
                        br.readLine();
                        dThrow=r.nextInt(6);
                        if(dThrow==0)
                        {
                            dThrow++;
                        }
                        System.out.println("The number on the die is "+dThrow);
                        player1Index+=dThrow;
                        System.out.println("You have progressed by "+dThrow+" square(s), and your new position is "+player2Index+".");
                        break;
                    case 16 : System.out.println("Awright! You got the ladder on square 16! You play again");
                        System.out.println("Player 1, press any key to shuffle the die...");
                        turn1++;
                        br.readLine();
                        dThrow=r.nextInt(6);
                        if(dThrow==0)
                        {
                            dThrow++;
                        }
                        System.out.println("The number on the die is "+dThrow);
                        player1Index+=dThrow;
                        System.out.println("You have progressed by "+dThrow+" square(s), and your new position is "+player2Index+".");

                        break;
                    case 17 : System.out.println("Whoops! You were caught by the snake at square 17. You're now down to square 8. :(");
                        player2Index=8;
                        break;
                    case 35 : System.out.println("Awright! You got the ladder at square 35! You play again");
                        System.out.println("Player 1, press any key to shuffle the die...");
                        turn1++;
                        br.readLine();
                        dThrow=r.nextInt(6);
                        if(dThrow==0)
                        {
                            dThrow++;
                        }
                        System.out.println("The number on the die is "+dThrow);
                        player1Index+=dThrow;
                        System.out.println("You have progressed by "+dThrow+" square(s), and your new position is "+player2Index+".");

                        break;
                    case 50 : System.out.println("Awright! You got the ladder at square 50! You play again");
                        System.out.println("Player 1, press any key to shuffle the die...");
                        turn1++;
                        br.readLine();
                        dThrow=r.nextInt(6);
                        if(dThrow==0)
                        {
                            dThrow++;
                        }
                        System.out.println("The number on the die is "+dThrow);
                        player1Index+=dThrow;
                        System.out.println("You have progressed by "+dThrow+" square(s), and your new position is "+player2Index+".");

                        break;
                    case 54 : System.out.println("Whoops! You were caught by the snake at square 54! You're now down to square 28. :(");
                        player2Index=28;
                        break;

                    case 62 : System.out.println("Whoops! You were caught by the snake at square 62! You're now down to square 13. :(");
                        player2Index=13;
                        break;
                    case 64 : System.out.println("Whoops! You were caught by the snake at square 64! You're now down to square 20. :(");
                        player2Index=20;
                        break;

                    case 87 : System.out.println("Whoops! You were caught by the snake at square 87! You're now down to square 75. :(");
                        player2Index=75;
                        break;
                    case 93 : System.out.println("Whoops! You were caught by the snake at square 93! You're now down to square 83. :(");
                        player2Index=83;
                        break;
                    case 95 : System.out.println("Whoops! You were caught by the snake at square 95! You're now down to square 64. :(");
                        player2Index=64;
                        break;
                    case 98 : System.out.println("The higher they fly the harder they fall! You have been caught by the biggest snake in the game and are now down to square 8. Good day sir!");
                        player2Index=8;
                        break;
                    default : System.out.println("No snakes or ladders here.");
                }
                System.out.println();
                System.out.println("\nPlayer 2, press any key to shuffle the die...");
                turn1++;
                br.readLine();
                dThrow=r.nextInt(6);
                if(dThrow==0)
                {
                    dThrow++;
                }
                System.out.println("The number on the die is "+dThrow);
                if((player2Index+dThrow)>100)
                {
                    System.out.println("You will have to wait for the next turn, you have exceeded 100.");
                }
                else if((player2Index+dThrow)==100)
                {
                    System.out.println("Congratulations player 2, you have won the game! Better luck next time, Player 1.");
                    break;
                }
                else
                {
                    player2Index+=dThrow;
                    System.out.println("\nYou have progressed by "+dThrow+" square(s), and your new position is "+player2Index+".");
                    System.out.println("\nPress any key to see whether you encountered a snake or a ladder.");
                    br.readLine();
                    switch(player2Index)
                    {
                        case 4  : System.out.println("Awright! You got the ladder on square 4! You play again.");
                            System.out.println("Player 2, press any key to shuffle the die...");
                            turn1++;
                            br.readLine();
                            dThrow=r.nextInt(6);
                            if(dThrow==0)
                            {
                                dThrow++;
                            }
                            System.out.println("The number on the die is "+dThrow);
                            player2Index+=dThrow;
                            System.out.println("You have progressed by "+dThrow+" square(s), and your new position is "+player2Index+".");
                            break;
                        case 16 : System.out.println("Awright! You got the ladder on square 16! You play again");
                            System.out.println("Player 2, press any key to shuffle the die...");
                            turn1++;
                            br.readLine();
                            dThrow=r.nextInt(6);
                            if(dThrow==0)
                            {
                                dThrow++;
                            }
                            System.out.println("The number on the die is "+dThrow);
                            player2Index+=dThrow;
                            System.out.println("You have progressed by "+dThrow+" square(s), and your new position is "+player2Index+".");

                            break;
                        case 17 : System.out.println("Whoops! You were caught by the snake at square 17. You're now down to square 8. :(");
                            player2Index=8;
                            break;
                        case 35 : System.out.println("Awright! You got the ladder at square 35! You play again");
                            System.out.println("Player 2, press any key to shuffle the die...");
                            turn1++;
                            br.readLine();
                            dThrow=r.nextInt(6);
                            if(dThrow==0)
                            {
                                dThrow++;
                            }
                            System.out.println("The number on the die is "+dThrow);
                            player2Index+=dThrow;
                            System.out.println("You have progressed by "+dThrow+" square(s), and your new position is "+player2Index+".");

                            break;
                        case 50 : System.out.println("Awright! You got the ladder at square 50! You play again");
                            System.out.println("Player 2, press any key to shuffle the die...");
                            turn1++;
                            br.readLine();
                            dThrow=r.nextInt(6);
                            if(dThrow==0)
                            {
                                dThrow++;
                            }
                            System.out.println("The number on the die is "+dThrow);
                            player2Index+=dThrow;
                            System.out.println("You have progressed by "+dThrow+" square(s), and your new position is "+player2Index+".");

                            break;
                        case 54 : System.out.println("Whoops! You were caught by the snake at square 54! You're now down to square 28. :(");
                            player2Index=28;
                            break;

                        case 62 : System.out.println("Whoops! You were caught by the snake at square 62! You're now down to square 13. :(");
                            player2Index=13;
                            break;
                        case 64 : System.out.println("Whoops! You were caught by the snake at square 64! You're now down to square 20. :(");
                            player2Index=20;
                            break;

                        case 87 : System.out.println("Whoops! You were caught by the snake at square 87! You're now down to square 75. :(");
                            player2Index=75;
                            break;
                        case 93 : System.out.println("Whoops! You were caught by the snake at square 93! You're now down to square 83. :(");
                            player2Index=83;
                            break;
                        case 95 : System.out.println("Whoops! You were caught by the snake at square 95! You're now down to square 64. :(");
                            player2Index=64;
                            break;
                        case 98 : System.out.println("The higher they fly the harder they fall! You have been caught by the biggest snake in the game and are now down to square 8. Good day sir!");
                            player2Index=8;
                            break;
                        default : System.out.println("No snakes or ladders here.");
                    }
                }

            }
            turn1++;
            turn2++;
        }

    }
    public static void main(String[]args) throws IOException
    {
        SnakesAndLadders s=new SnakesAndLadders();
        s.snakeGame();
    }
}
