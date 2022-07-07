import java.util.Scanner;
public class PerfectNumber{

	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		if(perfectNumber(num)==num){
			System.out.println("perfect Number");
		}
		else{
			System.out.println("not a perfect Number");
		}
	}
	public static int perfectNumber(int num){
		int sum=1;
		for(int i = 2;i<num;i++)
		{
			if((num%i)==0){
				sum=sum+i;
			}
		}
		return sum;
	}
}
