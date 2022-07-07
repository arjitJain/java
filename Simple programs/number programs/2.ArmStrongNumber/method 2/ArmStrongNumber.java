import java.lang.Math;
import java.util.Scanner;
public class ArmStrongNumber{
		public static void main(String args[]){
			Scanner sc = new Scanner(System.in);
			int num,armNumber;
			num = sc.nextInt();
			armNumber = Calculator(num);
			if(armNumber == num){
				System.out.println("Arm number");
			}
			else{
				System.out.println("not an arm number");
			}
		}
		public static int Calculator(int num){
			int digits,exponentSum=0,digit;
			digits = countDigits(num);
			while(num!=0){
				digit = num%10;
				exponentSum = (int)(exponentSum + Math.pow(digit,digits));
				num /=10; 
			}
			return exponentSum;
		}
		public static int countDigits(int num){
			int digits=0;
			while(num!=0){
				num=num/10;
				digits++;
			}
			return digits;
		}
}