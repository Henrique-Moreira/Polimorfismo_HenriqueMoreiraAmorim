package prodPlan;

public class Motor extends Parte {
	private float potencia, corrente;
	private int rpm;

	public Motor(int cod, String nome, String descricao, float valor, float potencia, float corrente, int rpm) {
        super(cod, nome, descricao, valor);
        this.potencia = potencia;
        this.corrente = corrente;
        this.rpm = rpm;
    }

	public float getPotencia() {
		return potencia;
	}

	public void setPotencia(float potencia) {
		this.potencia = potencia;
	}

	public float getCorrente() {
		return corrente;
	}

	public void setCorrente(float corrente) {
		this.corrente = corrente;
	}

	public int getRpm() {
		return rpm;
	}

	public void setRpm(int rpm) {
		this.rpm = rpm;
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
				+" potencia:" + this.potencia 
				+" corrente:" + this.corrente 
				+" rpm:" + this.rpm);
	}
}
