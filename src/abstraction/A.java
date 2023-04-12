package abstraction;

public class A {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
c c1= new c();
c1. set(30, 40);
c1.set();
	}

}
abstract class b{
	int a =10;
	abstract void set();

}
class c extends b{

	void set(int a, int b) {
		System.out.println(a+b);
	}

	@Override
	void set() {
		// TODO Auto-generated method stub
	System.out.println(a);
	}
}