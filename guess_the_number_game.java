import java.util.Scanner;
import java.util.Random;;

class Game
{
    public int Inputnumber;
    public int actualNumber;
    public int noOfAttempts=0;

    public void setNoOfGuesses(int noOfAttempts)
    {
          this.noOfAttempts = noOfAttempts;
    }
    public int getNoOfGuesses()
    {
        return noOfAttempts;
    }

    Game()
    {
        Random r = new Random();
        actualNumber = r.nextInt(100);
    }

    void input()
    {
        System.out.print("Guess the number : ");
        Scanner sc = new Scanner(System.in);
        Inputnumber = sc.nextInt();
    }

    boolean isNumberCorrect()
    {
        noOfAttempts++;
         if(Inputnumber==actualNumber)
         {
            System.out.format("\nCongrats ! The number was %d \nYour guessed it in %d attempts",actualNumber,noOfAttempts);
             return true;
         }
         else if (Inputnumber>actualNumber)
         {
             System.out.println("Actual number is less than "+Inputnumber);
         }

         else if (Inputnumber<actualNumber)
         {
             System.out.println("Actual number is greater than "+Inputnumber);
         }
         return false;
    }

}



public class guess_the_number_game {
public static void main(String[] args) {
    Game G = new Game();
    boolean b = false;
    while(!b)
    {
        G.input();
        b = G.isNumberCorrect();
        
    }
    
}    
}
