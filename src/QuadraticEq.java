import java.util.Scanner;

public class QuadraticEq {
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		float b;
		float c;
		float solution;
		System.out.print("b�� �Է��ϼ���: ");
		b = input.nextFloat();
		
		System.out.print("c�� �Է��ϼ���.: ");
		c = input.nextFloat();
		
		solution = (float) (-b+Math.sqrt((b*b)-4*c)/2); //�� ���ϱ�
		System.out.println(solution);

	}

}
