import java.util.Scanner;
public class Prime{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int count = 0;
		for(int i=2;i<=num+20;i++){
		if(isPrime(i))
		{	count++;
			System.out.println(i);
			if(count == num) break;
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







/*ip: 5
op: 2,3,5,7,11,13
n prime number
count = 0 
for---- i = 2 to num+10
	for(j=2;j<i;j++)
		if(i%j==0)....not prime
		else prime*/