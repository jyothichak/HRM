package example;

public class ArryMax {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {10 ,5,30, 20, 60 , 4};
		int temp;
		for(int i=0;i<a.length; i++) {
			for(int j=i;j<a.length;j++) {
			
					if(a[i]>a[j]) {
				temp=a[i];
				a[i]=a[j];
				a[j] =temp;
				}}}
		for(int i=0;i<a.length;i++) {
			System.out.println(a[i]);
		}
			
			
		}
	}

