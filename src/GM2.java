
public class GM2 extends GumballMachine{
	
		public GM2(int gumball_cost, int coin_inserted) {
			super(gumball_cost, coin_inserted);
			// TODO Auto-generated constructor stub
		}
		
		static int max_coins=3;
		static int cost_per_gumball =50;
		static int coins_inserted=25;
		static int Flag;
		static int total;
		
		public  int insertonlyquarter() {
			if(coins_inserted == 25 && max_coins==2)
				return 1;
			else 
				return 0;
		}
		
		public void validation() {
			 super.decision(cost_per_gumball, total);	 
		}
		
		public static void main(String[] args) {
			 
			GM2 gm2= new GM2(cost_per_gumball, total);
			Flag =gm2.insertonlyquarter();
			if (Flag == 1) {
		       total= coins_inserted * max_coins;
			   gm2.validation();
			}
			else if (Flag==0)
			System.out.println("Insert only quarters");
			
		}
		
	
	}



