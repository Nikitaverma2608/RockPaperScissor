 /* THIS IS A GAME PROGRAM -------> ROCK, PAPER, SCISSORS  */
 import java.util.Random;
 import java.util.Scanner;
 
 public class RockPaperScissor {
     public static void main(String[]args)
     {
       Random rn= new Random();
      // int num1= rn.nextInt();
       Scanner sc= new Scanner(System.in);
       
       System.out.println("            ****  WELCOME TO THE GAME ****          ");
       System.out.println("            ****  ROCK PAPER SCISSOR ****           ");
 
       System.out.println("Here are the rules:\nYou have to enter 0/1/2\n\t0.ROCK\n\t1.PAPER\n\t2.SCISSOR\nThen wait for computers choice.There will be total 5 rounds after that winner will be announced.");
       
       for(int i=0  ;i<=5 ; i++)
       {   
       System.out.print("Enter you choice : ");
       int num1= sc.nextInt();
      // System.out.print("Computers choice is : ");
       int num2= rn.nextInt(2);
      
       System.out.println("Computers choice is : "+num2);
      // System.out.println(num2);
        
       switch(num1)
       {
           case 0: if(num2==0)
                   {
                       System.out.println("Sorry,This match is draw!");
                 
                   }
                   else if(num2==1)
                   {
                       System.out.println("Sorry,You loose this match!");
                       
                   }
                   else
                   {
                       System.out.println("Hurray!!You won this match!");
                       
                   }
                   break;
           case 1: if(num2==0)
                   {
                       System.out.println("Hurray!!You won this match!");
                       
                   }
                   else if(num2==1)
                   {
                       System.out.println("Sorry,This match is draw!");
                   }
                   else
                   {
                       System.out.println("Sorry,You loose this match!");
                       
                   }
                   break;
           case 2: if(num2==0)
                   {
                       System.out.println("Sorry,You loose this match!");
                   }
                   else if(num2==1)
                   {
                       System.out.println("Hurray!!You won this match!");
                   }
                   else
                   {
                       System.out.println("Sorry,This match is draw!");
                   }
                   break;
          default: System.out.println("YOU HAVE ENTERED WRONG CHOICE SO THIS MATCH IS DRAW. PLAY NEXT MATCH ");
                 break;
         } 
       }
     }
 }
 