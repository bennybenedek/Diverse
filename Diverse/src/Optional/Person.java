package Optional;

import java.util.Objects;
import java.util.Optional;

public class Person
{

	private Person spouse = null;
	
	public Optional<Person> getSpouse()
	{
		return Optional.ofNullable(spouse);
	}
	
	public void setSpouse(Person spouse)
	{
		this.spouse = Objects.requireNonNull(spouse);
	}
	
	public void remove()
	{
		spouse = null;
	}

}
