import java.util.Scanner;
public class ReverseAnyNumber{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int reverse=0;
		while(num!=0){
		reverse = reverse * 10 + num %10;
		num = num/10;
		}
		System.out.print("reverse is"+reverse);
		


	}
	/*public static int countDigits(int num){
		int count = 0,multiple = 1;
		while(multiple<num){
			count++;
			multiple *= 10;
		}
		return count;
	}*/
}