package testdata;

public class StaticInnerClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		outer.b obj= new outer.b();
		obj.display();		

	

	}
	class outer{
		static  class b{ 
		  void display() {
			System.out.println(1);
		}
	}}}
