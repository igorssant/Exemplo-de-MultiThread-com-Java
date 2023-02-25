public class ThreadSincronizado{
	public static void main(String[] args) throws InterruptedException{
		Conta conta = new Conta("Emanuel", 15, "Rua do Louro");
		Deposito acao = new Deposito(conta);
		Thread thread = new Thread(acao);
		Thread novaThread = new Thread(acao);

		thread.start();
		novaThread.start();

		thread.join();
		novaThread.join();
	} // end method main
} // end class
