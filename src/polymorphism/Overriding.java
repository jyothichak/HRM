package polymorphism;

public class Overriding {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   B b=new B();
     b.Log(10, 20);
   
   
		   
	}

}
class X{
	void Log(int a, int b) {
		
		System.out.println(a+b);

	}
}
	
	class B extends X{
	void Log(int a, int b) {
		System.out.println(b); 
			
		}
	}
	
	

