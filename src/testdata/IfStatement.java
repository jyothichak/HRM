package testdata;

public class IfStatement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int a= 10;
if (a>18) {
	System.out.println("eligible");
}
else { 
	System.out.println("not eligible");
	
}
int x=50;
int y=20;
int z=30;
if(x>y && x>z) {
	System.out.println("x is greater");
}
else if(y>x && y>z){
	System.out.println("y is greater");
}
else{
	System.out.println("z is greater");
}
String bank = "SBI";
if(bank =="HDFC") {
	System.out.println("welcome to HDFC bank");}
else if (bank =="RBI") {
	System.out.println("welcome to RBI");}
else if(bank=="ICICI") {
		System.out.println("welcome to ICICI bank");}
else{
	System.out.println("welcome to SBI bank");	
		}
	}
	
	

	}


