
import java.util.Scanner
;
import java.util.Random;

public class rockpaperscissor {
    public static void main(String[] args) {
        Scanner sc1= new Scanner(System.in);
        Random r1 = new Random();
        // System.out.println(2|1);
        int a=0;
        int b=0;
        System.out.println("welcome to the game");
        System.out.println("ENTER 0->ROCK");
        System.out.println("      1->PAPER");
        System.out.println("      2->SCISSOR");
        for(int i=0;i<=5;i++){
            int user=sc1.nextInt();
            int pc=r1.nextInt(3);
            switch(user|pc){
                case 1:
                if(user>pc){
                    a=a+1;
                    System.out.println("user won");
                }
                else if(user<pc){
                    b=b+1;
                    System.out.println("pc won");
                }
                else{
                    System.out.println("Tie");
                
                }
                break;
                 case 2:
                 if(user<pc){
                    a=a+1;
                    System.out.println("user won");
                }
                else if(user>pc){
                    b=b+1;
                    System.out.println("pc won");
                }
                else{
                    System.out.println("Tie");
                }
                break;
                case 3:
                if(user>pc){
                    a=a+1;
                    System.out.println("user won");
                }
                else if(user<pc){
                    b=b+1;
                    System.out.println("pc won");
                }
                else{
                    System.out.println("Tie");
                }
                break;

                    

            }



        }
        if(a>b){
            System.out.println("YOU WON");
        }
        else{
            System.out.println("YOU LOSE");
        }
        
    }
    }


