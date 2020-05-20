package TestProjectJava;

public class TestFunction {

		int a = 10, b = 20;

		

		//accessModifier  returnType methodName(Parameters)
		public int add(int d , int e)
		{
		int result = d + e;
		return result;
        //return Statement  
		}


		//accessModifier  returnTypeNothing methodName(Parameters)
		public void multiply()

		{
		int x = 20;

		int y = 30;

		System.out.println(x*y);


		}
	
	
		public int multiply(int a , int b, int c)
		{
			int result = a*b*c;
			
			return result;
			
		}
	
		//accessModifier  returnTypeNothing methodName(Parameters)
		public void compare(int b, int c)

		{
		 if (b>c)
		 {
			 
		   System.out.println("b is greater");	 
		 }
		 else
		 {
			 
		   System.out.println("c is greater");	 
		 }	

		


		}
		
		public static void main(String args[])
		{

		TestFunction obj1 = new TestFunction();

		
		//dataType variablename = object.methods(values for PArameters)
		obj1.add(30, 70);

		obj1.multiply();

		System.out.println("Sum Value = " + obj1.add(30, 70));

		int y = obj1.multiply(30, 70,10);
		System.out.println(y);

		obj1.compare(30, 40);
		}
		
		
}
