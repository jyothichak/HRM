package testdata;

public class ArrayMax1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] m= {10, 40, 50, 70,};
		int maximum = m[0];
		for (int i=0; i< m.length; i++) {
			if (maximum< m[i]) {maximum= m[i];}}
			System.out.println(maximum);
		
		
		
			//System.out.println(maximum);
//		int a[]= {20, 30, 40, 50};
//		 int max = a[0]; 
//		for(int i=0; i< a.length; i++)
//		 if( max<=a[i]) {
//		 max=a[i];
//			}
//		System.out.println(max);
			
			int b[]= {100, 200, 800, 400};
			int big = b[0];
			for(int s=0; s<b.length; s++ ) {
				if(big< b[s]) {
					big= b[s];}
			}System.out.println(big);
					
					
					

				
			}
 }

