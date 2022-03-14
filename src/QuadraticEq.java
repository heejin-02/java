import java.util.Scanner;

public class QuadraticEq {
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		float b;
		float c;
		float solution;
		System.out.print("b를 입력하세요: ");
		b = input.nextFloat();
		
		System.out.print("c를 입력하세요.: ");
		c = input.nextFloat();
		
		solution = (float) (-b+Math.sqrt((b*b)-4*c)/2); //근 구하기
		System.out.println(solution);

	}

}
