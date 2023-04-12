package testdata;

public class Sort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    int a[]= {20,50,60,10, 5};
    int temp;
    
    for(int i=0; i<a.length; i++) {
    	for(int j=0;j<a.length; j++) {
    		if (a[j]>a[i]) {
    			temp=a[j];
    			a[j]=a[i];
    			a[i]=temp;
    		  }
    
    }
    	
    }
    	
	for (int i= 0; i<a.length; i++)
    {System.out.println(a[i]);
    }
}}
