package prodPlan;

public class Item {

	protected Parte parte;
	protected int quantidade;
	
	public Item(Parte parte, int quantidade) {
		super();
		this.parte = parte;
		this.quantidade = quantidade;
	}

	public Parte getParte() {
		return parte;
	}

	public void setParte(Parte parte) {
		this.parte = parte;
	}

	public int getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}
	
	public float calculaValor() {
		return parte.getValor() * this.quantidade;
	}
	
	public String toString() {
		return ("codigo:" + parte.cod
				+" nome:" + parte.nome
				+" quantidade:" + quantidade
				+" valor unitario:" + parte.valor
				+" comprimento:" + calculaValor());
	}
}
