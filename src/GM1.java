

public class GM1 extends GumballMachine{

	public GM1(int cost_per_gumball, int coin_inserted) {
		super(cost_per_gumball, coin_inserted);
		// TODO Auto-generated constructor stub
	}

	static int cost_per_gumball = 25;
	static int total=29;
	
	public void validation() {	
			 super.decision(cost_per_gumball, total);	
	}
	
	public static void main(String[] args) {
		GM1 gm1= new GM1(cost_per_gumball, total);
		gm1.validation();
	}
	
}
