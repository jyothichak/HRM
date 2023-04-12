package polymorphism;

public class Over_area {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
     Over_area obj= new Over_area();
     
     int result= obj .area(60, 30);
     System.out.println(result);
     
     float  result1= obj .area(2.5f, 3.5f);
     System.out.println(result1);
     
	}
    int area(int b, int h) {//method
	return 1/2*(b*h);}//area of a triangle
    
		float area(float b, float h) {//method
			return 1/2*b* h;
	}
	
}

