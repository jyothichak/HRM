package interfaceclass;

public class multiinterface {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  z z1= new z();
     z1.add();
     z1.sub();
	}}
	interface x{
		int a=20;
		void add();
		void sub();
	}
	interface y {
		void sub();
		void add();
	}

class z implements x,y{
int b=50;
	
	@Override
	public void add() {
		// TODO Auto-generated method stub
		System.out.println(a+b);
	}

	@Override
	public void sub() {
		// TODO Auto-generated method stub
		System.out.println(a-b);
		


}}
