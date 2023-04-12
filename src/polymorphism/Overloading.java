package polymorphism;

public class Overloading {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 
	Overloading obj= new Overloading();
		 int result=obj.add(10, 20);
		 System.out.println(result);
		
}

int add(int b, int a) {
	 return a+b;
	
}
int add(int a , int b, int c) {
	return a+b+c;
}
float ad( float a , int b) {
	return a+b;
}
float add(int a, float b) {
	return a+b;
}}