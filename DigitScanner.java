import java.util.Scanner;
public class DigitScanner{
  public static void main(String[] args){
    Scanner integerInput = new Scanner(System.in);
    System.out.println("Enter an integer: ");
    int input = integerInput.nextInt();
    //Test input == 123

    int zeroes = 0;
    int evens = 0;
    int odds = 0;
    for(int i = Integer.toString(input).length() -1; i >= 0; i--){
      if(input%10 == 0){
        zeroes++;
      }else if(input%2 == 0){
        evens++;
      }else{
        odds++;
      }
      input = input/10;
    }
    System.out.println("There are " + zeroes + " zeroes");
    System.out.println("There are " + evens + " evens");
    System.out.println("There are " + odds + " odds");
  }
}
