package Optional;

public class PersonTest
{

	public static void main(String[] args)
	{
		Person heinz = new Person();
		System.out.println(heinz.getSpouse().isPresent());
		
		Person eva = new Person();
		System.out.println(heinz.getSpouse().isPresent());
		
		heinz.setSpouse(eva);
		System.out.println(heinz.getSpouse().isPresent());
		
		heinz.remove();
		System.out.println(heinz.getSpouse().isPresent());

	}

}
