package exercicio2;

public class Fila {

	No inicio, fim;
	
	// metodo para inserir um elemento no final da fila (enfileirar)
	public void enfileirar(Motorista motorista) {
		No aux = new No(motorista);
		if(inicio == null) {
			inicio = aux;
		} else {
			aux.esq = fim;
			fim.dir = aux;
		}
		fim = aux;
	}
	
	// metodo para desenfileirar um elemento da fila, ou seja, remover o primeiro elemento
	public void desenfileirar() {
		
		if(inicio == fim) {
			inicio = null;
			fim = inicio;
		} else {
			inicio.dir.esq = null;
			inicio = inicio.dir;
		}
			
	}
	
	// 1 <-> 2 <-> 3 <-> 4 <-> 5
	
	// metodo para exibir os dados (nome e placa) dos motoristas
	public void mostrarDados() {
		No aux = inicio;
		
		while (aux != null) {
			System.out.println(aux.motorista.getNome() + " || " + aux.motorista.getPlaca());
			aux = aux.dir;
		}
		
	}
}