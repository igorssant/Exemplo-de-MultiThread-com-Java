/* Dessincronizado */
public class MultiThread{
	/* Exemplo de execucao sequencial */
	public static void doNotUseMeBadExample(){
		BarraDeProgresso barra = new BarraDeProgresso();
		GerarRelatorio relatorio = new GerarRelatorio();
		
		barra.executa();
		relatorio.executa();
	} // end method doNotUseMeBadExample
	
	/* Exemplo de execucao MultiThread */
	public static void main(String[] args){
		BarraDeProgresso barra = new BarraDeProgresso();
		GerarRelatorio relatorio = new GerarRelatorio();
		Thread primeiraThread = new Thread(barra);
		Thread segundaThread = new Thread(relatorio);
		
		primeiraThread.start();
		segundaThread.start();
	} // end method main
} // end class MultiThread
