
public class TaxCA implements TaxBehaviour{

	@Override
	public double calculateTax(double purchase) {
		purchase = purchase + (purchase*0.075);
		return purchase;
		
	}

	
}
