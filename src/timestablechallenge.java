import java.util.Scanner;
import java.util.Random;

public class timestablechallenge {


	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner in=new Scanner(System.in);
		Random rnd=new Random();

		//Setup Variables
		int hi;
		int low;
		int num; 
		int score=0;
		int ques=1;
		int ans1;
		int ans2;
			

		//Ask for hi low and num
		System.out.println("Welcome to the times table challenge!");
		System.out.println("What is the biggest number you want?");
		hi=in.nextInt();
		System.out.println("What is the smallest number you want?");
		low=in.nextInt();

		//if (ans2>ans1); {
		//low=ans1;
		//hi=ans2;
		//System.out.println("Whoops low was higher than high, I switched them for you");
		//}else {
			//hi=ans1;
			//low=ans2;
		
	
		//loop and ask questions
		while (score<10) {
			int num1=rnd.nextInt(hi-low+1)+low;
			int num2=rnd.nextInt(hi-low+1)+low;
			
			System.out.println("Question "+ques+") "+num1+" x "+num2+" = ?");
			int ans=in.nextInt();
			if (ans==num1*num2) {
				score=score+1;
				System.out.println("Right");
			}else {
				score=0;
				System.out.println("Wrong! The answer is "+(num1*num2));

			}
			ques++;
		}
		//Print results
		System.out.println("You got 10 right in a row! Congratulations!");
	}
}

