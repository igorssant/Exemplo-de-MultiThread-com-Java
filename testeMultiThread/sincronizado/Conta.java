public class Conta{
	// private static short id = 0;
	private String nomePessoa;
	private int idade;
	private String endereco;

	public Conta(){/* Construtor vazio*/}

	public Conta(String _nomePessoa, int _idade, String _endereco){
		this.nomePessoa = _nomePessoa;
		this.idade = _idade;
		this.endereco = _endereco;
	}

	public void setNome(String _nome){
		this.nomePessoa = _nome;
	}// end method setNome

	public String getNome(){
		synchronized(this){
			return this.nomePessoa;
		}
	} // end method getNome

	/* FORMA 2 DE ACIMA*/
//	public synchronized String getNome(){
//		return this.nomePessoa;
//	} // end of method getNome

	public void setIdade(int _idade){
		this.idade = _idade;
	} // end method setIdade

	public int getIdade(){
		return this.idade;
	} // end of method getIdade

	public void setEndereco(String _endereco){
		this.endereco = _endereco;
	} // end method setEndereco

	public String getEndereco(){
		return this.endereco;
	} // end method getEndereco
}
