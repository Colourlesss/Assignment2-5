import java.util.Scanner;
public class DiceRoll
{
   public static void main(String[] args){
       Scanner sc = new Scanner(System.in);
       while(true){
       System.out.print("How many D6's do you want to roll? ");
       int num = sc.nextInt();
       int total = 0;
       System.out.print("How many sides do these dice have? ");
       int side = sc.nextInt();
       System.out.print("You rolled: ");
       for(int i = 0;i<num;i++){
           int rand = rollDie(side);
           total += rand;
           System.out.print(rand+ " ");
       }
       System.out.println();
       System.out.println("Total: " + total);
       System.out.print("Again? [y,n] ");
       sc.nextLine();
       if(sc.nextLine().charAt(0) == 'n'){
           System.out.println("Good-Bye!");
           break;
       }
    }
   }
   
   static int rollDie(int range){
       return (int)(Math.random() * range + 1);
   }
}
