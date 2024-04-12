import java.util.Scanner;
class Guess 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number to guess");
		int guess=s.nextInt();
		
    int number=(int)(Math.random()*100)+1;
    int i=0;
		while(i>0){
			if(number==Guess)
			{
				System.out.println("congratulations");
        break;
      }
			else if(Guess>number)
				System.out.println("you guessed greater number");
			else
				System.out.println("you guessed less number");
      i++;
		}
	}
}
