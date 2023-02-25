public class Deposito implements Runnable{
	private Conta conta;

	public Deposito(){/* Construtor vazio */}

	public Deposito(Conta _conta){
		this.conta = _conta;
	} // end method fazDeposito

	@Override
	public void run(){
		System.out.println(this.conta.getNome());
	} // end method run
} // end class Deposito
