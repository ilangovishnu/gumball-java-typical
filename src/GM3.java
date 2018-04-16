
public class GM3 extends GumballMachine{

	public GM3(int gumball_cost, int coin_inserted) {
		super(gumball_cost, coin_inserted);
	}

	static int cost_per_gumball =50;
	static int coins_inserted[] =  {25,5,10,10};
	static int total;
	int sum =0;
		
	public  int sum() {
		int sum = 0; 
        int i;
        for (i = 0; i < coins_inserted.length; i++)
           sum +=  coins_inserted[i];
           return sum;
		}
	
	public void validation() {
		 super.decision(cost_per_gumball, total);	 
	}
	
	public static void main(String[] args) {
		GM3 gm3= new GM3(cost_per_gumball, total);
		total =gm3.sum();
		gm3.validation();
			
	}

}
