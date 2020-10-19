import java.util.Scanner;
//this allows the scanner to work 
class Main {
  
  public static void main(String[] args) {
 
    Scanner scan = new Scanner(System.in);
//scanner is going to ask two questions   
    System.out.println("choose a number between 1 and 5");
    int number = scan.nextInt();
   
    System.out.println("choose a number that adds to equal 12 (so like what number + the number you choose = 12");
    int number2 = scan.nextInt();
//below is the while loop
    int correctAnswer = 12;

    while(correctAnswer <= 5 ){
      System.out.println("The answer" + correctAnswer + "is  correct because it equals 12");
      correctAnswer++;
    }
    
    System.out.print("That is why 12 - ? = the number you chose, so it is");

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
        System.out.println(" the wrong answer ");
//if the answer is correct, the code will print out correct, if the answer is wrong, the code will print out incorrect    
    }
  }
}
