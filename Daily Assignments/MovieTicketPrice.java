import java.util.Scanner;
public class MovieTicketPrice
{
	public static void main(String[] args) 
	{
     		Scanner sc=new Scanner(System.in);
  		System.out.println("Choose the movie type");
  		System.out.println("1.Regular movie");
  		System.out.println("2. 3D movie");
     		int choice = sc.nextInt();
  		System.out.println("Enter your age");
  		int age=s.nextInt();
  		switch(choice){
  			case 1:if(age<18)
  				System.out.println("The ticket price is $8 ");
                      	else
                  		System.out.println("The ticket price is $12");
  			break;
  			case 2:if(age<18)
  				System.out.println("The ticket price is $10");
                 	 else
  				System.out.println("The ticket price is $15");
  			break;
  		}
  	}
}
