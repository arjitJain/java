import java.util.Scanner;
public class PrimeNumber{
	public static void main(String args[]){
		int num;
		Scanner sc = new Scanner(System.in);
		num = sc.nextInt();
		if(primeChecker(num))
		{
			System.out.println("prime");
		}
		else{
			System.out.println("not a prime");
		}
		
	}
	public static boolean primeChecker(int num){
	for(int i=2;i*i<num;i++){//either i*i or num/2 for optimisation
		if(num%i==0){
            return false;
		}
				
	}
	return true;

}}