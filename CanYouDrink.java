import java.util.Scanner;
  public class CanYouDrink{
    public static void main(String[] args){
      //Read user input
      Scanner ageInput = new Scanner(System.in);
      System.out.println("Enter your age: ");
      int userAge = ageInput.nextInt();
      //Print statement
      if(userAge >= 21){
        System.out.println("Woo-hoo! You can drink!");
      } else{
        System.out.println("You're too young to drink, grow up!");
      }
  }
}
