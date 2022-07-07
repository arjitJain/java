import java.util.Scanner;
public class HCF{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();

		hcf(num1);
	}
	public static void hcf(int num1){
		int hcf=1,j=0; 
		int arr[] = new int [10];
			for( int i=2;i<num1;i++){
				while(num1%i==0){
					arr[j] =i;

				num1 /=i;
				}
			
			}
			if(num1>2){
				arr[j] =num1;
				
			}
			j--;
			for(;j>=0;j--)
		System.out.println(arr[j]);

	}
}





