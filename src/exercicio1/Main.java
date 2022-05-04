package exercicio1;

public class Main {
	public static void main(String[] args) {
		
		Lista lista = new Lista();
		
		// insercao de objetos na lista
		lista.inserir(10, "verde");
		lista.inserir(11, "verde");		
		lista.inserir(5, "amarelo");
		lista.inserir(6, "amarelo");
		lista.inserir(12, "verde");
		
		// impressao dos objetos inseridos na lista
		print(lista);

		
	}

	private static void print(Lista lista) {
		No atual = lista.inicio;
		boolean first = true;
		
		while (atual != null) {
			if(first) {
				System.out.print("["+ atual.numero + "|" + atual.cor + "]");
				first = false;
			} else {
				System.out.print(" -> [" + atual.numero + "|" + atual.cor + "]");				
			}
			atual = atual.prox;
		}
		System.out.println("");
	}
}