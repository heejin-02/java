
import java.util.Scanner; //ScannerŬ���� ����


public class AreaTest {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		double radius; //������ ����
		final double PI = 3.141592; //��� ����
		System.out.print("�������� �Է��ϼ���.: ");
		radius = input.nextDouble();
		double area = radius * radius * PI; //���� ����
		System.out.println("��������"+radius+"�� ���� ������"+area+"�Դϴ�.");

	}

}