package prodPlan;

public class Parafuso extends Parte {
	private float comprimento, diametro;

	public Parafuso(int cod, String nome, String descricao, float valor, float comprimento, float diametro) {
        super(cod, nome, descricao, valor);
        this.comprimento = comprimento;
        this.diametro = diametro;
    }

	public float getComprimento() {
		return comprimento;
	}

	public void setComprimento(float comprimento) {
		this.comprimento = comprimento;
	}

	public float getDiametro() {
		return diametro;
	}

	public void setDiametro(float diametro) {
		this.diametro = diametro;
	}

	@Override
	public float calculaValor() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public String toString() {
		return ("codigo:" + this.cod
				+" nome:" + this.nome 
				+" descricao:" + this.descricao 
				+" valor:" + this.valor 
				+" comprimento:" + this.comprimento
				+" diametro:" + this.diametro);
	}

}
