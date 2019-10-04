import java.util.Scanner;
public class MinOfThree{
  public static void main(String[] args){
    Scanner integerInput1 = new Scanner(System.in);
    System.out.println("Enter an integer: ");
    int integer1 = integerInput1.nextInt();

    Scanner integerInput2 = new Scanner(System.in);
    System.out.println("Enter another integer: ");
    int integer2 = integerInput2.nextInt();

    Scanner integerInput3 = new Scanner(System.in);
    System.out.println("Enter your final integer: ");
    int integer3 = integerInput3.nextInt();

    if(integer1<=integer2){
      if(integer1<=integer3){
        System.out.println("The smallest number is: " + integer1);
      }else if(integer2<=integer3){
        System.out.println("The smallest number is: " + integer2);
      }else{
        System.out.println("The smallest number is: " + integer3);
        }
    }else if(integer2<=integer3){
      System.out.println("The smallest number is: " + integer2);
    }else{
      System.out.println("The smallest number is: " + integer3);
      }
    }
  }
