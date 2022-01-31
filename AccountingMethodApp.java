
public class AccountingMethodApp {

	public static double valueofSupply; // main 밖에서 전역변수로 선언
	public static double vatRate;
	
	public static void main(String[] args) {
		// 10000.0의 값을 -> search > replace all로 값을 한번에 바꿀 수 있음.
		
		valueofSupply = 10000.0; // 전역변수의 값을 입력
		vatRate = 0.1;
		
		double expenseRate = 0.3;
		double vat = getVAT();
		double expense = valueofSupply *expenseRate;
		double income = valueofSupply - expense;
		double dividend1 = income*0.5;
		double dividend2 = income*0.3;
		double dividend3 = income*0.2;
		
		System.out.println("Value of supply = "+valueofSupply); //double형 데이터
		System.out.println("VAT : " + vat);
		System.out.println("Total : " + (valueofSupply + vat));
		System.out.println("Expense : " + expense); // 비용은 30%
		System.out.println("Income : " + income);
		System.out.println("Dividend1 : " + dividend1);
		System.out.println("Dividend2 : " + dividend2);
		System.out.println("Dividend3 : " + dividend3);
	}

	// method를 만드는 코드
	public static double getVAT() {
		return valueofSupply * vatRate;
	}
	

}
