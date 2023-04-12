package polymorphism;

public class Over_bank {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      bank sbi=new bank();
      sbi.login();
      bank1 hdfc= new bank1();
      hdfc.login();
      
	}

}
class bank{
	void login() {
		System.out.println("user name");

	     System.out.println("password");
	     System.out.println("submit");
	}
}
class bank1 extends bank{
	void login() {
	System.out.println("user name");
	System.out.println("password");
	System.out.println("phone number");
	System.out.println("submit");
}}