import java.util.ArrayList;
import java.util.function.COnsumer;

public class LambdaDois{
	public static void main(String[] agrs){
		ArrayList<Integer> numeros = new ArrayList<>();
		Consumer<Integer> consumer = lambda -> System.out.println(lambda);
		
		for(int i = 0; i < 11; ++i){
			numeros.add(i);
		}

		numeros.forEach(num -> {
			System.out.println(num);
		});
		
		numeros.forEach(consumer);
	}
}
