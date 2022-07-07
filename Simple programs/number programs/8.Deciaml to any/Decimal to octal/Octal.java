import java.util.Scanner;
public class Octal{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		decimalToOctal(num);
	}
	public static void decimalToOctal(int num){
		int arr[] = new int[100];
		int count=0,rem;
		while(num!=0){
			rem = num%8;
			arr[count] = rem;
			count++;
			num /=8;
		}
		int j = count-1;
		while(j>=0){
			System.out.println(arr[j]);
			j--;
	}
}
}