import java.util.Scanner;
public class DigitScanner{
  public static void main(String[] args){
    Scanner integerInput = new Scanner(System.in);
    System.out.println("Enter an integer: ");
    int input = integerInput.nextInt();
    //Test input == 123
    String integer = "" + input;

    String zeroes = "";
    String evens = "";
    String odds = "";
    for(int i = 0; i == integer.length() -1; i++){
      if(integer.charAt(i) == 0){
        zeroes = zeroes + integer.charAt(i);
      }else if(integer.charAt(i)%2 == 0){
        evens = evens + integer.charAt(i);
      }else{
        odds = odds + integer.charAt(i);
      }
    }
    System.out.println("Here are the zeroes: " + zeroes);
    System.out.println("Here are the evens: " + evens);
    System.out.println("Here are the odds: " + odds);
  }
}
