
import java.util.Scanner; //Scanner클래스 포함


public class AreaTest {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		double radius; //반지름 저장
		final double PI = 3.141592; //상수 파이
		System.out.print("반지름을 입력하세요.: ");
		radius = input.nextDouble();
		double area = radius * radius * PI; //넓이 저장
		System.out.println("반지름이"+radius+"인 원의 면적은"+area+"입니다.");

	}

}