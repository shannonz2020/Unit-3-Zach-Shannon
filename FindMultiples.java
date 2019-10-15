import java.util.Scanner;
import java.lang.Math;
public class FindMultiples{
  public static void main(String[] args){
    Scanner userNumber = new Scanner(System.in);
    System.out.println("Which number would you like to count by?");
    double countBy = userNumber.nextDouble();

    Scanner userNumber2 = new Scanner(System.in);
    System.out.println("Which number would you like to count to?");
    double countTo = userNumber2.nextDouble();

    while(countBy <= 0 || countTo <= 0 || countBy > countTo || countBy != Math.round(countBy) || countTo != Math.round(countTo)){
      //redo countBy
      System.out.println("---------------------------------------");
      userNumber = new Scanner(System.in);
      System.out.println("Which number would you *really* like to count by?");
      countBy = userNumber.nextDouble();

      //redo countTo
      userNumber2 = new Scanner(System.in);
      System.out.println("Which number would you *really* like to count to?");
      countTo = userNumber2.nextDouble();
    }
    System.out.println("Your numbers are:");
    for(double i = countBy; i <= countTo; i+= countBy){
      if(countTo%countBy == 0){
          System.out.print(Math.round(i) + " ");
      }
    }
  }
}
