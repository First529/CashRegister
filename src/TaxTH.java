
public class TaxTH implements TaxBehaviour{
	
	@Override
	public double calculateTax(double purchase) {
		purchase = purchase + (purchase*0.07);
		return purchase;
	}

	
}
