import java.util.Scanner;
import java.lang.Math;
public class ArmStrongNumber{
	public static void main(String []args){
		int num,armNumber;
		Scanner sc = new Scanner(System.in);
		num  = sc.nextInt();
		 armNumber = armStrongCalculator(num);
		if(armNumber == num){
			System.out.println("number is armStrong");
			}
		else{
			System.out.println("number is not armStrong");
		}
		}
				public static int armStrongCalculator(int num){
			int digitCubeSum=0,digit,powerDigit;
			int digits = countDigits(num);
			while(num!=0){
				digit = num%10;
				powerDigit = (int)Math.pow(digit,digits);
				digitCubeSum += powerDigit;
				num /= 10;
			}
			return digitCubeSum;
	}
	public static int countDigits(int num){
		int count = 0,multiple = 1;
		while(multiple<num){
			count++;
			multiple *= 10;
		}
		return count;
	}
}