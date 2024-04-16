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
  				System.out.println("cost is 8 rupees");
                      	else
                  		System.out.println("cost is 12 rupeese");
  			break;
  			case 2:if(age<18)
  				System.out.println("cost is 10 rupees");
                 	 else
  				System.out.println("cost is 15 rupeese");
  			break;
  		}
  	}
}
