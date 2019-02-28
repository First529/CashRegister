public class CashRegister {
    private double purchase; // total amount of product price bought
    private double payment;  // total amount of payment
    private TaxBehaviour tax;

    public CashRegister() {
        purchase = 0;
        payment = 0;
    }

    public void recordPurchase(double amount) {
        purchase += amount;
    }

    public void setTaxBehaviour(TaxBehaviour tx) {
    	tax = tx;
    }

    public void enterPayment(double amount) {
        payment += amount;
    }

    public double giveChange() {
    	purchase = tax.calculateTax(purchase);
        double change = payment - purchase;
        purchase = 0;
        payment = 0;
        return change;
    }
}
