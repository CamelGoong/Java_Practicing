import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;

public class InstanceApp {

	public static void main(String[] args) throws IOException {
		
		PrintWriter p1 = new PrintWriter("result1.txt"); // Instance, ���� new �������� PrintWriter�� constructor(������)��.
		p1.write("Hello 1");
		p1.close();
		
		PrintWriter p2 = new PrintWriter("result2.txt");
		p2.write("Hello 2");
		p2.close();
		
		System.out.println(p2.toString()); // Object class���� ��ӹ��� �޼ҵ��� .toString�� ���. (extend) / ���� ������ �̸��� �޼ҵ带 ���� ���� ������ �� �ִµ� �̴� (override)��� ��.
		
	}
}
