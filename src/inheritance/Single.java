package inheritance;

public class Single {
int a= 10;
int b= 20;
void display() {
	System.out.println(a+b);
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
b b1=new b();
//b1.getdata();
b1. display();
	}

}
class b extends Single {
	void getdata(){
		System.out.println(a*b);
		
	}
		
	
	
}