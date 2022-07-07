import java.util.Scanner;
public class palindrome{
	public static void main(String [] args){
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int reverse = reverse(num);
		if(num == reverse){
			System.out.println("number is palindrome");
		}
		else{
			System.out.println("Number is not a palindrome");
		}
	}
	public static int reverse(int num){
		int reverse = 0;
		while(num!=0){
			reverse = reverse*10 + num%10;
			num /=10; 
		}
		return reverse;

	}
}