package exercicio2;

public class Exercicio2 {

	public static void main(String args[]) {
		ContaCorrente cc = null;
		try {
			cc = new ContaCorrente(-1000);
			System.out.println("Saldo inicial: " + cc.getSaldo());
			cc.deposito(1000);
			cc.retirada(1000);
			System.out.println("Saldo final: " + cc.getSaldo());
		} catch (Exception e) {
			System.out.println(e.getMessage());
			System.out.print("Rastreabilidade de erro: ");
			e.printStackTrace();
		}
	}

}
