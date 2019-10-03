import java.util.Scanner;
  public class DrinkAndDrive{
    public static void main(String[] args){
      Scanner ageInput = new Scanner(System.in);
      System.out.println("Enter your age: ");
      int userAge = ageInput.nextInt();
      //Print statement
      if(userAge<17){
        System.out.println("You're not old enough to drive or drink!");
      }else if(userAge>=17 && userAge<21){
        System.out.println("Hey! You can drive, just no drinking, idiot!");
      }else{
        System.out.println("Woah! You're really old. Have fun drinking and driving!");
      }
    }
  }
