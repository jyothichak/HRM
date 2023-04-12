package superKeyword;

public class A {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//x x1=new x(10);
		y y1= new y();
		
	}

}
class x{
	x(){
		System.out.println("0 arg constructor ");
	}
	x(int a){
		System.out.println("1 arg constructor ");
	}
}
class y extends x{
	y(){
	super(20);
		System.out.println("child constructor");
	}
}