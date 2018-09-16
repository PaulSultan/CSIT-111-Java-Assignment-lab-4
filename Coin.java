public class Coin
{
	public final int HEADS = 0;
	public final int TAILS = 1;
	private double face;
	private double bias = 0.5;

	public Coin ()
	{
		flip();
	}
	public void biasCoin (double prob)
	{
		if ((prob >= 0) && (prob <= 1))
			bias = prob;
		else
			bias = 0.5;
		flip();
	}

	public void flip()
	{
		double random = (Math.random());
		if (random < bias) 
			face = HEADS;
		else 
			face = TAILS;
	}
	public boolean isHeads()
	{
		return (face == HEADS);
	}
	public double getFace()
	{
		return face;
	}
	public String toString()
	{
		String faceName;
		if (face == HEADS)
			faceName = "Heads";
		else
			faceName = "Tails";
		return faceName;
	}
}
