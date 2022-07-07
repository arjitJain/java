import java.util.Scanner;
public class GreatestInThreeIntegers{
	public static void main(String args[]){
		int a,b,c;
		Scanner sc = new Scanner(System.in);
		a = sc.nextInt();
		b = sc.nextInt();
		c = sc.nextInt();
		greatestInThreeIntegers(a,b,c);
	}
		public static void greatestInThreeIntegers(int a ,int b,int c){
			int max = Integer.MAX_VALUE;
			int min = Integer.MIN_VALUE;
			if(a>= min)
			{min = a;}
			if((b  > min) && (b > c)){
				System.out.println("max is b");
			}
			else if((c  > min) && (c > b)){
				System.out.println("max is c");	
			}
			else{
			System.out.println("max is a");	 			
		}
}
}