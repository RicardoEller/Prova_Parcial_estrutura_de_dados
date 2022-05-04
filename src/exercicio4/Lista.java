package exercicio4;

public class Lista {
	No inicio;
	No fim;
	
	public void imprimir() {
		No aux = inicio;
		while(aux != null) {
			System.out.println(aux.dado);
			aux = aux.dir;
		}
	}
	
	// metodo para inserir um elemento na lista.
	// a insercao deve manter a lista ordenada (ordem crescente)
	public void inserir(int dado) {

		No entrada = new No(dado);
		
		entrada.dir = null;
		No atual = inicio;
		
		if(inicio == null) {
			entrada.esq = null;
			inicio = entrada;
		} else if(dado > inicio.dado){
			while (atual.dir != null) {
				if(atual.dir.dado > dado) break;
				atual = atual.dir;
			}
			
			No copy = atual.dir;
			entrada.esq = atual;
			atual.dir = entrada;
			entrada.dir = copy;
		} else {
			No copy = inicio;
			inicio = entrada;
			inicio.dir = copy;
			copy.esq = inicio;
		}
		
	}
	
	// metodo para imprimir os elementos da lista

}