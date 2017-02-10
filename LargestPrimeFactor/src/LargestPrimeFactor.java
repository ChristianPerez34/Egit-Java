
public class LargestPrimeFactor {

	public static void main(String[] args) {
		long number = 600851475143L;
		int largestPrime = 0;
		int squareRoot = (int) Math.sqrt(number);
		for( int i = 2; i <= squareRoot; i++){
			if(isPrime(i) && number % i == 0)
				largestPrime = i;
		}
		System.out.println(largestPrime);
		
	}
	
	public static boolean isPrime(int num){
		if (num < 2)
			return false;
		if (num == 2)
			return true;
		if (num % 2 == 0)
			return false;
		for(int i = 3; i * i <= num; i += 2)
			if (num % i == 0)
				return false;
		return true;
	}

}
