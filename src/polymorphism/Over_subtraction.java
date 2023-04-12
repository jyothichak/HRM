package polymorphism;

public class Over_subtraction {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Over_subtraction sub=new Over_subtraction();
		float result= sub.sub(10, 5f);
		System.out.println(result);
		int result1=sub.sub(30,10 );
		System.out.println(result1);
	}
	int sub(int a, int b) {
		return a-b;}
	float sub (int a, float b) {
			return a-b;
		

}}
