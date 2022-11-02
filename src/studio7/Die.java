package studio7;

public class Die {

	private int side;
	
	public Die(int side) {
		
		this.side = side;
		
	}
	public int roll() {
		return (int)((Math.random()*side)+1);
	}
	
	public static void main (String[] args) {
		Die d1 = new Die(6);
		System.out.println(d1.roll());
	}
}
