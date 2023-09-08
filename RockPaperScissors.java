import java.util.*;
public class RockPaperScissors {
    public static void options(){
        System.out.println("Press 1 for Rock...");
        System.out.println("Press 2 for Paper...");
        System.out.println("Press 3 for Scissors...");
        System.out.println("Press 0 for EXIT...");
        System.out.print("Enter The Number>> ");
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
