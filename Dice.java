public class Dice {
	private int sides = 0;

	private int numdice = 0;
	
	public Dice(int s, int n) {
		sides = s;
		numdice = n;
	}

	public void setSides(int numsides) {
		sides = numsides;
	}

	public void setDice(int numdi) {
		numdice = numdi;
	}

	public int roll() {
		//a loop to sum up the total return
		int sum = 0;

		for(int i = 0; i < numdice; i++)
		{
			sum = sum + ( (int) (Math.random() * sides) + 1);
		}

		return sum;
	}
}