package pilha;

public class Conexao implements AutoCloseable {

	public Conexao() {
		System.out.println("abrindo conexao");
	}
	
	public void ledados() {
		System.out.println("lendo os dados");
		throw new IllegalStateException();
	}
	
//	public void FechaConexao() {
//		System.out.println("Fechando Conexao");
//	}

	@Override
	public void close() {
		System.out.println("Fechando a conexao");
		
	}
	
}
