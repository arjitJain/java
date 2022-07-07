import java.util.Scanner;
public class BinaryCheck{

	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
	if(binaryChecker(num)==true){
		System.out.println("number is binary");
	}
	else{
		System.out.println("number is not binary");
	}
}
	public static boolean binaryChecker(int num){
		int digit;
	
		while(num !=0){
			digit = num%10;
			if((digit==0)||(digit==1)){
			
				num /=10;
			}
			else{
				return false;
			}
			
		}
		return true;	
		}
		
}

	101143011