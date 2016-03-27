package simpleTest;
import java.util.Scanner;

public class simpleTesst 
{
	public static void main(String[] args)
	{
	Scanner input = new Scanner(System.in);
	System.out.println("Enter asn integer:");
	int number = input.nextInt();
	if (number % 5 == 0)
		System.out.println("hi five");
	if (number % 2 == 0)
		System.out.println("Hi Five");
	
	int radius = 0,  area = 0,  PI = 0;
	if (radius >= 0)
	{
	 area = radius * radius = PI;
	System.out.println("The area for the circle of radius" +
	radius + "is" + area);
	}
	else
		System.out.println("negative input");
	
	}
int number1 =(int)(Math.random() * 10);
int number2 =(int)(Math.random() * 10);
 if (number1 < number2)
 {
   int temp = number1;
   number1 = number2;
   number2 = temp;
 }
 System.out.println("what is" + number1 + " - " + number2 + " ? ");
  Scanner input = new Scanner(System.in);
  int answer = input.nextInt();
  if (number1 - number2 == answer)
  else
	  System.out.println("your answer is wrong\n" + number1 + " - "
			  + number2 + " should be " + (number1 - number2)); 
	  System.out.println("you are correct");
	  int sum = 0, i = 1;
	  while (i < 10)
	  {
		  sum = sum + i;
		  i++;
	  }
	  System.out.println("sum is " + sum);
	   
	  int sum = 0;
	  int number = 0;
	  while (number < 20)
	  {
		  number++;
		  sum += number;
		  if (sum >= 100)
			  break;
	  }
	  System.out.println("The number is " + number);
	  System.out.println("The sum is " + sum);
	  
	}

}
} 
