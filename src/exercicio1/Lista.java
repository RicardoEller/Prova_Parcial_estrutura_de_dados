package exercicio1;

public class Lista {
	No inicio, fim;
	
	// insere um no no final da lista. Esse metodo sera chamado pelo metodo inserir
	private void inserirFim(No aux) {
		if(inicio == null) {
			inicio = aux;
			fim = inicio;
		} else {
			fim.prox = aux;
		}
		fim = aux;
	}
	
	//esse metodo devera ser implementado de acordo com o enunciado do exercicio
	private void inserirPrioridade(No aux) {
		
		No atual = inicio;
		No anterior = null;
		boolean inseriu = false;
		
		while(atual != fim) {
			
			if(atual.cor.equalsIgnoreCase("verde")) {
				if(atual == inicio) {
					inicio = aux;
					inicio.prox = atual;
					inseriu = true;
					break;
				} else {
					No temp = atual;
					atual = aux;
					anterior.prox = atual;
					atual.prox = temp;
					inseriu = true;
					break;
				}
			}
			
			anterior = atual;
			atual = atual.prox;
			
		}
		
		if(!inseriu) inserirFim(aux);
			
	}
	
	// metodo inserir. Esse metodo sera chamado a partir da classe Main
	public void inserir(int numero, String cor) {
		No aux = new No(numero, cor);
		if(cor.equalsIgnoreCase("verde")) {
			inserirFim(aux);
		} else {
			inserirPrioridade(aux);
		}
	}
	
	// metodo utilizado para imprimir os dados da lista
	public void imprimir() {
		No aux = inicio;
		while(aux != null) {
			System.out.println(aux.numero);
			aux = aux.prox;
		}
	}
}