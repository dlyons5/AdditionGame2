import java.util.Scanner;
 //this allows the scanner to scan 
class Main {
  public static void main(String[] args) {
 
   Scanner scan = new Scanner(System.in);
//scanner is going to ask two questions   
    System.out.println("choose a number between 1 and 5");
   int number = scan.nextInt();
    System.out.println("choose a number that adds to equal 12 (so like what + the number you choose = 12");
   int number2 = scan.nextInt();
//scanner is going to keep the answers of those questions 
  while(correctAnswer >= 1 && <= 5 ){

     System.out.println("The answer" + correctAnswer + "is correct because 8 + 4 = 12");
     correctAnswer++;
     }
    
     System.out.print("That is why the answer is 4");
//int will decide if the answer is correct or not 
int a = 1;
int b = 2;
int c = 3;
int d = 4;
int e = 5;

if (a <= 5 && e > 1)
    {
        System.out.println(" correct ");
    }
    else
    {
        System.out.println(" thats the wrong answer ");
//if the answer is correct, the code will print out correct, if the answer is wrong, the code will print out incorrect       
    }
  }
}
