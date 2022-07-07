import java.util.Scanner;
public class Binary{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		System.out.println(binaryNumber(num));
	}
	public static int binaryNumber(int num){

			int rem,c=1,bin=0;
			while(num!=0){
				rem = num%2;
				bin = bin + rem*c;
				c *= 10;
				num /= 2;

			}
			return bin;
	}
}

/*	 public static int binary(int num){
	 	int sum=1,i=0;

	 		while(num!=0){

	 			if(num%2==0){
	 			sum = 10*i+sum;
	 			num = num/2;
	 			i=1;
	 		}
	 		else if (num%2 != 0){
	 			sum= 10*sum;
	 			num = num/2;
	 			i=1;
	 	
 
	 		}
	   
		}
		return sum;
		*/

