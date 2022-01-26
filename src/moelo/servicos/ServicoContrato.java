package moelo.servicos;

import java.util.Calendar;
import java.util.Date;

import moelo.entidades.Contrato;
import moelo.entidades.Prestacao;

public class ServicoContrato {
	
	private ServicoPagoOnline servicoPagoOnline;
	
	public ServicoContrato(ServicoPagoOnline servicoPagoOnline) {
		this.servicoPagoOnline = servicoPagoOnline;
	}
	
	public void processoContrato(Contrato contrato, int meses) {
		double parcelaBasica = contrato.getTotalValor()/meses; 
		for (int i=1; i<=meses; i++) {
			Date data = adicionarMes(contrato.getData(), i);
			double parcela = parcelaBasica + servicoPagoOnline.interesse(parcelaBasica, i);
			double parcelaTotal = parcela + servicoPagoOnline.taxa(parcela);
			contrato.adicionarPrestacao(new Prestacao(data, parcelaTotal));
		}
	}
	
	public Date adicionarMes(Date data, int n) {
		Calendar cal = Calendar.getInstance();
		cal.setTime(data);
		cal.add(Calendar.MONTH, n);
		return cal.getTime();
	}
}
