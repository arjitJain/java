import java.util.Scanner;
public class Factorial{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		factorial(num);

	}
	public static void factorial(int num){
		int fact=1;
		for(int i=num;i>0;i--){
			fact=fact*i;

		}		System.out.print(fact);
	}
}