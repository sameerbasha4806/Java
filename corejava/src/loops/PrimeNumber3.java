package loops;

public class PrimeNumber3 {
	public boolean isPrime(int num) {
		if(num<=1) {
			return false;
		}
		for(int i=2;i<=(int)Math.sqrt(num);i++) {
			if(num%i==0) {
				
				return false;
			}
		}
		return true;
	}

	public static void main(String[] args) {
		PrimeNumber3 obj = new PrimeNumber3();
		for(int i=1;i<=50;i++) {
			if(obj.isPrime(i)) {
				System.out.println(i);
			}
		}
//		System.out.println(obj.isPrime(17)?"is a PrimeNumber":"Not a PrimeNumber");
	}

}
