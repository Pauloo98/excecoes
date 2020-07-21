package pilha;

public class TestaConexao {
	public static void main(String[] args) {

		try (Conexao cone = new Conexao() ) {
			cone.ledados();
		} catch (IllegalStateException exe) {
			System.out.println("deu erro");
		}
		
		
		
//		Conexao con = null;
//
//		try {
//			con = new Conexao();
//			con.ledados();
//		} catch (IllegalStateException ex) {
//			System.out.println("Deu erro na conexao");
//		} finally {
//			con.FechaConexao();
//		}

	}

}
