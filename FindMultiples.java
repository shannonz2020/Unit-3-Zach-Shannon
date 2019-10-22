import java.util.Scanner;
import java.lang.Math;
public class FindMultiples{
  //method to check if the inputs are valid
  public static boolean isValid(double countBy2, double countTo2){
    return countBy2 <= 0 || countTo2 <= 0 || countBy2 > countTo2 || countBy2 != Math.round(countBy2) || countTo2 != Math.round(countTo2);
  }
  //main method
  public static void main(String[] args){
    Scanner userNumber = new Scanner(System.in);
    System.out.println("Which number would you like to count by?");
    double countBy = userNumber.nextDouble();

    Scanner userNumber2 = new Scanner(System.in);
    System.out.println("Which number would you like to count to?");
    double countTo = userNumber2.nextDouble();

    while(isValid(countBy, countTo)){
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
    for(double i = countBy,j = 1; i <= countTo; i+= countBy){
      if(j % 5 == 0){
        System.out.println(Math.round(i) + "");
          j++;
      }else{
          System.out.print(Math.round(i) + " ");
          j++;
      }
    }
  }
}
