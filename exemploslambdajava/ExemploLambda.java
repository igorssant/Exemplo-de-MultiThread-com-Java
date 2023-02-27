
import java.util.ArrayList;
import java.util.Comparator; // Import errado
import java.util.Consumer;

public class ExemploLambda{
	public static void main(String[] args){
		ArrayList<Integer> numeros = new ArrayList<>();
		// Abaixo esta incorreto
		Comparator<Integer> comparar = new Consumer<>(){
			/* Exemplo de clase anonima */
			@Override
			public void accept(int numero){
				System.out.println(num);
			}
		};

		for(int i = 0; i < 16; ++i){
			numeros.add(2 * (i + 5) - 8);
		}

		/* Funcao lambda abaixo */
		numeros.forEach((int num) -> {
			System.out.println(num);
		});

		/* Forma 2 de acima */
		numeros.forEach(num -> {
			System.out.println(num);
		});
	} // endo of method main
} // end of class ExemploLambda
