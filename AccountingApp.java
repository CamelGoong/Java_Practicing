
public class AccountingApp {

	public static void main(String[] args) {
		// 10000.0�� ���� -> search > replace all�� ���� �ѹ��� �ٲ� �� ����.
		System.out.println("Value of supply = "+12345.0); //double�� ������
		System.out.println("VAT : " + (12345.0 * 0.1));
		System.out.println("Total : " + (12345.0 + 12345.0 * 0.1));
		System.out.println("Expense : " + (12345.0 * 0.3)); // ����� 30%
		System.out.println("Income : " + (12345.0 - 12345.0*0.3));
		System.out.println("Dividend1 : " + (12345.0 - 12345.0*0.3)*0.5);
		System.out.println("Dividend2 : " + (12345.0 - 12345.0*0.3)*0.3);
		System.out.println("Dividend3 : " + (12345.0 - 12345.0*0.3)*0.2);
	}
	

}
