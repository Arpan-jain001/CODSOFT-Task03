import java.util.Scanner;

class NumberGuessing 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        int chances = 10;
        int finals = 0;
        boolean playAgain = true;
        System.out.println("Welcome Buddy! ");
        System.out.println("============================================ ");
        System.out.println("hii You have about "+chances+" chances to win the game:");
        System.out.println("============================================ ");
        while(playAgain)
        {
            int rand = getrandNu(1,100);
            boolean guess = false;
            for (int i = 0; i < chances; i++) 
            {
                System.out.print((i+1)+". Enter your guess: ");
                int a = sc.nextInt();
                if(a==rand)
                {
                    guess=true;
                    finals+=1;
                    System.out.println("You won");
                    break;
                }
                else if(a>rand)
                {
                    System.out.println("Too High");
                }
                else
                {
                    System.out.println("Too Low");
                }
            }
            if(guess==false)
            {
                System.out.println("You lost. The number was: "+rand);
            }
            System.out.print("Do you want to play game again (y/N) ? ");
            String pA = sc.next();
            playAgain = pA.equalsIgnoreCase("y");
        }
        System.out.println("Hope you enjoyed this game: ");
        System.out.println("Your Total Score is : "+finals);
    }

    public static int getrandNu(int min , int max)
    {
        return (int)(Math.random()*(max-min+1)+min);
    }
}