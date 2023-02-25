public class BarraDeProgresso  implements Runnable{
	/* Nao Use. Exemplo Ruim*/
	public void executa(){
		for(int i = 0; i < 100000; ++i){
			System.out.println("Barra subindo!");
		}
		System.out.println("Barra finalizada!");
	}
	
	@Override
	public void run(){
		for(int i = 0; i < 100; ++i){
			System.out.println("Barra subindo...\t[ " + i + " ] porcento.");
		}
		System.out.println("Barra finalizada!");
	}
}
