package exercicio3;

public class Exercicio3 {

	public static void main(String args[]){
		try{
		   int i = getAlgo();
		} catch (IndexOutOfBoundsException e1) {
		   System.out.println("Exceção 1");
		} catch (Exception e2){
		   System.out.println("Exceção 2");
		} finally {
		   System.out.println("Mais nada");
		}
		System.out.println("Adeus");
		}

	public static int getAlgo() {
		if(true)
			throw new IllegalArgumentException();
		else
			return 0;
	}
	
	
}
