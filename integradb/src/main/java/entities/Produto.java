package entities;

public class Produto {

	private int id;
	private String descricao;
	private Float preco;

	public Produto(int i, String string, Float j) {
		this.id = i;
		this.descricao = string;
		this.preco = j;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public Float getPreco() {
		return preco;
	}

	public void setPreco(Float preco) {
		this.preco = preco;
	}

	@Override
	public boolean equals(Object obj) {
		if (this.descricao.equals(((Produto) obj).getDescricao())) {
			return true;
		}
		return false;
	}

	@Override
	public String toString() {
		return descricao + " - " + preco;
	}
}
