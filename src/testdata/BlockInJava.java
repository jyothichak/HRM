package testdata;

public class BlockInJava {
	static {
		int a =2;
		int b=3;
		System.out.println(a+b);
		System.out.println("this is staic block");}
	{
		System.out.println("a+b");
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("start main");
		BlockInJava obj =new BlockInJava();
		System.out.println("end main");
		
	}
	}


