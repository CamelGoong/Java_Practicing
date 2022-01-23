import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;

public class InstanceApp {

	public static void main(String[] args) throws IOException {
		
		PrintWriter p1 = new PrintWriter("result1.txt"); // Instance, 지금 new 오른쪽의 PrintWriter는 constructor(생성자)임.
		p1.write("Hello 1");
		p1.close();
		
		PrintWriter p2 = new PrintWriter("result2.txt");
		p2.write("Hello 2");
		p2.close();
		
		System.out.println(p2.toString()); // Object class에서 상속받은 메소드인 .toString을 사용. (extend) / 또한 동일한 이름의 메소드를 내가 조금 변경할 수 있는데 이는 (override)라고 함.
		
	}
}
