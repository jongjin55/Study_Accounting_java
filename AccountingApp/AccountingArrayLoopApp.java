
public class AccountingArrayLoopApp {

	public static void main(String[] args) {
		
		
		
		double valueOfSupply = Double.parseDouble(args[0]);
		double vateRate = 0.1;
		double expenseRate = 0.3;
		double vat = valueOfSupply*vateRate;
		double total = valueOfSupply + vat;
		double expense = valueOfSupply*expenseRate;
		double income = valueOfSupply - expense;
		
		//double rate1 = 0.5;
		//.. 변수가 많아질수록 변수이름이 혼동될 가능성이있다
		//double rate2 = 0.3;
		//double rate3 = 0.2;
		
		
		System.out.println("Value of supply : " + valueOfSupply);
		System.out.println("VAT : " + vat );
		System.out.println("Total : " + total );
		System.out.println("Expense : " + expense );
		System.out.println("Income : " + income );
		
		
		double[] dividendRates = new double[3];
		dividendRates[0] = 0.5;
		dividendRates[1] = 0.3;
		dividendRates[2] = 0.2;
		
		int i = 0;
		while( i < dividendRates.length ) {
			System.out.println("Dividend : " + (income * dividendRates[i]) );
			i += 1;
		}
		
		
		
	}

}
