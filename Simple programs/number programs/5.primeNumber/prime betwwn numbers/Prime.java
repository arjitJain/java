import java.util.Scanner;
public class Prime{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();

		for(int i=num1;i<=num2;i++){
		if(isPrime(i))
		{
			System.out.println(i);
		}
	}
	}
	public static boolean isPrime(int num){

	for(int i=2;i<num;i++){
		if(num%i==0){
			return false;
		}	
	}
	return true;
	}
}
