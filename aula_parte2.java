class Conta{
	int numero;
	Cliente titular;
	double saldo;
	double limite;

	void saca(double valor){
		this.saldo = this.saldo - valor;
	}

	void deposita(double valor){
		this.saldo = this.saldo + valor;
	}
}

class Cliente{
	String nome;
	String endereco;
}

class TesteModificador{
	public static void main(String args[]){
		Conta joao = new Conta();
		joao.numero = 123;

		joao.deposita(500.0);
		
		double valorASerSacado = 700;

		if (valorASerSacado>joao.saldo){
			System.out.println("Saque invalido");
		}else{
			joao.saca(valorASerSacado);	
		}

		System.out.println(joao.saldo);

	}
}