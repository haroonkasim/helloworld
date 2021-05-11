
public class Calc {
	
	public static void main(String[] args)
	{
		int no = 10;
		System.out.println("no = " + no);
		int x = no++; // Frst Assign then increment
		System.out.println("x = " + x + " no = " + no);
		int y = ++no; // Frst Increment then Assign
		System.out.println("y = " + y + " no = " + no);
		
		int div = 10/5;
		System.out.println("div = "+ div);
		int div1 = 10%5;
		System.out.println("div1 = "+ div1);
		
		float a = 0.0f/0.0f;
		System.out.println("a = "+ a);
		
		System.out.println(10/0.0);
		System.out.println(-10/0.0);
		

	}

}
