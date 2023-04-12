package abstraction;

public class User {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
newUser n= new newUser	();
n.addUser("jyo", "chak", 122); }

}
 abstract class U{
	 U(){
		 System.out.println(" class u constructor");
	 }
	abstract void addUser(String Fname, String Lname,  int Number);
	 
 }
 class newUser extends U{
	 newUser(){
		 System.out.println("new user constructor");
	 }

	@Override
	void addUser(String Fname, String Lname, int Number) {System.out.println("sam");}
void printdata() {
		
	}
	void addUser(String Fname, String Lname, int Number, String address) {
		System.out.println("shree");
		System.out.println("kris");
		System.out.println("765");
		System.out.println("abc");
			
 }
}