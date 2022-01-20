public class Datatype{
	public static void main(String[] args) {
		System.out.println(6); // Number, java에서는 이렇게 " " 없이 그냥 숫자를 넣어도 프린트 됨
		System.out.println("six"); // String
		
		System.out.println("6"); // String
		
		System.out.println(6+6); // 12
		System.out.println("6" + "6"); // 66, (+) 문자를 위한 결합연산자
		System.out.println(6*6); // 36
//		System.out.println("6"*"6");
		
		System.out.println("1111".length()); // length(): 문자열의 길이를 알려주는 연산
//		System.out.println(1111.length()); // 숫자에서는 length() 연산이 존재하지 않음
	}
}