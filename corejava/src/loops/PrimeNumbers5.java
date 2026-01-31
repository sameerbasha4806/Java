package loops;

public class PrimeNumbers5 {
	public boolean prime(int num) {
		int count=0;
		for(int i=1;i<=num;i++) {
			if(num%i==0) {
				count++;
			}
		}
		 return count==2;
	}
	public boolean getPrime(int num) {
		if(num<=1) {
			return false;
		}
		for(int i=2;i<=num/2;i++) {
			if(num%i==0) {
				return false;
			}
		}
		return true;
	   
	}
	
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
		boolean result=new PrimeNumbers5().prime(1);
		System.out.println(result?"The Number Is Prime":"Not A Prime Number");
		System.out.println("------------------------------------------------");
		
        PrimeNumbers5 obj2=new PrimeNumbers5();
		
//		for(int i=1;i<=100;i++) {
//			if(obj.getPrime(i)) {
//				System.out.println(i);
//			}
//		}
        
	System.out.println(obj2.getPrime(7)?"prime number":"not a prime");
	System.out.println("------------------------------------------------");
	PrimeNumbers5 obj3 = new PrimeNumbers5();
	for(int i=1;i<=50;i++) {
		if(obj3.isPrime(i)) {
			System.out.println(i);
		}
	}

	}

}
