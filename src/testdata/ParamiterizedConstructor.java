package testdata;

public class ParamiterizedConstructor {
 
	String  studentName;
	int rollNumber;
	ParamiterizedConstructor (String name , int  number){
		 studentName = name;
		 
		 rollNumber= number;
	}
	//void printdata() {
	//	System.out.println("Name = " +studentName + " no = "+rollNumber );}
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 ParamiterizedConstructor p1=new  ParamiterizedConstructor ( "jo", 10);
		// ParamiterizedConstructor p2=new  ParamiterizedConstructor ( "co", 20);
		 System.out.println(p1.studentName+" "+p1.rollNumber);
		

	}

}
