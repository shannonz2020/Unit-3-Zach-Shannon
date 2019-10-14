import java.util.Scanner;
public class PalindromeTester{
  public static void main(String[] args){
    //string 1 for testing
    //String string1 = "kayak";
    String stringFlipped = "";

    Scanner userString = new Scanner(System.in);
    System.out.println("Enter a palindrome: ");
    String stringOriginal = userString.next();

    for(int i = stringOriginal.length() - 1; i != -1; i--){
      stringFlipped = stringFlipped + stringOriginal.charAt(i);
    }
    if(stringOriginal.toLowerCase().compareTo(stringFlipped.toLowerCase()) == 0){
      System.out.println("Your string is a palindrome! :D");
    }else{
      System.out.println("Your string is NOT a palindrome. :(");
    }
  }
}
