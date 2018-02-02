package Optional;

import java.util.Optional;

public class OptionalTest
{

	public static void main(String[] args)
	{
		Optional<Integer> number = Optional.of(345);
		System.out.println(String.format("Number: %s", number.get()));
	}

}
