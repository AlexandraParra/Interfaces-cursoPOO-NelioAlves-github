package moelo.entidades;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Contrato {
	private Integer numero;
	private Date data;
	private Double totalValor;
	
	private List <Prestacao> prestacoes = new ArrayList<>();
	
	public Contrato() {
	}

	public Contrato(Integer numero, Date data, Double totalValor) {
		this.numero = numero;
		this.data = data;
		this.totalValor = totalValor;
	}

	public Integer getNumero() {
		return numero;
	}

	public void setNumero(Integer numero) {
		this.numero = numero;
	}

	public Date getData() {
		return data;
	}

	public void setData(Date data) {
		this.data = data;
	}

	public Double getTotalValor() {
		return totalValor;
	}

	public void setTotalValor(Double totalValor) {
		this.totalValor = totalValor;
	}

	public List<Prestacao> getPrestacoes() {
		return prestacoes;
	}

	public void adicionarPrestacao(Prestacao prestacao) {
		prestacoes.add(prestacao);
	}
	
	public void removerPrestacao(Prestacao prestacao) {
		prestacoes.remove(prestacao);
	}
}
