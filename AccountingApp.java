
public class AccountingApp {

	public static void main(String[] args) {
		// 10000.0의 값을 -> search > replace all로 값을 한번에 바꿀 수 있음.
		System.out.println("Value of supply = "+12345.0); //double형 데이터
		System.out.println("VAT : " + (12345.0 * 0.1));
		System.out.println("Total : " + (12345.0 + 12345.0 * 0.1));
		System.out.println("Expense : " + (12345.0 * 0.3)); // 비용은 30%
		System.out.println("Income : " + (12345.0 - 12345.0*0.3));
		System.out.println("Dividend1 : " + (12345.0 - 12345.0*0.3)*0.5);
		System.out.println("Dividend2 : " + (12345.0 - 12345.0*0.3)*0.3);
		System.out.println("Dividend3 : " + (12345.0 - 12345.0*0.3)*0.2);
	}
	

}
