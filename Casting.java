
public class Casting {
	public static void main(String[] args)
	{
		double a = 1.1;
		double b = 1; // b는 integer이지만, double b에 담길때, 자동으로 double형으로 converting이 되었음.
		System.out.println(b);
		
//		int c = 1.1; // double형 data는 integer 변수에 담을 수 없음(Casting 문제)
		
		double d = 1.1;
		int e = (int) 1.1; // 1.1을 강제로 integer로 바꿔주는 것.
		System.out.println(e); // 실행시켜보면 1.1 -> 1.0 강제로 integer로 바꾸다보니, 0.1만큼의 손실이 발생했음. 
		
		String f = Integer.toString(1); // Integer -> String으로 변환
		System.out.println(f);
		System.out.println(f.getClass()); // getclass(): data의 return type을 알러줌
		
	}
}
