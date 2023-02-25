public class GerarRelatorio implements Runnable{
	/* Nao Use. Exemplo Ruim*/
	public void executa(){
		for(int i = 0; i < 100000; ++i){
			System.out.println("Gerando relatório!");
		}
		System.out.println("Relatório finalizado!");
	}
	
	@Override
	public void run(){
		for(int i = 0; i < 100; ++i){
			System.out.println("Gerando relatório...\t[ " + i + " ] porcento.");
		}
		System.out.println("Relatório finalizado!");
	}
}
