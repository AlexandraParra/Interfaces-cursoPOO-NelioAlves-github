package moelo.entidades;

import java.util.Date;

public class Prestacao {
	private Date dataVcto;
	private Double valor;
	
	public Prestacao() {
	}

	public Prestacao(Date dataVcto, Double valor) {
		this.dataVcto = dataVcto;
		this.valor = valor;
	}

	public Date getDataVcto() {
		return dataVcto;
	}

	public void setDataVcto(Date dataVcto) {
		this.dataVcto = dataVcto;
	}

	public Double getValor() {
		return valor;
	}

	public void setValor(Double valor) {
		this.valor = valor;
	}
}
