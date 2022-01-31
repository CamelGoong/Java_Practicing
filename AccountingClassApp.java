class Accounting{
	public double valueofSupply; // main �ۿ��� ���������� ���� / instance�� ���Ǳ� ���ؼ��� ���� ���̻� public static double-> public double
	public double vatRate;
	public double expenseRate;
	
	public void print() {
		System.out.println("Value of supply = "+valueofSupply); //double�� ������
		System.out.println("VAT : " + getVAT());
		System.out.println("Total : " + (valueofSupply + getVAT()));
		System.out.println("Expense : " + getExpense()); // ����� 30%
		System.out.println("Income : " + getIncome());
		System.out.println("Dividend1 : " + getDividend1());
		System.out.println("Dividend2 : " + getDividend2());
		System.out.println("Dividend3 : " + getDividend3());
	}

	public double getDividend1() {
		return getIncome()*0.5;
	}
	
	public double getDividend2() {
		return getIncome()*0.3;
	}
	
	public double getDividend3() {
		return getIncome()*0.2;
	}

	
	public double getIncome() {
		return valueofSupply - getExpense();
	}

	public double getExpense() {
		return valueofSupply *expenseRate;
	}

	public double getTotal() {
		return valueofSupply + getVAT();
	}

	// method�� ����� �ڵ�
	public double getVAT() {
		return valueofSupply * vatRate;
	}
}

public class AccountingClassApp {

	
	
	public static void main(String[] args) {

		// Ŭ�������� �� �޼ҵ带 �ҷ�����
//		Accounting.valueofSupply = 10000.0; // ���������� ���� �Է�
//		Accounting.vatRate = 0.1;
//		Accounting.expenseRate = 0.3;
//		//...
//		Accounting.print();
//		//...
//		Accounting.valueofSupply = 20000.0;
//		Accounting.vatRate = 0.05;
//		Accounting.expenseRate = 0.2;
		
		// ���� �� �ڵ� ��ſ� "�ν��Ͻ�(������ Ŭ������ �̿�)"
		//instance
		Accounting a1 = new Accounting();
		a1.valueofSupply = 10000.0;
		a1.vatRate = 0.1;
		a1.expenseRate = 0.3;
		a1.print();
		
		Accounting a2 = new Accounting();
		a2.valueofSupply = 20000.0;
		a2.vatRate = 0.05;
		a2.expenseRate = 0.2;
		a2.print();
		
	}

	
	

}
