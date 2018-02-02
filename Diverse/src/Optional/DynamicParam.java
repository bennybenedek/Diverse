package Optional;

public class DynamicParam
{

	public static void anzeigen(String... strings)
	{
		for (int i = 0; i<strings.length; i++)
		{
			System.out.println(strings[i]);
		}
	}
	
	public static void main(String[] args)
	{
		anzeigen("Max", "Moritz");
		anzeigen("Susi", "Paula", "Rosi", "Katrin");
	}
	
}
