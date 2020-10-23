
class Accounting1 {
	
	public double valueOfSupply;
	public double vateRate;
	public double expenseRate;

	public void print() {
		System.out.println("Value of supply : " + valueOfSupply);
		System.out.println("VAT : " + getVAT() );
		System.out.println("Total : " + getTotal() );
		System.out.println("Expense : " + getExpense() );
		System.out.println("Income : " + getIncome() );
		System.out.println("Dividend1 : " + getDividend1() );
		System.out.println("Dividend2 : " + getDividend2() );
		System.out.println("Dividend3 : " + getDividend3() );
	}

	public double getDividend1() {
		return getIncome() * 0.5;
	}
	public double getDividend2() {
		return getIncome() * 0.3;
	}
	public double getDividend3() {
		return getIncome() * 0.2;
	}
	public double getIncome() {
		return valueOfSupply - getExpense();
	}
	public double getExpense() {
		return valueOfSupply * expenseRate;
	}
	public double getTotal() {
		return valueOfSupply + getVAT();
	}
	public double getVAT() {
		return valueOfSupply * vateRate;
	}

	
}

public class AccountingInstanceApp {

		
	public static void main(String[] args) {
		
		// 기능반복 
//		AccountingEx.valueOfSupply = 50000.0;
//		AccountingEx.vateRate = 0.1;
//		AccountingEx.expenseRate = 0.3;
//				//...
//		AccountingEx.print();
//		//....반
//		
//		AccountingEx.valueOfSupply = 10000.0;
//		AccountingEx.vateRate = 0.05;
//		AccountingEx.expenseRate = 0.1;
//		AccountingEx.print();
//		// ...반
//		AccountingEx.valueOfSupply = 50000.0;
//		AccountingEx.vateRate = 0.1;
//		AccountingEx.expenseRate = 0.3;
//				//...
//		AccountingEx.print();
		
		//클래스 복제해서 사
//		Accounting1.valueOfSupply = 10000.0;
//		Accounting1.vateRate = 0.05;
//		Accounting1.expenseRate = 0.1;
//		Accounting1.print();
//		
//		Accounting2.valueOfSupply = 50000.0;
//		Accounting2.vateRate = 0.1;
//		Accounting2.expenseRate = 0.3;
//				//...
//		Accounting2.print();
		
		// instance
		Accounting1 a1 = new Accounting1();
		a1.valueOfSupply = 10000.0;
		a1.vateRate = 0.1;
		a1.expenseRate = 0.3;
		a1.print();
		
		Accounting1 a2 = new Accounting1();
		a2.valueOfSupply = 20000.0;
		a2.vateRate = 0.05;
		a2.expenseRate = 0.2;
		a2.print();
		
		a1.print();
		
		
	}
}



