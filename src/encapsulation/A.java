package encapsulation;

public class A{
	private int a;
	private int b;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
A a=new A();
a.setData(10, 20);
a.getData();}
void setData(int a, int b) {
	this.a= a;
	this.b= b;
}
void getData() {
	System.out.println(a+b);
}}
	



	
