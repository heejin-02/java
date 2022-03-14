import java.util.Scanner;
public class LeapYear {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
	
		int year;
		System.out.print("연도를 입력하세요:");
		year = input.nextInt();
		System.out.println("윤년결과:"+(year % 4 == 0));
		
	}
}
