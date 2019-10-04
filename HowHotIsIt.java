import java.util.Scanner;
  public class HowHotIsIt{
    public static void main(String[] args){
      Scanner temperatureInput = new Scanner(System.in);
      System.out.println("What's the temperature outside? (F) ");
      int temperature = temperatureInput.nextInt();
      //Print statement
      if(temperature<45){
        System.out.println("Wow, it's cold outside!");
      }else if(temperature>=45 && temperature<=67){
        System.out.println("It's kinda cool outside.");
      }else if(temperature>=68 && temperature<=83){
        System.out.println("That's an ideal temperature.");
      }else if(temperature>83){
        System.out.println("It's hot outside!");
      }
    }
  }
