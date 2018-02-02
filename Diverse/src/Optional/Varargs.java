package Optional;

public class Varargs
{

	public static void varTest(int... no)
	{
		System.out.println("varTest(int...) enthält "+no.length+ " Elemente.");
		for (int n:no)System.out.print(n + " ");
		System.out.println();
	}
	
	public static void varTest(String msg, int...no)
	{
		System.out.println("varTest(String,int...) "+msg+ " hat " + no.length + " Fehltage.");
		for (int n:no)System.out.print(n + " ");
		System.out.println();
	}
	
	public static void main(String[] args)
	{
		varTest(1, 2, 3, 4 ,5);
		varTest("Max", 10, 11, 12);
		varTest("Karin", 8, 14, 21, 22, 28);
	}

}
