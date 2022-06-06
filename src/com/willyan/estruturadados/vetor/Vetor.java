package com.willyan.estruturadados.vetor;

public class Vetor {

	private String[] elementos;
	private int tamanaho;

	public Vetor(int capacidade) {
		this.elementos = new String[capacidade];
		this.tamanaho = 0;
	}

	// Adicionar Elemento Final do Vetor - Opção 1
	/*
	 * public void adiciona(String elemento) { for(int i=0; i<this.elementos.length;
	 * i++) { if(this.elementos[i] == null) { this.elementos[i] = elemento; break; }
	 * } }
	 */

	/*
	 * public void adiciona(String elemento) throws Exception {
	 * 
	 * if (this.tamanaho < this.elementos.length) { this.elementos[this.tamanaho] =
	 * elemento; this.tamanaho++; }else { throw new
	 * Exception("Vetor já esta cheio, não é possível adicionar mais elementos."); }
	 * }
	 */

	public boolean adiciona(String elemento) {

		if (this.tamanaho < this.elementos.length) {
			this.elementos[this.tamanaho] = elemento;
			this.tamanaho++;
			return true;
		}
		return false;
	}

}
