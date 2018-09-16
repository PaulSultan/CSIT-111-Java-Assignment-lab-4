import java.util.Scanner;

public class Biased
{
	public static void main (String[] args)
	{
		final int FLIPS = 100;
		Scanner scan = new Scanner (System.in);
		int heads1 = 0;
		int heads2 = 0;
		int heads3 = 0;	
		double prob1, prob2, prob3;
	
		System.out.println ("Instantiting three new coins.");
		System.out.println ("The first coin is fair.");
		prob1 = 0.5;
		System.out.println ("Enter the probability of heads for the second coin (0-1 inclusive): ");
		prob2 = (scan.nextDouble());
		System.out.println ("Enter the probability of heads for the third coin (0-1 inclusive): ");
		prob3 = (scan.nextDouble());
		
		Coin coin1 = new Coin();
		Coin coin2 = new Coin();
		Coin coin3 = new Coin();
		
		for (int i = 0; i < FLIPS; i++)
		{
			coin1.flip();//<--------------This calls the unbiased Flip
			if (coin1.isHeads()) 
				heads1++;
			coin2.biasCoin(prob2);//<-------this calls the biased flip
			if (coin2.isHeads()) 
				heads2++;
			coin3.biasCoin(prob3);
			if (coin3.isHeads()) 
				heads3++;
		}


		System.out.println ("Coin 1 with bias " + prob1 + " came up heads " + heads1 + " times.");
		System.out.println ("Coin 2 with bias " + prob2 + " came up heads " + heads2 + " times.");
		System.out.println ("Coin 3 with bias " + prob3 + " came up heads " + heads3 + " times.");
	}
}
