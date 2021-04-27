package prodPlan;

public abstract class Parte {
	protected int cod;
	protected String nome, descricao;
	protected float valor;
	
	public Parte() { }

	public Parte(int cod, String nome, String descricao, float valor) {
		this.cod = cod;
		this.nome = nome;
		this.descricao = descricao;
		this.valor = valor;
	}
	
	public int getCod() {
		return cod;
	}

	public void setCod(int cod) {
		this.cod = cod;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public float getValor() {
		return valor;
	}

	public void setValor(float valor) {
		this.valor = valor;
	}

	public abstract float calculaValor();
	public abstract String toString();
}
