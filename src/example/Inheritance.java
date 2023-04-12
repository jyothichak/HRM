package example;

public class Inheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 child c=new  child ();
		//c.print();
		c.getdata();
	}

}
class parent {
	int a=10;
	int b =20;
	void print() {
		System.out.println(a+b);
	}}
		
	class child extends parent {
		void getdata() {
			System.out.println(a);
			print();
		}
		
	}
