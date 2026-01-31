package inheritance;

class X{
	int a;
	public X(int a) {
		this.a=a;
		System.out.println("This is x constructor");
	}

	}
	
class Y extends X{
	public Y(int a) {
		super(a);
		System.out.println("This is y constuctor");
	}
}
class Z extends Y{
	public Z() {
		super(23);
		System.out.println("This is z constuctor");
	}
}

public class Example1 {

	public static void main(String[] args) {
//	X x=new Z();
	Z z=new Z();
     System.out.println(z.a);
	}

}
