
public class AccountingApp {

	public static void main(String[] args) {
		// 10000.0�� ���� -> search > replace all�� ���� �ѹ��� �ٲ� �� ����.
		double valueofSupply = Double.parseDouble(args[0]); // ��Ŭ���ؼ� refactor > extract local variable ��� �̿� / ���� �������� ����� �ٲ�
		double vatRate = 0.1;
		double expenseRate = 0.3;
		double vat = valueofSupply * vatRate;
		double expense = valueofSupply *expenseRate;
		double income = valueofSupply - expense;
		double dividend1 = income*0.5;
		double dividend2 = income*0.3;
		double dividend3 = income*0.2;
		
		System.out.println("Value of supply = "+valueofSupply); //double�� ������
		System.out.println("VAT : " + vat);
		System.out.println("Total : " + (valueofSupply + vat));
		System.out.println("Expense : " + expense); // ����� 30%
		System.out.println("Income : " + income);
		System.out.println("Dividend1 : " + dividend1);
		System.out.println("Dividend2 : " + dividend2);
		System.out.println("Dividend3 : " + dividend3);
	}
	

}
