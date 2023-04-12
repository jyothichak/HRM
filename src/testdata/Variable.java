package testdata;

public class Variable {
	int a =10;
	static int b=20;
	 void increment() {
		b=b +1;
		a=a+1;
		System.out.println( "a= " +a+10+" "+"b="+b+10);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Variable obj =new Variable();
		obj.increment();
		Variable obj1 =new Variable();
		obj1.increment();
		//Variable obj2 =new Variable();
		//obj3.increment();
		
		

	}

}
