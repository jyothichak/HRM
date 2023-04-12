package testdata;

public class ArrayMax {

	public static void main(String[] args) {
		
		//to find the max number
//int a[]= {20, 30, 40, 50};
// int max = a[0]; 
// for(int i=0; i< a.length; i++)
 //if( max<=a[i]) {
//	 max=a[i];
	
// }System.out.println(max);
	//array size
	//int b[]= new int[10]; 
	//b[0]=20;
	//b[8]=70;
	//for(i=0; i<=10; i++) {
		//System.out.println(b[i]);
 
	//to find the min number
	int b[]= {2,3,6,8};
	int min= b[0];
	for(int i=1; i<b.length; i++) {
		if (min>b[i]) {min= b[i];
	}}
	System.out.println(min);
	
	int x[]= {5, 10, 15};
	int sum =0;
	for (int i=0; i<x.length; i++) {
		sum+=x[i];
	}System.out.println(sum);
	System.out.println("stop");
	int z[]= new int [10];
	z[0] =10;
	z[2]=30;
	z[8]= 50;
	for( int i = 0; i<=z.length;i++) {
		System.out.println(z[i]);
	}
		
		
		
		}
}
	
	
	
	



