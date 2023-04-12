package testdata;

public class Sort1 {
	

		public static void main (String[] args) {
			int a[]= {9, 6,3,8,4,1,2,7};
			int sort;
			for( int i=0; i<a.length; i++) {
				for(int s=i;s<a.length;s++) {
					if(a[i]<a[s]) {
						sort=a[i];
						a[i]=a[s];
						a[s]=sort;
					}
				}
				
			}for (int i=0; i<a.length; i++) {
				System.out.println(a[i]);
			}
}}
