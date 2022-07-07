import java.util.Scanner;
public class PrimeFactors{

	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();

			primeFactors(num);
	}

     public static void primeFactors(int number){
      for(int i = 2; i< number; i++) {
         while(number%i == 0) {
            System.out.println(i+" ");
            number = number/i;
         }
      }
      if(number >2) {
         System.out.println(number);
      }
   }
}
