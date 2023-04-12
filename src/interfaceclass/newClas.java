package interfaceclass;

public class newClas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	


b b1=new b();
b1.addUser().deleteUser().editUser();
b1.deleteUser();
b1.editUser();


}}

interface InterfaceDemo {
	b addUser();
	b deleteUser();
	b editUser();
}
	
class b implements InterfaceDemo{

	@Override
	public b addUser() {
		// TODO Auto-generated method stub
		System.out.println("addUser");
		return this;
	}

	@Override
	public b deleteUser() {
		// TODO Auto-generated method stub
		
		System.out.println("deleteUser");
		return this;
	}

	@Override
	public b editUser() {
		// TODO Auto-generated method stub
		System.out.println("editUser");
		return this;
		
	}	}

