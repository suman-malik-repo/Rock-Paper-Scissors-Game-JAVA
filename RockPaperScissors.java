import java.util.*;
public class RockPaperScissors {
    public static void options(){
        System.out.println("Press 1 for Rock...\nPress 2 for Paper...\nPress 3 for Scissors\nPress 0 for EXIT...\nEnter the Number>>> ");
    }
    public static void print(int a, int b){
        System.out.println("..........(System: "+a+")....."+"(User: "+b+")...........");
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int sysScore = 0;
        int userScore = 0;
        System.out.println("Starting the game.......");
        while(true){
            Random rand = new Random();
            int num = rand.nextInt(1,4);
            options();
            int input = sc.nextInt();
            if(num==input){
                System.out.println("That'1s a draw...");
                print(sysScore,userScore);
            }
            else if (input == 0) {
                print(sysScore,userScore);
                if(sysScore>userScore){
                    System.out.println("Ohh!!! you loss the Game");
                } else if (sysScore < userScore) {
                    System.out.println("Yah!!! You WON the Game");
                }
                else{
                    System.out.println("It's a DRAW match");
                }
                break;
            }
            else if((num==input-1) || (num==input+2)){
                System.out.println("Your Score +1...");
                userScore++;
                print(sysScore,userScore);
            }
            else if((num==input-2) || (num==input+1)){
                System.out.println("Your Score +0");
                sysScore++;
                print(sysScore,userScore);
            }
            else{
                System.out.println("Something went wrong...");
            }
        }
    }
}
