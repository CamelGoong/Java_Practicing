
public class AccountingArrayLoopApp {

	public static void main(String[] args) { //String[] 문자열로 요소를 가지는 배열
		// 10000.0의 값을 -> search > replace all로 값을 한번에 바꿀 수 있음.
		double valueofSupply = Double.parseDouble(args[0]); // 우클릭해서 refactor > extract local variable 기능 이용 / 들어온 문자형을 더블로 바꿈
		double vatRate = 0.1;
		double expenseRate = 0.3;
		double vat = valueofSupply * vatRate;
		double expense = valueofSupply *expenseRate;
		double income = valueofSupply - expense;
	
		System.out.println("Value of supply = "+valueofSupply); //double형 데이터
		System.out.println("VAT : " + vat);
		System.out.println("Total : " + (valueofSupply + vat));
		System.out.println("Expense : " + expense); // 비용은 30%
		System.out.println("Income : " + income);
		
		double[] dividendRates = new double[3]; //double형 3개짜리 데이터 배열 선언
		dividendRates[0] = 0.5;
		dividendRates[1] = 0.3;
		dividendRates[2] = 0.2;
		
		// while 반복문으로 효율화 / 배열과 함께 쓸 때, 효과가 극대화.
		int i = 0;
		while(i < dividendRates.length) {
			System.out.println("Dividend : " + (income * dividendRates[i]));
			i = i + 1;
		
		}
	}
	

}
