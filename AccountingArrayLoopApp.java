
public class AccountingArrayLoopApp {

	public static void main(String[] args) { //String[] ���ڿ��� ��Ҹ� ������ �迭
		// 10000.0�� ���� -> search > replace all�� ���� �ѹ��� �ٲ� �� ����.
		double valueofSupply = Double.parseDouble(args[0]); // ��Ŭ���ؼ� refactor > extract local variable ��� �̿� / ���� �������� ����� �ٲ�
		double vatRate = 0.1;
		double expenseRate = 0.3;
		double vat = valueofSupply * vatRate;
		double expense = valueofSupply *expenseRate;
		double income = valueofSupply - expense;
	
		System.out.println("Value of supply = "+valueofSupply); //double�� ������
		System.out.println("VAT : " + vat);
		System.out.println("Total : " + (valueofSupply + vat));
		System.out.println("Expense : " + expense); // ����� 30%
		System.out.println("Income : " + income);
		
		double[] dividendRates = new double[3]; //double�� 3��¥�� ������ �迭 ����
		dividendRates[0] = 0.5;
		dividendRates[1] = 0.3;
		dividendRates[2] = 0.2;
		
		// while �ݺ������� ȿ��ȭ / �迭�� �Բ� �� ��, ȿ���� �ش�ȭ.
		int i = 0;
		while(i < dividendRates.length) {
			System.out.println("Dividend : " + (income * dividendRates[i]));
			i = i + 1;
		
		}
	}
	

}
