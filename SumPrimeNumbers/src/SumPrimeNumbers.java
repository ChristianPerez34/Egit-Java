import java.util.Scanner;

public class SumPrimeNumbers {

	public static void main(String[] args) {
		//Sums the primes between two primes including said primes
		Scanner input = new Scanner(System.in);
		int K = input.nextInt();
		int J = input.nextInt();
		int sum = 0;
		while (K < J){
			if(isPrime(K) == true){
				sum += K;
				K++;	
			} else
				K++;
		}
		input.close();
		System.out.println(sum + J);
		
	}
	
	public static boolean isPrime(int num) {
        if (num < 2)
        	return false;
        if (num == 2)
        	return true;
        if (num % 2 == 0)
        	return false;
        for (int i = 3; i * i <= num; i += 2)
            if (num % i == 0)
            	return false;
        return true;
}

}

