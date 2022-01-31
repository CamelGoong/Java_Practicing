
public class AccountingArrayApp {

	public static void main(String[] args) { //String[] ���ڿ��� ��Ҹ� ������ �迭
		// 10000.0�� ���� -> search > replace all�� ���� �ѹ��� �ٲ� �� ����.
		double valueofSupply = Double.parseDouble(args[0]); // ��Ŭ���ؼ� refactor > extract local variable ��� �̿� / ���� �������� ����� �ٲ�
		double vatRate = 0.1;
		double expenseRate = 0.3;
		double vat = valueofSupply * vatRate;
		double expense = valueofSupply *expenseRate;
		double income = valueofSupply - expense;
		
//		double rate1 = 0.5;
//		double rate2 = 0.3;
//		double rate3 = 0.2;
		//... (���� ���� �ڵ尡 ���̿� �ִٰ� ����)
		
		// �迭
		
		double[] dividendRates = new double[3]; //double�� 3��¥�� ������ �迭 ����
		dividendRates[0] = 0.5;
		dividendRates[1] = 0.3;
		dividendRates[2] = 0.2;
		
		double dividend1 = income*dividendRates[0];
		double dividend2 = income*dividendRates[1];
		double dividend3 = income*dividendRates[2];
		
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
