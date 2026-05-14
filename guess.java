import java.util.Random;
import java.util.Scanner;

class game{
    public int number;
    public int guessnumber;
    public int noofguesses=0;

    public int getnoofguesses(){
        return noofguesses;
    }

    public void setnoofguesses(int noofguesses){
        this.noofguesses=noofguesses;
    }


    game(){
        Random rand=new Random();
        this.number=rand.nextInt(100);
    }

    void userinput(){
        System.out.println("Guess the number");
        Scanner sc=new Scanner(System.in);
        guessnumber=sc.nextInt();
    }

    boolean isCorrect(){
        noofguesses++;
        if(guessnumber==number){
            System.out.println("You guessed it right in "+noofguesses + " attempts");
            return true;
        }
        else if(guessnumber<number){
            System.out.println("too low");
    }
        else{
            System.out.println("too high");
        }
        return false;
    }
    

}

public class guess {
    public static void main(String[] args){
         game g=new game();
         boolean b=false;
         
           while(!b){
            g.userinput();
            b= g.isCorrect();
    }
}
}
