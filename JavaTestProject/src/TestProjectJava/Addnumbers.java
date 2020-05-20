package TestProjectJava;

public class Addnumbers {

	int a,b;
	
	public int Sum(int a1 , int b1)
	{
		
		a = a1;
		b = b1;
		
		int sum = a + b;
		return sum;
		
	}
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Addnumbers obj = new Addnumbers();
		
		int add = obj.Sum(2, 34);
		
		System.out.println("Sum :" + add);
	}
	
	
	
	
}
