package testdata;

public class Constructor {

	Constructor(){
		System.out.println("this is 0 args constructor");
	}
	Constructor(int a){
		System.out.println("a= "+ a);
		System.out.println("this is 1 args constructor");
	}
	Constructor(  int b, short a){
		System.out.println(a+ b);
		System.out.println("this is 2 args constructor");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Constructor a =new Constructor();
		Constructor a1 =new Constructor(10);
		Constructor a2 =new Constructor(10,(short)20);


	}

}
