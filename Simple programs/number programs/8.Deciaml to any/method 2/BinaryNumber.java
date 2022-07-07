import java.util.Scanner;
public class BinaryNumber{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		binary(num);
	}
	public static void binary(int num){
		int rem,bin,i=0;
		int arr[] = new int [10];
		while(num!=0){
			rem = num %2;
			arr[i] = rem;
			i++;
			num /=2;
		}
			int j = i-1;
		while(j>=0){
			System.out.println(arr[j]);
			j--;
		}


		}
	}
