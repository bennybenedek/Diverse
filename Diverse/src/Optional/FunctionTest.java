package Optional;

import java.util.function.Function;

public class FunctionTest
{

	public static void main(String[] args)
	{
		Function<Integer, String> function = (t) -> 
		{
			if (t%2 == 0) return t + " ist eine gerade Zahl.";
			else return t + " ist eine ungerade Zahl.";
		};
		
		System.out.println(function.apply(5));
		System.out.println(function.apply(8));
		
		
		Function<Integer, Integer> function1 = t -> (t - 10);
		Function<Integer, Integer> function2 = t -> (t * 2);
		
		System.out.println(function1.andThen(function2).apply(50));
		System.out.println(function1.compose(function2).apply(50));
		
		Function<Integer, Function<Integer, Integer>> function3 = x -> y -> x - y;
		
		Function<Integer, Integer> add1 = function3.apply(3);
		
		System.out.println(add1.apply(2));

	}

}
