package main;

import java.util.ArrayList;
import java.util.List;

import entities.Produto;

public class TesteComparaArray {

	public static List<Produto> origem = new ArrayList<Produto>();
	public static List<Produto> destino = new ArrayList<Produto>();
	public static List<Produto> novo = new ArrayList<Produto>();
	public static List<Produto> excluir = new ArrayList<Produto>();

	public static void main(String[] args) {
		pupulaArray();
		int p = -1;
		for (int i = 0; i < origem.size(); i++) {
			p = destino.indexOf(origem.get(i));
			if (p >= 0) {
				if (!origem.get(i).getPreco().equals(destino.get(p).getPreco())) {
					novo.add(origem.get(i));
				}
			} else {
				novo.add(origem.get(i));
			}
		}

		for (int i = 0; i < destino.size(); i++) {
			p = origem.indexOf(destino.get(i));
			if (p < 0) {
				excluir.add(destino.get(i));
			}
		}
		
		System.err.println("Origem");
		for (int i = 0; i < origem.size(); i++) {
			System.out.println(origem.get(i));
		}
		
		System.err.println("Destino");
		for (int i = 0; i < destino.size(); i++) {
			System.out.println(destino.get(i));
		}
		
		for (int i = 0; i < novo.size(); i++) {
			System.err.println("Novo");
			System.out.println(novo.get(i));
		}
		for (int i = 0; i < excluir.size(); i++) {
			System.err.println("Excluir");
			System.out.println(excluir.get(i));
		}

	}

	public static void pupulaArray() {
		for (int i = 0; i < 10; i++) {
			Produto produto = new Produto(i, "produto" + i, i * (15f));
			origem.add(produto);
			destino.add(produto);
		}
		origem.add(new Produto(11, "produtoExtra", 120f));
		origem.remove(5);
	}

}
