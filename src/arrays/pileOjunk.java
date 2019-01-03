package arrays;

import java.util.Random;

public class pileOjunk {
	private static int idNumber = 400;
	private int random;

	public pileOjunk() {
		Random generator = new Random();
		int min = 10;
		int max = 100;
		int num = min + generator.nextInt(max - min + 1);
		random = num;
		idNumber += 1;
	}
	public int getRandom()
	{
		return random;
	}
	public static int getSum(int x, int y) {
		return x + y;
	}

	public void setNum(int random) {
		this.random = random;
	}
}
