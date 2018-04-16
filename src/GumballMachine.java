public class GumballMachine
{

	 int cost_per_gumball;
	 int coin_inserted;
	 int gumball_count =20;
	 int total;

	public GumballMachine(int cost_per_gumball, int coin_inserted){
		this.cost_per_gumball=cost_per_gumball;
		this.coin_inserted=coin_inserted;
	}
	
	public void turnCrank()
	{
	    if ( this.gumball_count > 0 )
	    		{
	    			this.gumball_count-- ;
	    			System.out.println("Thanks for the payment. Gumball ejected!") ;
	    		}
	    else
	    		{
	    			System.out.println("No more Gumballs! Sorry, can't return your payment.") ;
	    		}
	}
		
		
	public void decision(int cost_per_gumball,int total) {
		GumballMachine demo = new GumballMachine(cost_per_gumball, total);
		if(total == cost_per_gumball) {	
			demo.turnCrank();
		}
		else if (total < cost_per_gumball)	
			System.out.println("Please insert " +cost_per_gumball+ " cents. Try Again! ") ;
		
        else if (total > cost_per_gumball)	
        	System.out.println("Please insert only " + cost_per_gumball + " cents!") ;	
	}
}


