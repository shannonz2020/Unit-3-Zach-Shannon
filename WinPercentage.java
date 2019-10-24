import java.util.Scanner;
import java.lang.Math;

public class WinPercentage{
  public static boolean isValid(double gamesWon, double gamesPlayed){
    return ((gamesWon > gamesPlayed)||(gamesPlayed < 1)||(gamesWon < 0)||gamesWon != Math.round(gamesWon)||gamesPlayed != Math.round(gamesPlayed));
  }
  public static void main(String[] args){
    Scanner gamesPlayed = new Scanner(System.in);
    System.out.println("Enter the number of games played: ");
    double numOfGamesPlayed = gamesPlayed.nextDouble();

    Scanner gamesWon = new Scanner(System.in);
    System.out.println("Enter the number of games won: ");
    double numOfGamesWon = gamesWon.nextDouble();

    while(isValid(numOfGamesWon, numOfGamesWon)){
      //redo games played
      System.out.println("---------------------------------------");
      gamesPlayed = new Scanner(System.in);
      System.out.println("Enter the *actual* number of games played: ");
      numOfGamesPlayed = gamesPlayed.nextDouble();
      //redo games won
      gamesWon = new Scanner(System.in);
      System.out.println("Enter the *actual* number of games won: ");
      numOfGamesWon = gamesWon.nextDouble();
    }

    //percentage calculation
    double winPercentageTemp = Math.round( ( numOfGamesWon / numOfGamesPlayed) * 10000);
    double winPercentage = winPercentageTemp / 100;

    //result
    System.out.println("Your win percentage is: " + winPercentage + "%");
  }
}
