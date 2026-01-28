import java.util.Scanner;
public class Ruin {
   public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    System.out.println("What is the start amount?");
    int startAmount = in.nextInt();
    System.out.println("What is the probability you'll win?");
    double winChance = in.nextDouble();
    System.out.println("What is the win limit?");
    int winLimit = in.nextInt();
   System.out.println("How many days are you playing?");
    int totalSimulations = in.nextInt();
    int c = 0;

    for (int i = 1; i < totalSimulations; i++) {
    while (startAmount < winLimit && startAmount > 0) {
      
      if (Math.random() < winChance) {
         startAmount++;
      }
      else {
         startAmount--;
      }
    }
   
    if (startAmount == winLimit) {
      System.out.println("Simulation" + i + "win");
    }
    if (startAmount == 0) {
      System.out.println("Simulation" + i + "lose");
      c++;
    }
   } 
    System.out.println("Expected Ruin Rate: " + (c/totalSimulations));

}
}
