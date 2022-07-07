import java.util.Scanner;
public class FibonacciSeries{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int num;
		num = sc.nextInt();
		Fibonacci(num);
	}
	public static void Fibonacci(int num){
		int a=0,b=1,c;
         System.out.println(a);
		System.out.println(b);
		for(int i=0;i<num-2;i++){
			c=a+b;
			System.out.println(c);
			a=b;
			b=c;
		}

	}
}