package TestProjectJava;

public class Class1 {

	public static int a = 20;
	public int b = 30;
	char c = 'H';
	
	public static int d=100 ,e =30;
	public void add()
	{
		
		int result;
		result = a+b;
		System.out.println("Sum of a and b : " + result);
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Class1 obj = new Class1();
		obj.add();
		int f = 15;
		System.out.println(f);
		
		if(f<a)
		{
			
			System.out.println("Hello");
			
			
		}
		else 
		{
			
			System.out.println("World");
		}
		
		for(int i=1;i<=5;i++)
		{
			if(i!=4)
			{
				System.out.println(i);
		    }
		
		}
		
	}

}
