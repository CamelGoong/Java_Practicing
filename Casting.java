
public class Casting {
	public static void main(String[] args)
	{
		double a = 1.1;
		double b = 1; // b�� integer������, double b�� ��涧, �ڵ����� double������ converting�� �Ǿ���.
		System.out.println(b);
		
//		int c = 1.1; // double�� data�� integer ������ ���� �� ����(Casting ����)
		
		double d = 1.1;
		int e = (int) 1.1; // 1.1�� ������ integer�� �ٲ��ִ� ��.
		System.out.println(e); // ������Ѻ��� 1.1 -> 1.0 ������ integer�� �ٲٴٺ���, 0.1��ŭ�� �ս��� �߻�����. 
		
		String f = Integer.toString(1); // Integer -> String���� ��ȯ
		System.out.println(f);
		System.out.println(f.getClass()); // getclass(): data�� return type�� �˷���
		
	}
}
