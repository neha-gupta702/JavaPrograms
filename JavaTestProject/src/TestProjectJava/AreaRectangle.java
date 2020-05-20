package TestProjectJava;

public class AreaRectangle {

	int length;
	int width;
	int Area;
	
	public int Area(int len , int wid)
	{
		
		length = len;
		width = wid;
		return Area = len*wid;
		
	}
	
	public static void main(String args[])
	{
		AreaRectangle obj = new AreaRectangle();
		
		int a = obj.Area(10,20);
		
		System.out.println("Area of Rectangle:" + a);
		
		
	}
	
	
}
