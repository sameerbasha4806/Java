package loops;

public class Amstrong {
	public int getPower(int base, int exp) {
		int power=1;
		for(int i=1;i<=exp;i++) {
			power=power*base;
		}
		return power;
	}
	public int getCount(int num) {
		int count=0;
		while(num>0) {
			count++;
			num/=10;
		}
		return count;
	}
	public boolean getAmstrong(int num) {
		int temp=num;
		int count = getCount(num);
		int sum = 0;
		while(num>0) {
			int rem=num%10;
			sum=sum+ getPower(rem ,count);
			num/=10;
		}
		return temp==sum;
	}

	public static void main(String[] args) {
		boolean result=new Amstrong().getAmstrong(153);
		System.out.println(result?"It is Amstrong":"Not a Amstrong");
		
	}
}