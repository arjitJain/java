import java.util.Scanner;
public class AddTwoNumbers{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);

		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		int num3 = num1+ num2;
		System.out.println(num3);
	}
}