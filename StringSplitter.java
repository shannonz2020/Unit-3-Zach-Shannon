import java.util.Scanner;
public class StringSplitter{
  public static void main(String[] args){
    Scanner userString = new Scanner(System.in);
    System.out.println("Enter a string:");
    String string = userString.next();

    string.replaceAll("[^a-zA-Z0-9]","");

    for(int i = 0; i != string.length(); i++){
      System.out.println(string.charAt(i));
    }
  }
}
