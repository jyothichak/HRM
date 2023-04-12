package testdata;

public class Oop {
void oop() {
	int a=1;
	System.out.println("This  is parent"+ " a="+a);
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
C c=new C();
D d=new D();
c.print();
c.getdata() ;
c.show() ;
d. display();
d.print();
c.oop();
d.oop();
		
	}

}
class A extends Oop{
	void print() {
		System.out.println("this is childA");
	}
}
class B extends A{
	void getdata() {
		System.out.println("this is child B");
		
	}
}
class C extends B{
	void show() {System.out.println("this is sub child of B");
	
		
	}
}
class D extends A{
	void display() {
		System.out.println("this is another class of A");
	}
}