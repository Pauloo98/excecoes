package pilha;

public class Fluxo {

	public static void main(String[] args) {
		System.out.println("Inicio do main");
		metodo1();
		System.out.println("Fim do main");
	}

	public static void metodo1() {
		System.out.println("Inicio do metodo 1");
		try {
			metodo2();
		} catch (ArithmeticException | NullPointerException ex) {
			String msg = ex.getMessage();
			System.out.println("Exception  " + msg);
		} 
		System.out.println("Fim do metodo 1");
	}

	public static void metodo2() {
		System.out.println("Inicio do metodo 2");

		throw new ArithmeticException();

		
		
//		System.out.println("Fim do metodo 2");
	}

}
